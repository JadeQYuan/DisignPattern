package com.dp.composite;

public class CompositeMain {

    public static void main(String[] args) {
        Node node = new Node("1", "root", "");
        Node node1 = new Node("2", "composite1", "1");
        Node node2 = new Node("3", "leaf1", "1");
        Node node3 = new Node("4", "leaf2", "2");

        node1.add(node3);
        node.add(node1);
        node.add(node2);

        node.print();
    }

}
