package com.dp.proxy;

public class Proxy implements IProxy{

    private IProxy proxy;

    public Proxy(IProxy proxy){
        this.proxy = proxy;
    }

    @Override
    public void print() {
        proxy.print();
    }

}
