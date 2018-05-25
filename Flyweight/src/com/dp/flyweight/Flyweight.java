package com.dp.flyweight;

public class Flyweight implements IFlyweight {

    private String id;

    public Flyweight(String id){
        this.id = id;
    }

    @Override
    public void print() {
        System.out.println("Flyweight.id = " + getId() + " ...");
    }

    public String getId() {
        return id;
    }

}
