package com.shownxu.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.shownxu.List.Student;

public class arrayList {
    public static void main(String[] args) {
        Student s1 = new Student("刘德华",20);
        Student s2 = new Student("郭富城",18);
        Student s3 = new Student("黎明",21);
        ArrayList arr = new ArrayList();
        //添加元素
        System.out.println("--------------------------------------");
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        System.out.println(arr);
        System.out.println(arr.toString());
        //删除元素
        System.out.println("--------------------------------------");
        arr.remove(s1);
        System.out.println(arr);
        //遍历list
        //1.增强for
        System.out.println("------------------增强for--------------------");
        for(Object o : arr){
            System.out.println(o);
        }
        //2.iterator
        System.out.println("------------------iterator--------------------");
        Iterator it = arr.iterator();
        while(it.hasNext()){

            System.out.println(it.next());
        }
        //3.listIterator
        System.out.println("----------------ListIterator----------------------");
        ListIterator lit = arr.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }

    }


}
