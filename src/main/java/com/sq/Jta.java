package com.sq;

import javax.swing.*;
import java.awt.*;

public class Jta extends JFrame {
    public Jta(){
        setBounds(200,200,400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        Container c=getContentPane();

        JTextArea area=new JTextArea();
        area.setText("这是文本域");
        area.setRows(5);
        area.setColumns(10);
        area.append("添加内容");
        area.insert("哈哈",2);
        area.setFont(new Font("楷体",Font.PLAIN,20));
        JScrollPane js=new JScrollPane(area);
        c.add(js);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Jta();
    }
}
