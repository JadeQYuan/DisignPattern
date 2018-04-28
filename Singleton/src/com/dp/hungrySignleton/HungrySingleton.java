package com.dp.hungrySignleton;

public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    public static void singletonInfo(){
        System.out.println("hungrySingleton.hashCode = " + hungrySingleton.hashCode());
    }

}
