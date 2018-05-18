package com.dp.adapter;

public class Adapter2 implements ITarget,IAdaptee{

    @Override
    public void show() {
        System.out.println(this.getClass().getSimpleName());
    }
}
