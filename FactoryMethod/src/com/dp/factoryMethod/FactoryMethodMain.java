package com.dp.factoryMethod;

public class FactoryMethodMain {

    public static void main(String[] args) {

        Factory factory = new FactoryA();
        factory.create();
        
        factory = new FactoryB();
        factory.create();

    }
}
