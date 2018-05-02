package com.dp.factoryMethod;

public class FactoryMethodMain {

    public static void main(String[] args) {

        Factory factory = new Factory();
        IEntity entity1 = factory.createEntityByName("com.dp.factoryMethod.Entity1");
        entity1.doMethod1();
        entity1.doMethod2();

        IEntity entity2 = factory.createEntityByClass(new Entity2().getClass());
        entity2.doMethod1();
        entity1.doMethod2();

    }
}
