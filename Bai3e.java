/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tmt.mavenproject3;

/**
 *
 * @author admin
 */
public class Bai3e {
    public static void main(String[] args) {
        String str="  jaVa;   iS,  SimpLe  ";
        String a[]=str.trim().split("[,;\\s]+");
        System.out.println(a.length);
        StringBuilder b=new StringBuilder();
        for (String w : a) {
                   b.append(w.substring(0,1).toUpperCase())
                    .append(w.substring(1).toLowerCase())
                    .append(" ");
        }
        System.out.println(b.toString().trim());  
    }
}
