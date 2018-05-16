package com.dp.builder;

public class Director {

    public ComplexEntity create1(){
        IBuilder builder = new Builder1();
        builder.createSimpleEntityA();
        builder.createSimpleEntityB();
        return builder.createComplexEntity();
    }

    public ComplexEntity create2(){
        IBuilder builder = new Builder2();
        builder.createSimpleEntityA();
        builder.createSimpleEntityB();
        return builder.createComplexEntity();
    }

}
