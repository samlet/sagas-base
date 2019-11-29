package com.sagas.actions;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertNotNull;
import com.sagas.actions.*;

public class TestActions {
    @Test
    public void testBase(){
        System.out.println(". base");
    }

    @Test
    public void testActionsManager() throws FileNotFoundException, InvocationTargetException, IllegalAccessException {
        Injector injector= Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                super.configure();
            }
        });
        ActionsManager actionsManager=injector.getInstance(ActionsManager.class);
        // ActionsManager actionsManager=new ActionsManager();
        actionsManager.initializeActions(injector);
        System.out.println( actionsManager.getActionNames());

        ActionRequest req=new ActionRequest("SimpleActions.simple");
        ActionInvoker invoker=actionsManager.getInvoker(req.getActionName());
        assertNotNull(invoker);
        ActionResponse resp= invoker.execute(req);
        System.out.println(resp.getCode());
    }
}
