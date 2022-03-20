package com.company.javaCore.worker;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                errorCallback.onError("Task " + i + " is failure");
            }
            callback.onDone("Task " + i + " is done");
        }
    }


}
