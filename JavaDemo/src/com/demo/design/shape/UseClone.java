package com.demo.design.shape;

import com.demo.design.Shape;

import java.util.HashMap;
import java.util.Hashtable;

public class UseClone {
    //维护这个注册表
    private static Hashtable<String, Object> obj = new Hashtable<String, Object>();
    public static void main(String[] args) {
        ClazzA clazzA = new ClazzA();
        clazzA.setShapeId("1");
        obj.put(clazzA.getShapeId(), clazzA);

        ClazzB clazzB = new ClazzB();
        clazzB.setShapeId("2");
        obj.put(clazzB.getShapeId(), clazzB);


        System.out.println("-----------");
        ClazzA a = (ClazzA) getShapeClone(clazzA.getShapeId());
        System.out.println(clazzA == a);
        System.out.println(a.getShapeId());

    }

    public static Object getShapeClone(String id){
        ClazzA clazzA = (ClazzA) obj.get(id);
        ClazzA a = (ClazzA) clazzA.clone();
        return a;
    }



}
