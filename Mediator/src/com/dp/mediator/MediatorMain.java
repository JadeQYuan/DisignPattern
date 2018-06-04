package com.dp.mediator;

public class MediatorMain {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        ColleagueA colleagueA = new ColleagueA(mediator);
        ColleagueB colleagueB = new ColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.print();
        colleagueB.print();
    }

}
