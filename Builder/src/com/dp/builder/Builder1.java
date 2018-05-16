package com.dp.builder;

public class Builder1 implements IBuilder{

    ComplexEntity complexEntity = new ComplexEntity();

    @Override
    public void createSimpleEntityA() {
        complexEntity.setSimpleEntityA(new SimpleEntityA1());
    }

    @Override
    public void createSimpleEntityB() {
        complexEntity.setSimpleEntityB(new SimpleEntityB1());
    }

    @Override
    public ComplexEntity createComplexEntity() {
        return complexEntity;
    }
}
