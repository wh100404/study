package com.sq;

import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {
    public  Layout(){
        setBounds(200,200,300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new BorderLayout());//设置为边界布局
        c.add(new JButton("中"),BorderLayout.CENTER);
        c.add(new JButton("东"),BorderLayout.EAST);
        c.add(new JButton("西"),BorderLayout.WEST);
        c.add(new JButton("南"),BorderLayout.SOUTH);
        c.add(new JButton("北"),BorderLayout.NORTH);
        c.add(new JButton("覆盖"),BorderLayout.CENTER);
        c.setVisible(true);
    }

    public static void main(String[] args) {
        new Layout();
    }
}
