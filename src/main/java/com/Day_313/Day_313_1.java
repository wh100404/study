package com.Day_313;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Day_313_1 extends JFrame {
    JList jt = new JList();
    ArrayList<String> arrayList=new ArrayList<>();



    public Day_313_1() {
        setBounds(200, 200, 800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        setLayout(null);
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
       btn1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               js.requestFocusInWindow();
               js.selectAll();
               String a=js.getText();
               if(a.isEmpty()){
                   return;
               }else{
                   arrayList.add(a);
               }
               replaceModel();

           }
       });
       btn2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              Object b=jt.getSelectedValue();
              arrayList.remove(b);
               replaceModel();

           }
       });

        c.add(btn1);
        c.add(btn2);

        setVisible(true);
    }
    private void replaceModel(){
        jt.setModel(new AbstractListModel() {
            @Override
            public int getSize() {
                return arrayList.size();
            }

            @Override
            public Object getElementAt(int index) {
                return arrayList.get(index);
            }
        });
    }


    public static void main(String[] args) {
        new Day_313_1();
    }


}
