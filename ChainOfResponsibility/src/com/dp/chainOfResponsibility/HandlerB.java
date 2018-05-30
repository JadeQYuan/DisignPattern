package com.dp.chainOfResponsibility;

public class HandlerB extends Handler{
    
    @Override
    public void handle() {
        if(nextHandler == null){
            System.out.println("HandlerB handle ...");
        }else{
            nextHandler.handle();
        }
    }
}
