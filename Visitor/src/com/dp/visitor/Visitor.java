package com.dp.visitor;

public class Visitor implements IVisitor {

    @Override
    public void visit(ElementA element) {
        System.out.println("ElementA visit ... ");
    }

    @Override
    public void visit(ElementB element) {
        System.out.println("ElementB visit ... ");
    }

}
