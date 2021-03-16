package com.Day_313;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Day_313_1 extends JFrame {

    ArrayList<String> array = new ArrayList<>();
    private JTextField textField;
    private JList list;

    public Day_313_1() {
        setBounds(200, 200, 800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        setLayout(null);
        JTextArea jt = new JTextArea();
        jt.setColumns(100);
        jt.setBounds(0, 80, 600, 350);
        c.add(jt);
        JTextField js = new JTextField();
        js.setBounds(200, 30, 300, 30);
        c.add(js);


        JLabel jb = new JLabel("学生姓名");
        jb.setLocation(150, 30);
        c.add(jb);
        JButton btn1 = new JButton("添加学生");
        btn1.setBounds(650, 100, 150, 30);
        JButton btn2 = new JButton("删除学生");
        btn2.setBounds(650, 200, 150, 30);

        btn1.addActionListener(e -> {
            String text = js.getText();
            if (text.isEmpty())
                return;
            boolean b = array.add(text);
            System.out.println("添加结果： " + b);
            replaceModel();
        });
        btn2.addActionListener(e -> {
            Object value = list.getSelectedValue();
            boolean b = array.remove(value);
            System.out.println("删除结果： " + b);
            replaceModel();
        });
        c.add(btn1);
        c.add(btn2);

        setVisible(true);
    }

    private void replaceModel() {
        list.setModel(new AbstractListModel() {
            @Override
            public int getSize() {
                return array.size();
            }

            @Override
            public Object getElementAt(int index) {
                return array.get(index);
            }
        });
    }

    public static void main(String[] args) {
        new Day_313_1();
    }

    public static void remove(Object o) {

    }
}
