package com.dp.state;

public class StateB implements IState {

    @Override
    public void print(Context context) {
        System.out.println("StateB print ...");
        context.setState(new StateA());
    }

}
