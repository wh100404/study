package com.sq;

import sun.tools.jconsole.inspector.XTextField;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Day5 {
    public void button(ActiveEvent e){
       TextField a=new TextField();
       a.requestFocusInWindow();
       a.selectAll();
       String text=a.getText();
       if(text.trim().equals(""))
           return;
       ArrayList list = null;
       list.add(text);
       //replaceModel();   ??把数组集合中的内容显示到页面列表控件中
    }
    public void delete(ActiveEvent e){



    }



}
