package com.ctks;

public class PaiXu {
    public static void main(String[] args) {
        int x=30;
        int y=20;
        int z=25;
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
