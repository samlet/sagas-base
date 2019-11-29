package com.sagas.actions.testings;

import com.sagas.actions.ActionRequest;
import com.sagas.actions.ActionResponse;
import com.sagas.actions.RemoteAction;

public class TestingActions {
    @RemoteAction
    public ActionResponse simple(ActionRequest request) {
        System.out.println(".. testings");
        return new ActionResponse(0);
    }
}

