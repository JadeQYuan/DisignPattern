package com.dp.visitor;

public class VisitorMain {

    public static void main(String[] args) {
        IElement element = new ElementA();
        IVisitor visitor = new Visitor();
        element.accept(visitor);

        element = new ElementB();
        element.accept(visitor);
    }

}
