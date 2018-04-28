package com.dp.lazySingleton;

public class LazySingletonMain {

    public static void main(String[] args) {

        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.singletonInfo();

        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        lazySingleton2.singletonInfo();

        LazySingleton lazySingleton3 = LazySingleton.getInstance();
        lazySingleton3.singletonInfo();

    }

}
