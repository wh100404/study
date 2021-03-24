package com.ctks;

import java.util.Scanner;

/*
编写一个Java应用程序，从键盘读取用户输入两个字符串，并重载3个函数分别实现这两个字符串的拼接、整数相加和浮点数相加。
要进行异常处理，对输入的不符合要求的字符串提示给用户，不能使程序崩溃。（p39，例2-10,2-11）
 */
public class Day1_5_05 {

    public static void main(String[] args) {
        System.out.println("输入第一个字符串");
        Scanner sc1=new Scanner(System.in);
        int a=sc1.nextInt();
        System.out.println("输入第二个字符串");
        Scanner sc2=new Scanner(System.in);
        int b=sc2.nextInt();
        Day1_5_05 A=new Day1_5_05();
        A.subs(a,b);
        }
    public void subs(int sc1, int sc2){
        String a=String.valueOf(sc1);
        String b=String.valueOf(sc2);
        String c=a+b;
        System.out.println(c);
    }
}
