package com.dp.memento;

public class CareTaker {

    private Memento memento;

    public void save(Memento memento){
        System.out.println("Memento save ..." + memento.getState());
        this.memento = memento;
    }

    public Memento read(){
        System.out.println("Memento read ..." + memento.getState());
        return memento;
    }

}
