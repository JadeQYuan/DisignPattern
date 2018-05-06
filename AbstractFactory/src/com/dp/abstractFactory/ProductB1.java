package com.dp.abstractFactory;

public class ProductB1 implements Product1 {

    public ProductB1(){
        System.out.println("Product : " + this.getClass().getSimpleName());
    }

}
