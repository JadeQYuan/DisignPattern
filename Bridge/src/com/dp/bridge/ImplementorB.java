package com.dp.bridge;

public class ImplementorB implements IImplementor{

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName());
    }

}
