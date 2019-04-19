package cn.zscat.niuke;

import java.util.Scanner;

/*
题目描述
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

 */
public class Test_12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double base=scan.nextDouble();
        int exponent=scan.nextInt();
        System.out.println(Power(base,exponent));
    }

    public static double Power(double base,int exponent){
        double num=1;
        for (int i = 0; i <Math.abs(exponent) ; i++) {
                num=num*base;
            }
        if(exponent<0){
            num=1/num;
        }
        return num;

    }

}
