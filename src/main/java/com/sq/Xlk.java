package com.sq;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Xlk extends JFrame {
    public Xlk(){
        setBounds(200,200,300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
       String Item[]={"1","2","3"};
       JComboBox<String> comboBox=new JComboBox<>(Item);//使用string添加下拉列表元素


        //comboBox.addItem("身份证");
        //comboBox.addItem("学生证");
        //comboBox.addItem("工作证");

        ComboBoxModel cm=new DefaultComboBoxModel<>(Item);//创建下拉列表模型
        comboBox.setModel(cm);//向列表中添加数据模型
        JButton b=new JButton("打印");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("选中的索引："+comboBox.getSelectedIndex());
                System.out.println("选中的值："+comboBox.getSelectedItem());
            }
        });
        c.add(b);
        b.setBounds(100,10,60,20);
        comboBox.setBounds(10,10,80,21);//设定坐标和大小
        c.add(comboBox);
        comboBox.setEditable(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Xlk();
    }
}
