/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tmt.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai1 {

    public static void main(String[] args) {
       int n=(int)(Math.random()*100+1);
       Scanner sc=new Scanner(System.in);
        
        int Doan;
        do{
            System.out.print("Nhap vao so ban chon: ");
            Doan=sc.nextByte();
            if(Doan>n)
                System.out.println("Lon hon!");
            else if(Doan<n)
                System.out.println("Nho hon");
            else
                System.out.println("Chinh xac!");
        }while(Doan!=n);
    }
}
