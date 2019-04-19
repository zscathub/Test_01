package cn.zscat.test.Collection.demo01;

import java.util.Arrays;
import java.util.Random;

public class Arrays_test {
    public static void main(String[] args) {
        int []a=new int[20];
        Random r =new Random();
        for (int i = 0; i <a.length ; i++) {
            a[i]=r.nextInt(20)+1;
        }



        Arrays.sort(a);
        System.out.println(Arrays.toString(a));






    }

}
