package com.dp.builder;

public interface IBuilder {

    void createSimpleEntityA();

    void createSimpleEntityB();

    ComplexEntity createComplexEntity();
}
