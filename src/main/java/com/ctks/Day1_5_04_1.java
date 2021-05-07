package com.ctks;

import static java.lang.Math.PI;

public class Day1_5_04_1 {
    private double Radius;

    public Day1_5_04_1(){
        Radius = 0.0;
    }
    public Day1_5_04_1(double r){
      Radius=r;
    }

    public double getArea() {
        return PI*Radius*Radius;
    }

    public double getP(){
        return 2*PI*Radius;
    }
    public void show(){
        System.out.println(Radius);
        System.out.println(getArea());
        System.out.println(getP());
    }
}
