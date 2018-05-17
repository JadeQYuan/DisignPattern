package com.dp.prototype;

public class Entity implements IEntity{

    public Entity(){
        System.out.println("create entity ...");
    }

    @Override
    public Object clone() {
        Entity entity = null;
        try {
            entity = (Entity) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return entity;
    }

}
