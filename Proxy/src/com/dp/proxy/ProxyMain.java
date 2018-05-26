package com.dp.proxy;

public class ProxyMain {

    public static void main(String[] args) {
        IProxy proxy = new Proxy(new ProxiedA());
        proxy.print();
        proxy = new Proxy(new ProxiedB());
        proxy.print();
    }

}
