package com.dp.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Context context = new Context(new Strategy1());
        context.operator();

        context = new Context(new Strategy2());
        context.operator();

        context = new Context(new Strategy3());
        context.operator();
    }

}
