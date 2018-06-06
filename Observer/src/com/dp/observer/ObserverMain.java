package com.dp.observer;

public class ObserverMain {

    public static void main(String[] args) {
        Subject subject = new Subject();
        IObserver observerA = new ObserverA();
        IObserver observerB = new ObserverB();

        subject.addObserver(observerA);
        subject.change();

        subject.addObserver(observerB);
        subject.change();
    }

}
