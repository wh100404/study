package com.sq;

import javax.swing.*;
import java.awt.*;

public class Pov {
    JFrame f=new JFrame();//主窗体
    Container c;//主容器
    void createFrame(){
        c=f.getContentPane();//窗体里的主容器
        c.setLayout(new GridLayout());
        f.setSize(800,600);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        GridBagConstraints g1=new GridBagConstraints();
        c.add(new JButton("组件1"),g1);
        g1.gridx=0;
        g1.gridy=0;
        g1.gridheight=1;
        g1.gridwidth=1;
        GridBagConstraints g2=new GridBagConstraints();
        c.add(new JButton("组件2"),g2);
        g2.gridx=1;
        g2.gridy=1;
        GridBagConstraints g3=new GridBagConstraints();
        c.add(new JButton("组件3"),g3);
        g3.gridx=3;
        g3.gridy=3;
    }
    void createButton(){
        for (int i = 0; i <9 ; i++) {
            GridBagConstraints g1=new GridBagConstraints();
            g1.gridx=i;
            g1.gridy=0;
            c.add(new JButton("组件"),g1);

            GridBagConstraints g2=new GridBagConstraints();
            g2.gridx=0;
            g2.gridy=i;
            c.add(new JButton("组件"),g2);
        }
    }

    public static void main(String[] args) {
        Pov p=new Pov();
        p.createFrame();
        p.createButton();
       // p.init();
        p.f.setVisible(true);
    }
}
