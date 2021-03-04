package com.sq;

import javax.swing.*;
import java.awt.*;

public class Flow extends JFrame {
    public Flow(){
        setBounds(200,200,300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container a=getContentPane();
        a.setLayout(new FlowLayout(FlowLayout.LEFT));//给容器设置流布局
        for (int i = 0; i <10 ; i++) {
            a.add(new JButton("按钮"+i));
        }
        setVisible(true);

    }

    public static void main(String[] args) {
        new Flow();
    }
}
