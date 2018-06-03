package com.dp.iterator;

public class ConcreteAggregate implements Aggregate {

    @Override
    public Iterator iterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator {
        @Override
        public Object next() {
            System.out.println("ConcreteIterator next ...");
            return null;
        }

        @Override
        public boolean hasNext() {
            System.out.println("ConcreteIterator hasNext ....");
            return true;
        }
    }
}
