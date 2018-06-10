package com.dp.state;

public class StateMain {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new StateA());
        context.print();
        context.print();
    }

}
