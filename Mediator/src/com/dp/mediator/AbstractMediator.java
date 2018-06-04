package com.dp.mediator;

public abstract class AbstractMediator {

    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public abstract void executeToA();
    public abstract void executeToB();

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
