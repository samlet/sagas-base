package com.sagas.actions;

import com.google.common.collect.Maps;
import com.google.inject.Injector;
import org.apache.commons.io.IOUtils;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import javax.inject.Singleton;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;

@Singleton
public class ActionsManager {
    private Actions actions;
    private Map<String, ActionInvoker> invokerMap= Maps.newConcurrentMap();

    public ActionsManager() {
    }

    public void initializeActions(Injector injector) throws FileNotFoundException{
        Yaml yaml = new Yaml(new Constructor(Actions.class));
        this.actions=yaml.load(new FileReader("conf/actions.yml"));

        actions.getActions().forEach(meta ->{
            // Resolve 'type'.
            Class<?> runner;
            try {
                runner = Class.forName(meta.getClassName());
                Object inst=injector.getInstance(runner);
                // Object inst=runner.newInstance();
                Method[] methods = runner.getMethods();
                for (Method method : methods) {
                    RemoteAction annos = method.getAnnotation(RemoteAction.class);
                    if (annos != null) {
                        String actionName=runner.getSimpleName()+"."+method.getName();
                        invokerMap.put(actionName, new ActionInvoker(inst, method));
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        });
    }

    public Actions getActions() {
        return actions;
    }

    public ActionInvoker getInvoker(String actionName){
        return this.invokerMap.get(actionName);
    }

    public Set<String> getActionNames(){
        return this.invokerMap.keySet();
    }
}
