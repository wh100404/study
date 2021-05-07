package com.ctks;

public class Day1_5_04_2 extends Day1_5_04_1{
    double height;
    public Day1_5_04_2(double r,double h){
        super(r);
        height=h;
    }
    public double getVolume(){
    return getArea()*height;
    }
    public void showVolume(){
        System.out.println(getVolume());
    }
}
