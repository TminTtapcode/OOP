/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab.bai7;

import java.io.FileNotFoundException;



/**
 *
 * @author admin
 */
public class NewClass {
    public static void main(String[] args) throws FileNotFoundException {
        HocVien hv1=new HocVien("MT","11/12/2222");
        HocVien hv2=new HocVien("TT","11/11/2192");
        QLyHocVien ds=new QLyHocVien();
        ds.themHv("src/main/resources/hocvien.txt");
        ds.themHv();
        ds.hienThi();
        ds.nhapDiem();
    }
}
