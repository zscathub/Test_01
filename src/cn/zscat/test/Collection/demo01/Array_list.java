package cn.zscat.test.Collection.demo01;

import java.util.ArrayList;
import java.util.Random;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        ArrayList<Integer> list1=new ArrayList<>();
        Random r =new Random();
        for (int i = 0; i < 20; i++) {
            int num= r.nextInt(50);
            list.add(num);
        }
        list1=check(list);

        System.out.println(list);
        System.out.println(list1);
    }

    public static ArrayList<Integer> check(ArrayList list){
        ArrayList<Integer> list1=new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            if ((int)list.get(i)%2==0){
                list1.add((int)list.get(i));

            }
        }
        return list1;
    }

}
