package com.dp.without;

public class WithoutBuilderMain {

    public static void main(String[] args) {
        SimpleEntity1 s1 = new SimpleEntity1();
        SimpleEntity2 s2 = new SimpleEntity2();
        ComplexEntity complexEntity = new ComplexEntity();
        complexEntity.createComplexEntity(s1, s2);
    }
}
