package com.dp.iterator;

public class IteratorMain {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator iterator = aggregate.iterator();
        if(iterator.hasNext()){
            iterator.next();
        }
    }

}
