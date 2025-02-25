/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tmt.mavenproject3;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class Bai3a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap vao email: ");
        String mail=sc.next();
        String kq=mail.substring(0, mail.indexOf('@'));
        System.out.println("Ket qua: "+kq);
    }
}
