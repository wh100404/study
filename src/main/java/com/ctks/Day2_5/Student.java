package com.ctks.Day2_5;

public class Student {
    int sNo;
    String sName;
    String  sSex;
    double sJava;
    public Student(int sNo,String sName,String  sSex,double sJava){
        this.sNo=sNo;
        this.sName=sName;
        this.sSex=sSex;
        this.sJava=sJava;
    }
    public void show(){
        System.out.println("学生信息为"+getsName()+","+getsSex()+","+getsJava()+","+getsNO()+","+getsJava());
    }
    public void setsNo(int sNo){
        this.sNo=sNo;
    }
    public int getsNO(){
        return sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public double getsJava() {
        return sJava;
    }

    public void setsJava(double sJava) {
        this.sJava = sJava;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;

    }
}
