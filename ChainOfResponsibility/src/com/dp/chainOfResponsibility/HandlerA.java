package com.dp.chainOfResponsibility;

public class HandlerA extends Handler{

    @Override
    public void handle() {
        if(nextHandler == null){
            System.out.println("HandlerA handle ...");
        }else{
            nextHandler.handle();
        }
    }
}
