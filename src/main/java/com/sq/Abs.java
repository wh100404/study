package com.sq;

import javax.swing.*;
import java.awt.*;

public class Abs extends JFrame {
    public Abs(){
        setBounds(200,200,300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container a=getContentPane();
        a.setLayout(null);//将布局设为绝对布局
        JButton b1=new JButton("按钮1");//添加按钮
        JButton b2=new JButton("按钮2");
        b1.setBounds(10,30,80,30);
        a.add(b1);
        a.add(b2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Abs();
    }
}
