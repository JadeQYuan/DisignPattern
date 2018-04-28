package com.dp.lazySingleton;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){
    }

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static void singletonInfo(){
        System.out.println("lazySingleton.hashCode = " + lazySingleton.hashCode());
    }

}
