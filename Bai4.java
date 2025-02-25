/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tmt.mavenproject3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class Bai4 {

    public static void main(String[] args) {
        int a[]=nhapMang(5);
        xuatMang(a);
        System.out.println(IntStream.of(a).filter(x->checkSNT(x)==true).sum());
        System.out.println(IntStream.of(a).filter(x->x>0).max().orElse('*'));
        System.out.println(IntStream.of(a).filter(x->checkSNT(x)==true).min().getAsInt());
        System.out.println(IntStream.of(a).filter(x->x<0).min().orElse('*'));
        
    }
    public static int[]nhapMang(int n){
        int[] a=new int[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.printf("a[%d] = ", i);
            a[i]=sc.nextInt();
        }
        
        return a;
    }
    public static void xuatMang(int[]a){
        for(int i:a){
            System.out.print(i+"\t");
        }
        System.out.println("");
    }
    
    public static boolean checkSNT(int n){
        if(n<=1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0)
                    return false;
            }
        return true;
    }
    
    }
 

