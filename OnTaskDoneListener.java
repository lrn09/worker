package com.company.javaCore.worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
