package com.sagas.actions;

public class SimpleActions {
    @RemoteAction
    public ActionResponse simple(ActionRequest request) {
        System.out.println(".. action");
        return new ActionResponse(0);
    }
}

