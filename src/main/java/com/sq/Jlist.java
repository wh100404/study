package com.sq;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Jlist extends JFrame {
    public Jlist(){
        setBounds(200,200,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        String items[]={"元素1","元素2","元素3","元素4","元素5","元素6","元素7","元素8"};
       // JList<String> j1=new JList<>(items);

        DefaultListModel<String> model=new DefaultListModel<>();//列表框的数据模型
        for (String temp:items) {
            model.addElement(temp);//向数据模型添加元素
        }
        JList<String> j1=new JList<>();
        model.addElement("添加元素");//数据模型添加新元素
        j1.setModel(model);//列表框载入数据模型

        j1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//随便选
        //j1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);//只能连续选相邻的
        //j1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//只能单选

        JButton btn=new JButton("确认");
        btn.setBounds(120,90,70,25);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            java.util.List<String> values=j1.getSelectedValuesList();
            for (String temp:values) {
                System.out.println(temp);
                }
                System.out.println("----------end--------------------");
            }
        });
        c.add(btn);

        JScrollPane js=new JScrollPane(j1);
        js.setBounds(10,10,100,100);
        c.add(js);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Jlist();
    }
}
