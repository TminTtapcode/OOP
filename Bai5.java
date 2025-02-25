/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tmt.mavenproject3;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class Bai5 {
   
    public static void main(String[] args) {
        int a[][]= taoMang(3,3);
        xuatMang(a);
       for(int []i:a){
           System.out.println(IntStream.of(i).sum());
       }
    }
    public static int[][] taoMang(int n,int m){
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=(int)(Math.random()*100+1);
            }
            
        }
        return a;
    }
    public static void xuatMang(int a[][]){       
        for(int []i: a){
            for(int j:i){
                System.out.print(j+"\t");
            }
            System.out.println("");
        }
    }
}
