package com.dp.bridge;

public class ConcreteAbstraction extends Abstraction{

    public ConcreteAbstraction(IImplementor implementor){
        super.implementor = implementor;
    }

    public void print(){
        super.print();
    }

}
