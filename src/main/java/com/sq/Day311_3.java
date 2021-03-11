package com.sq;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Day311_3 {
    public static void main(String[] args) {
        try{
            PrintStream out=System.out;
            PrintStream ps=new PrintStream("./log.txt");
            System.setOut(ps);
            int age=18;
            System.out.println("年龄变量定义，初始值为18");
            String sex="女";
            System.out.println("性别定义，初始化为女");
            System.out.println("这是一个"+age+"岁的"+sex+"的孩子");
            System.setOut(out);
            System.out.println("查看日志");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
