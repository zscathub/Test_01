package cn.zscat.niuke;/*
题目描述
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。

n<=39

 */

public class Test_07 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(8));
    }

    public static  int Fibonacci(int n){
        return n<=0 ? 0 : (n<=2 ? 1 : Fibonacci(n-1)+Fibonacci(n-2) );
    }
}
