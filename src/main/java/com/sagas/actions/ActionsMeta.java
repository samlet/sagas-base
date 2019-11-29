package com.sagas.actions;

public class ActionsMeta {
    public static final String module = ActionsMeta.class.getName();
    private String type;
    private String className;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
