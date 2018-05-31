package com.dp.command;

public class ConcreteCommandA implements ICommand {

    private Receiver receiver;

    public ConcreteCommandA(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("ConcreteCommandA execute ...");
        receiver.execute();
    }
}
