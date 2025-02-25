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
public class Bai3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String s=sc.nextLine();
        char ch;
        int dem=0;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(Character.isUpperCase(ch))
                dem+=1;
        }
        System.out.println("So chu hoa trong chuoi la: "+dem);
    }
}
