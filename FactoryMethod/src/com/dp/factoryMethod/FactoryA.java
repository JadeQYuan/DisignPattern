package com.dp.factoryMethod;

public class FactoryA extends Factory{

    @Override
    public IEntity create() {
        return new EntityA();
    }

}
