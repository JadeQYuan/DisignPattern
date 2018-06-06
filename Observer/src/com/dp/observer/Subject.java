package com.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<IObserver> observerList = new ArrayList<>();

    public void addObserver(IObserver observer){
        if(!observerList.contains(observer)){
            observerList.add(observer);
        }
    }

    public void change (){
        System.out.println("Subject change ...");
        notifyObservers();
    }

    public void notifyObservers(){
        for(IObserver observer : observerList){
            observer.update();
        }
    }

}
