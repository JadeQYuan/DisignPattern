package com.dp.without;

public class WithOutFactoryMethodMain {

    public static void main(String[] args) {

        WithOutEntity1 withOutEntity1 = new WithOutEntity1();
        withOutEntity1.doMethod1();
        withOutEntity1.doMethod2();

        WithOutEntity2 withOutEntity2 = new WithOutEntity2();
        withOutEntity2.doMethod1();
        withOutEntity2.doMethod2();

    }
}
