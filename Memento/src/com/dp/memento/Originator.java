package com.dp.memento;

public class Originator {

    private String state;

    public void setState(String state) {
        System.out.println("state changed : " + state);
        this.state = state;
    }

    public Memento save(){
        return new Memento(state);
    }

}
