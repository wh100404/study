package com.ctks;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        System.out.println("输入年月日");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int year=Integer.parseInt(a.substring(0,4));
        int month=Integer.parseInt(a.substring(4,6));
        int day=Integer.parseInt(a.substring(6,8));
        int sum=0;
        for (int i = 1; i <month ; i++) {
            switch(i){
                case 1:case 3:case 5:case 7: case 8: case 10: case 12:
                    sum+=31;
                    break;
                case 4: case 6: case 9: case 11:
                    sum+=30;
                    break;
            }
            System.out.println(sum);
        }
        if(month>=2){
            if(year%4==0&&year%100!=0||year%400==0){
                sum+=29;
            }else{
                sum+=28;
            }
        }
        sum+=day;

        System.out.println("日期为当年的第"+sum+"天");

    }
}
