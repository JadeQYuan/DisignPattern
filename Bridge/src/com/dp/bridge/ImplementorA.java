package com.dp.bridge;

public class ImplementorA implements IImplementor{

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName());
    }

}
