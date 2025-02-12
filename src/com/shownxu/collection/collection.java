package com.shownxu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collection {
    //Collection接口的使用
    public static void main(String[] args) {
        //①.添加元素
        Collection coll = new ArrayList();
        coll.add("cat");
        coll.add("dog");
        coll.add("hen");
        System.out.println("元素个数："+coll.size());
        System.out.println(coll);
        System.out.println("-----------------------------------");
        //②.删除元素
        coll.remove("cat");
        System.out.println("元素个数："+coll.size());
        System.out.println(coll);
        System.out.println("-----------------------------------");
        //③.遍历元素
        //增强for遍历
        System.out.println("增强for循环遍历：");
        for (Object o : coll){
            System.out.println(o);
        }
        System.out.println("-----------------------------------");
        //迭代器
        System.out.println("迭代器遍历");
        Iterator it = coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----------------------------------");
        //④.判断
        System.out.println(coll.contains("cat"));
        System.out.println(coll.contains("dog"));

    }

}
