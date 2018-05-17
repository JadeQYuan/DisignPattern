package com.dp.prototype;

public class PrototypeMain {

    public static void main(String[] args) {
        IEntity entity1 = new Entity();
        IEntity entity2 = (IEntity) entity1.clone();
        System.out.println(entity1.hashCode());
        System.out.println(entity2.hashCode());
    }

}
