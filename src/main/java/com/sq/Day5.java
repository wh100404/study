package com.sq;

import sun.tools.jconsole.inspector.XTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InvocationEvent;
import java.util.ArrayList;

public class Day5 {
    public static void button(ActiveEvent e) {
        TextField a = new TextField();
        a.requestFocusInWindow();
        a.selectAll();
        String text = a.getText();
        if (text.trim().equals(""))
            return;
        ArrayList list = null;
        list.add(text);
        //replaceModel();   ??把数组集合中的内容显示到页面列表控件中
    }

    public void delete(ActiveEvent e) {


    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("用动态数组保存学生姓名");
        Container container = jFrame.getContentPane();
        //设置窗体背景颜色
        container.setBackground(Color.darkGray);

        //设置窗体的显示坐标及窗体大小
        jFrame.setBounds(60,100,500,500);

        //设置窗口是否可以调整大小
        jFrame.setResizable(true);
        //设置窗口是否可见
        jFrame.setVisible(true);
        //结束应用进程
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
