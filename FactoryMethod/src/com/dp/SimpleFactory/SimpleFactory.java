package com.dp.SimpleFactory;

public class SimpleFactory {

    public IEntity create(String type){
        IEntity entity = null;
        if(type.equals("A")){
            entity = new EntityA();
        }else if(type.equals("B")){
            entity = new EntityB();
        }
        return entity;
    }

}
