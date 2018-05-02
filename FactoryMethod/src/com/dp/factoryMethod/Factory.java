package com.dp.factoryMethod;

public class Factory {

    public IEntity createEntityByName (String className){
        IEntity entity = null;
        try {
            entity = (IEntity) ClassLoader.getSystemClassLoader().loadClass(className).newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return entity;
    }

    public IEntity createEntityByClass(Class clz){
        IEntity entity = null;
        try {
            entity = (IEntity) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entity;
    }

}
