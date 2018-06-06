package com.dp.observer;

public class ObserverA implements IObserver {

    @Override
    public void update() {
        System.out.println("ObserverA update ...");
    }

}
