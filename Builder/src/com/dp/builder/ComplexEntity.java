package com.dp.builder;

public class ComplexEntity {

    public ComplexEntity(){
        System.out.println("create complexEntity ...");
    }

    public void setSimpleEntityA(ISimpleEntityA a){
        System.out.println("complexEntity set simpleEntityA ...");
    }

    public void setSimpleEntityB(ISimpleEntityB b){
        System.out.println("complexEntity set simpleEntityB ...");
    }

}
