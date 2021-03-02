package com.sq;

import javax.swing.*;
import java.awt.*;

public class Jframe extends JFrame{//让jframe也成为一个窗体
        public Jframe(){
            //JFrame f=new JFrame("窗体标题");//创建窗体对象
            /* f. */setVisible(true);//设置窗体可见
            setTitle("窗体标题");
            //窗体关闭
            /* f. */setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//隐藏窗口并停止程序
            /* f. */setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//无任何操作
            /* f. */setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//隐藏窗体 并不停止
            /* f. */setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//释放窗体资源
            /* f. */setSize(300,200);//设置窗体的大小 单位 像素
            /* f. */setLocation(200,200);//设置窗体的位置  单位  像素
            /* f. */setBounds(200,200,300,200);//替代前两个方法
            Container c=/* f. */getContentPane();//获取窗体容器
            c.setBackground(Color.gray);//设置背景颜色
            JLabel L=new JLabel("这是一个窗体");
            c.add(L);
            c.remove(L);
            c.validate();//验证容器中的组件（刷新）
            /* f. */setContentPane(c);//刷新  同上
            /* f. */setResizable(false);//设置窗体是否可以改变大小
            System.out.println("x="+c.getX()+"y="+c.getY());
        }
    public static void main(String[] args) {
        new Jframe();
    }
}
