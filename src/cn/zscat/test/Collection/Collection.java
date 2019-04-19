package cn.zscat.test.Collection;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> coll= new ArrayList<>();
        coll.add("hello");
        coll.add("hello_1");
        coll.add("hello_2");
        coll.add("hello_3");
        System.out.println(coll.get(3));
        System.out.println(coll.remove(2));
        System.out.println(coll);

        for (int i = 0; i <coll.size() ; i++) {
            System.out.println(coll.get(i));
        }




    }
}
