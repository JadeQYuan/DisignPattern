package com.dp.template;

public abstract class AbstractTemplate {

    abstract void print1();

    abstract void print2();

    public final void execute(){
        this.print1();
        this.print2();
    }

}
