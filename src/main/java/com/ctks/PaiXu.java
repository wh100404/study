package com.ctks;

import java.util.Scanner;

public class PaiXu {
    public static void main(String[] args) {
        System.out.println("输入x,y,z的值");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int[] a={x,y,z};
        int temp;
        for (int i = 0; i <a.length ; i++) {
            if(i!=a.length-1){
           if(a[i]>a[i+1]){
               temp=a[i];
               a[i]=a[i+1];
               a[i+1]=temp;
           }}
            System.out.println(a[i]);
        }
    }

}
