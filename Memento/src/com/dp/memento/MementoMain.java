package com.dp.memento;

public class MementoMain {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("1");
        careTaker.save(originator.save());

        originator.setState("2");
        careTaker.read();
    }

}
