package com.dp.adapter;

public class Target implements ITarget{

    public Target(){
        System.out.println("create target...");
    }

    @Override
    public void show() {
        System.out.println(this.getClass().getSimpleName());
    }
}
