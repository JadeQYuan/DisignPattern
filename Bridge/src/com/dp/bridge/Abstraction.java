package com.dp.bridge;

public abstract class Abstraction {

    IImplementor implementor;

    public void print(){
        implementor.print();
    }

}
