package com.fs.voldemort.func.action;

@FunctionalInterface
public interface Action2<T1, T2> {

    void apply(T1 param1, T2 param2);
    
}
