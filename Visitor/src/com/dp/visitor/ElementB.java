package com.dp.visitor;

public class ElementB implements IElement {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

}
