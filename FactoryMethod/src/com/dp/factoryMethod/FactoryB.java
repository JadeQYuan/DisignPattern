package com.dp.factoryMethod;

public class FactoryB extends Factory{

    @Override
    public IEntity create() {
        return new EntityB();
    }

}
