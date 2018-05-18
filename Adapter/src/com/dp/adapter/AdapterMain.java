package com.dp.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        Adapter1 adapter1 = new Adapter1();
        ITarget target = adapter1.convert(new Adaptee());
        target.show();

        Adapter2 adapter2 = new Adapter2();
        adapter2.show();
    }

}
