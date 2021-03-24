package com.ctks;
//编写一个Java程序在屏幕上输出1！+2！+3！+……+10！的和。（p64,例2-2）
public class Day1_5_03 {
    public static void main(String[] args) {
   int sum=0;
   int a=1;
        for (int i = 1; i <11 ; i++) {
            a=1;
            for (int j = 1; j <=i ; j++) {
                 a=a*j;
            }
            sum=a+sum;
            System.out.println(sum);
        }

    }
}
