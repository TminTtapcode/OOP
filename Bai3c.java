/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tmt.mavenproject3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai3c {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("input.txt");
        try(PrintWriter p= new PrintWriter(f)){
        p.println("{file} là một tập hợp các thông tin do người\n" +
                "dùng tạo ra từ máy vi tính, {file} được đặt\n" +
                "tên và lưu trữ trong các thiết bị lưu trữ như\n" +
                "đĩa cứng, đĩa mềm, đĩa CD,...");
        }
        File o= new File("output.txt");
        String input;
        Scanner sc=new Scanner(f);
        try(PrintWriter writer=new PrintWriter(o)){
            while(sc.hasNextLine()){
                input=sc.nextLine();
                    input=input.replaceFirst("\\{file}", "Tap tin");
                writer.println(input);
            }
            
        }
    }
}
