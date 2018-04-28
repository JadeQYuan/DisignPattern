package com.dp.hungrySignleton;

public class HungrySingletonMain {

    public static void main(String[] args) {

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        hungrySingleton.singletonInfo();

        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        hungrySingleton2.singletonInfo();

        HungrySingleton hungrySingleton3 = HungrySingleton.getInstance();
        hungrySingleton3.singletonInfo();

    }

}
