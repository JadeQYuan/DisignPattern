package com.dp.facade;

public class Facade {

    private IModule moduleA = new ModuleA();
    private IModule moduleB = new ModuleB();

    public void print(){
        moduleA.print();
        moduleB.print();
    }

}
