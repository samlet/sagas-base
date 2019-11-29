package com.sagas.actions;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ActionInvoker {
    private Object object;
    private Method method;
    public ActionInvoker(Object object, Method method){
        this.object=object;
        this.method=method;
    }

    public ActionResponse execute(ActionRequest r) throws InvocationTargetException, IllegalAccessException {
        return (ActionResponse)this.method.invoke(object, r);
    }

    public Object getObject() {
        return object;
    }

    public Method getMethod() {
        return method;
    }
}
