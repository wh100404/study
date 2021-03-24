package com.ctks;

import java.util.Scanner;

//编写一个Java程序，用if-else语句判断某年份是否为闰年。
public class Day1_5_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        /*if (args.length!=0)
            year=Integer.parseInt(args[0]);*/
        if((year%4==0&year%100!=0&year>0)||(year%400==0)){
            System.out.println(year+"年是闰年");
        }else{
            System.out.println(year+"年非闰年");
        }
    }
}
