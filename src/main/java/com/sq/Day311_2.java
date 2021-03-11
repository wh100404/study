package com.sq;

import java.util.Scanner;

public class Day311_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入新员工的姓名");
        String a=sc.nextLine();
        System.out.println("请输入新员工应聘的编程语言");
        String b=sc.nextLine();
        switch(b.hashCode()){
            case 3254818:
            case 2301506:
            case 2269730:
                System.out.println("员工"+a+"被分配到JAVA程序开发部门");
                break;
            case 3104:
            case 2112:
                System.out.println("员工"+a+"被分配到C#程序开发部门");
                break;
            case -709190099:
            case 955463181:
            case 9745901:
                System.out.println("员工"+a+"被分配到ASP.NET程序开发部门");
                break;
            default:
                System.out.println("员工"+a+"被分配到"+b+"程序开发部门");


        }

    }
}
