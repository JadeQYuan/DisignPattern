package com.dp.chainOfResponsibility;

public abstract class Handler {

    protected Handler nextHandler = null;

    public abstract void handle();

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
