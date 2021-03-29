package com.ctks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("输入10个正整数");
        int[] a=new int[10];
        int j=0;
        int A1=0;
        int A2=0;
        int A3=0;
        float A4=0;
        int A5=0;
        int count=0;
        int sum=0;
        List<String> array=new ArrayList();
        String temp;

        while(j<10){
            System.out.println("输入第"+j+"个");
            Scanner sc=new Scanner(System.in);
            a[j]=sc.nextInt();
            if(a[j]%5==0&&a[j]%2==0){
                A1+=a[j];
                System.out.println("符合A1"+a[j]);
            }
            if(a[j]%5==1){
                if((j+1)%2==0){
                    A2-=a[j];
                }else{
                    A2+=a[j];
                }
                System.out.println(a[j]);
                System.out.print("当前和为"+A2);
            }
            if(a[j]%5==2){
                A3+=1;
                System.out.println("当前符合A3"a[j]);
            }
            if(a[j]%5==3){
               count+=1;
               sum+=a[j];
               A4=(float)(sum/count);
                System.out.println("当前符合A4"+a[j]);
            }
            if(a[j]%5==4){
                array.add(temp);

                for (int i = 0; i < ; i++) {

                }
                System.out.println("当前符合A5"+a[j]);
            }
            j++;
        }
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);
        System.out.println(A4);
        System.out.println(A5);
        System.out.println(Arrays.toString(a));
    }
}
