package com.dp.mediator;

public class ColleagueA {

    private AbstractMediator mediator;

    public ColleagueA(AbstractMediator mediator){
        this.mediator = mediator;
    }

    public void print(){
        System.out.println("ColleagueA print ... ");
        mediator.executeToB();
    }

}
