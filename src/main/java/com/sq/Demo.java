package com.sq;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo extends JDialog {
    public Demo(JFrame frame){
        super(frame,"对话框标题",true);//第一个参数为父窗体对象  第二个参数为对话框标题  第三个参数是是否阻塞父窗体
        Container c=getContentPane();//获取窗体容器
        c.add(new JLabel("这是一个对话框"));
        setVisible(true);
        setBounds(200,200,300,200);
    }

    public static void main(String[] args) {
        JFrame f=new JFrame("父窗体");
        f.setBounds(50,50,300,300);
        Container c=f.getContentPane();
        JButton btn=new JButton("弹出对话框");
        c.setLayout(new FlowLayout());//设置布局  使用流布局
        c.add(btn);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Demo a=new Demo(f);
                a.setVisible(true);
            }
        });
    }
}
