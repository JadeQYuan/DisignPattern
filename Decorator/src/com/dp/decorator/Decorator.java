package com.dp.decorator;

public abstract class Decorator implements IDecorated {

    private IDecorated decorated;

    public Decorator(IDecorated decorated){
        this.decorated = decorated;
    }

    public void print(){
        decorated.print();
    }

}
