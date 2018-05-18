package com.dp.adapter;

public class Adapter1 implements IAdaptee{

    ITarget target;

    public ITarget convert(IAdaptee adaptee){
        if(adaptee != null){
            target = new Target();
        }
        return target;
    }

}
