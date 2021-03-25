package com.ctks.Day2_5;
/*
定义一个表示学生信息的类Student，要求如下：
　（1）类Student的成员变量：
sNO　表示学号；sName表示姓名；sSex表示性别；sAge表示年龄；sJava：表示Java课程成绩。
　（2）类Student带参数的构造方法：
在构造方法中通过形参完成对成员变量的赋值操作。
（3）类Student的方法成员：
getNo（）：获得学号；
getName（）：获得姓名；
getSex（）：获得性别；
getAge（）获得年龄；
getJava（）：获得Java 课程成绩
（4）根据类Student的定义，创建五个该类的对象，输出每个学生的信息，计算并输出这五个学生Java语言成绩的平均值，以及计算并输出他们Java语言成绩的最大值和最小值。
* */
public class Day2_5_01 {
    public static void main(String[] args) {
        Student[] a=new Student[5];
        a[0]=new Student(1,"哈哈哈","男",50.0);
        a[1]=new Student(1,"嘿嘿嘿","女",60.0);
        a[2]=new Student(1,"呵呵呵","男",70.0);
        a[3]=new Student(1,"咦咦咦","女",80.0);
        a[4]=new Student(1,"略略略","男",100.0);
        a[0].show();
        a[1].show();
        a[2].show();
        a[3].show();
        a[4].show();
        double ave;
        ave=(a[0].getsJava()+a[1].getsJava()+a[2].getsJava()+a[3].getsJava()+a[4].getsJava())/5;
            }
        }

    }
}
