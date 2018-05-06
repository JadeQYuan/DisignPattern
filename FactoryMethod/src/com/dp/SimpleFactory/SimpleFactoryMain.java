package com.dp.SimpleFactory;

public class SimpleFactoryMain {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.create("A");
        simpleFactory.create("B");
    }
}
