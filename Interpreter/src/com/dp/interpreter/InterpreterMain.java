package com.dp.interpreter;

public class InterpreterMain {

    public static void main(String[] args) {
        TerminalExpression expressionA = new TerminalExpression();
        TerminalExpression expressionB = new TerminalExpression();
        IExpression expression = new NonterminalExpression(expressionA, expressionB);
        expression.interpreter();
    }

}
