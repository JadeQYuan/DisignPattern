package com.dp.state;

public class StateA implements IState {

    @Override
    public void print(Context context) {
        System.out.println("StateA print ...");
        context.setState(new StateB());
    }

}
