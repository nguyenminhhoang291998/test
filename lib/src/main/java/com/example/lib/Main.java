package com.example.lib;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //bài 7
        int i, k, dem;
        for( i=1000; i<=2000; i++){
            dem=0;
            for(k=2; k<=i; k++){
                if(i%k==0)
                    dem++;
            }
            if (dem==1){
                System.out.print(i + " ");
            }
        }
        // Bài 8
        int a;
        for(a=1; a<100; a++){
            if(a%3==0 && a%7==0){
                System.out.println(a + " ");
            }
        }

        // Bài 9
        int b;
        for(b=1000; b<=2000; b++){
            if((b%3==0)&(b%5==0)&(b%7==0)){
                System.out.print(b + " ");
            }
        }

        //Bài 10
        int c=0, d=0, e, tong;
        while (c<5){
            tong = 1;
            d++;
            for(e=2;e<d;e++) {
                if (d % e == 0)
                    tong += e;
            }
            if(c==tong){
                System.out.println(d + " ");
                c++;
            }
        }    

        }
    }


