package com.dp.without;

public class WithoutSingletonMain {

    public static void main(String[] args) {
        WithoutSingleton withoutSingleton = new WithoutSingleton();
        WithoutSingleton.withoutSingletonInfo(withoutSingleton);

        WithoutSingleton withoutSingleton2 = new WithoutSingleton();
        WithoutSingleton.withoutSingletonInfo(withoutSingleton2);

        WithoutSingleton withoutSingleton3 = new WithoutSingleton();
        WithoutSingleton.withoutSingletonInfo(withoutSingleton3);
    }
}
