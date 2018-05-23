package com.dp.decorator;

public class Decorated implements IDecorated{

    @Override
    public void print() {
        System.out.println("decorated print ...");
    }

}
