package com.dp.abstractFactory;

public class ProductA1 implements Product1 {

    public ProductA1(){
        System.out.println("Product : " + this.getClass().getSimpleName());
    }

}
