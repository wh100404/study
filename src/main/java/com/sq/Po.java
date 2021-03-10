package com.sq;

import javax.swing.*;
import java.awt.*;

public class Po {
    JFrame f=new JFrame();
    void createFrame(){
        f.getContentPane().setLayout(new GridLayout());
        f.setSize(800,600);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        GridBagConstraints g1=new GridBagConstraints();
    }
    public static void main(String[] args) {
        Po d= new Po();
        d.createFrame();
        d.f.setVisible(true);
    }
}
