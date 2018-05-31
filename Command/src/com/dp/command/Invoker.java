package com.dp.command;

public class Invoker {

    private ICommand concreteCommandA, concreteCommandB;

    public Invoker(ICommand concreteCommandA, ICommand concreteCommandB){
        this.concreteCommandA = concreteCommandA;
        this.concreteCommandB = concreteCommandB;
    }

    public void orderA(){
        concreteCommandA.execute();
    }

    public void orderB(){
        concreteCommandB.execute();
    }

}
