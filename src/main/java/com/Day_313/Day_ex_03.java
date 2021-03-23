package com.Day_313;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class Day_ex_03 extends JFrame {

    public Day_ex_03() {

        public JTable getTable(){
            JTable jt = new JTable();
            if (jt == null) {
                jt = new JTable();
                jt.setRowHeight(23);
                String[] colums = {"姓名", "性别", "出生日期"};
                DefaultTableModel model = new DefaultTableModel(colums, 0);
                jt.setModel(model);
                List<String> students=getStudents();
                for (String info:students) {
                    String[] args=info.split(",");
                    model.addRow(args);
                }
            }
            return jt;
        }
    }
    public List<String> getStudents(){
        List<String> list=new ArrayList<String>();
        list.add("1,男,3");
        list.add("2,男,4");
        list.add("3,男,5");
        list.add("4,女,6");
        list.add("6,女,8");
        list.add("7,女,9");
        return list;
    }

    public static void main(String[] args) {
        new Day_ex_03();
    }
}


