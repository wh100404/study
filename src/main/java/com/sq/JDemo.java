package com.sq;

import javax.swing.*;
import java.awt.*;

public class JDemo extends JFrame {
    public JDemo(){
        setBounds(200,200,300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setVisible(true);
    }

    public static void main(String[] args) {
        new JDemo();
    }
}
