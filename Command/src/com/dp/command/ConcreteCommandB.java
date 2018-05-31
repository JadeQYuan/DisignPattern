package com.dp.command;

public class ConcreteCommandB implements ICommand {

    private Receiver receiver;

    public ConcreteCommandB(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("ConcreteCommandB execute ...");
        receiver.execute();
    }
}
