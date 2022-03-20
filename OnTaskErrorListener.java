package com.company.javaCore.worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String error);
}
