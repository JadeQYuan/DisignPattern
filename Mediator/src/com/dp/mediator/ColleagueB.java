package com.dp.mediator;

public class ColleagueB {

    private AbstractMediator mediator;

    public ColleagueB(AbstractMediator mediator){
        this.mediator = mediator;
    }

    public void print(){
        System.out.println("ColleagueB print ...");
        mediator.executeToA();
    }

}
