/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tmt.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        int n=sc.nextByte();
        System.out.print("Nhap vao x:");
        int x=sc.nextByte();
        int kq=0;
        int heSo;
        for(int i=0;i<=n;i++){
            System.out.println("Nhap vao he so "+(i+1));
            heSo=sc.nextByte();
            kq+=heSo*Math.pow(x, n-i);
        }
        System.out.println("Ket qua: "+kq);
    }
}
