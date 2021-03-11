package com.sq;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JP extends JFrame {
    public JP(){
        setBounds(200,200,400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        JPasswordField js=new JPasswordField();
        js.setColumns(20);
        js.setFont(new Font("黑体",Font.PLAIN,20));
        js.setEchoChar('#');//设置回显字符

        js.addActionListener(new ActionListener() {//设置监听事件 回车
            @Override
            public void actionPerformed(ActionEvent e) {
                char ch[]=js.getPassword();
                String str=new String(ch);
                System.out.println(str);
            }
        });

        c.add(js);
        setVisible(true);

    }

    public static void main(String[] args) {
        new JP();
    }
}
