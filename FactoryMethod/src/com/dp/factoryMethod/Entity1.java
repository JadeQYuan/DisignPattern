package com.dp.factoryMethod;

public class Entity1 implements IEntity {

    @Override
    public void doMethod1() {
        System.out.println("Entity1.doMethod1");
    }

    @Override
    public void doMethod2() {
        System.out.println("Entity1.doMethod2");
    }
}
