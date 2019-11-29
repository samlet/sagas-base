package com.sagas.remote;

public interface ComponentProvider {
    <T> T inject(T object);
}

