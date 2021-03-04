package com.sq;

import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {
    public Grid(){
        setBounds(200,200,300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container a=getContentPane();
        a.setLayout(new GridLayout(7,3,5,5));//设置为网格格式 7行3列 水平数值间距均为5像素

        for (int i = 0; i <=20 ; i++) {
            a.add(new JButton("按钮"+i));
        }
        setVisible(true);

    }

    public static void main(String[] args) {
        new Grid();
    }
}
