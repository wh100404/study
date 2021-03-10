package com.sq;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jtext extends JFrame {
    public Jtext(){
        setBounds(300,300,500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        setLayout(new FlowLayout());
        JTextField jt=new JTextField();
        jt.setColumns(20);//设置文本框长度
        jt.setFont(new Font("黑体",Font.PLAIN,20));
        jt.setText("aa");
        c.add(jt);

        JButton btn=new JButton("确认");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("文件框内容为"+jt.getText());
                jt.setText("");
                jt.requestFocus();
            }
        });
        c.add(btn);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Jtext();
    }
}
