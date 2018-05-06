package com.dp.abstractFactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new FactoryA();
        abstractFactory.create1();
        abstractFactory.create2();

        abstractFactory = new FactoryB();
        abstractFactory.create1();
        abstractFactory.create2();
    }
}
