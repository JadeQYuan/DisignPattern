package com.dp.builder;

public class Builder2 implements IBuilder{

    ComplexEntity complexEntity = new ComplexEntity();

    @Override
    public void createSimpleEntityA() {
        complexEntity.setSimpleEntityA(new SimpleEntityA2());
    }

    @Override
    public void createSimpleEntityB() {
        complexEntity.setSimpleEntityB(new SimpleEntityB2());
    }

    @Override
    public ComplexEntity createComplexEntity() {
        return complexEntity;
    }
}
