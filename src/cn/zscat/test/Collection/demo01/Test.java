package cn.zscat.test.Collection.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
题目：
    请使用Arrays相关的API，将一个随机字符串的所有字符升序排列，并倒序打印
 */


public class Test {
    public static void main(String[] args) {
        String str="isoaudfgbnjafuihfgyaiuf";
        char[] c=str.toCharArray();
        Arrays.sort(c);
        for (int i = c.length-1; i >=0 ; i--) {
            if (i==0){
                System.out.println(c[i]);
            }else{
                System.out.print(c[i]+",");
            }


        }

    }
}
