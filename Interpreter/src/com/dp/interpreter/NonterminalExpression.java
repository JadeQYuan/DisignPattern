package com.dp.interpreter;

public class NonterminalExpression implements IExpression {

    private TerminalExpression terminalExpressionA, terminalExpressionB;

    public NonterminalExpression(TerminalExpression terminalExpressionA, TerminalExpression terminalExpressionB){
        this.terminalExpressionA = terminalExpressionA;
        this.terminalExpressionB = terminalExpressionB;
    }

    @Override
    public void interpreter() {
        terminalExpressionA.interpreter();
        terminalExpressionB.interpreter();
        System.out.println("interpreter terminalExpressionA AND  terminalExpressionB ...");
    }

}
