package com.dp.observer;

public class ObserverB implements IObserver {

    @Override
    public void update() {
        System.out.println("ObserverB update ...");
    }

}
