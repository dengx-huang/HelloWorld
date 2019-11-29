package com.demo.design;

/**
 * 设计模式--原型模式
 * 三个角色：
 * 1、原型角色：抽象类/接口
 * 2、具体原型角色：实现原型角色接口，并重写克隆方法
 * 3、使用者角色：负责维护一个具体原型角色的注册表，负责找出具体原型角色进行复制，返回新的对象
 */
public abstract class Shape implements Cloneable{
    private String shapeId;
    protected String type;

    public abstract void drow();

    public String getShapeId() {
        return shapeId;
    }

    public void setShapeId(String shapeId) {
        this.shapeId = shapeId;
    }

    public String getType() {
        return type;
    }


    @Override
    public Object clone() {
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }
}
