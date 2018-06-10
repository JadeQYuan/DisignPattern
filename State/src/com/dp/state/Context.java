package com.dp.state;

public class Context {

    private IState state;

    public Context(){
        this.state = null;
    }

    public void setState(IState state){
        this.state = state;
        System.out.println("setState : " + state.getClass().getSimpleName());
    }

    public void print(){
        state.print(this);
    }
}
