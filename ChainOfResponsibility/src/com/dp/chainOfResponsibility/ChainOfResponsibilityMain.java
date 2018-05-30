package com.dp.chainOfResponsibility;

public class ChainOfResponsibilityMain {

    public static void main(String[] args) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        handlerA.setNextHandler(handlerB);
        handlerA.handle();
    }

}
