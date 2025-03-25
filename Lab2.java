/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Lab2 {

    public static void main(String[] args) {
        PhanSo ps1=new PhanSo(5,6);
        PhanSo ps2=new PhanSo(1,2);
        PhanSo ps3=new PhanSo(3,5);
        PhanSo ps4=new PhanSo(5,3);
        PhanSo ps5=new PhanSo(8,3);
        PhanSo ps6=new PhanSo(1,4);
        
        DsPhanSo Ds=new DsPhanSo();
        Ds.themPs(ps1,ps2,ps3,ps4,ps5,ps6);
        Ds.xoaPs(ps6);
        Ds.xoaPs(3,5);
        Ds.sapXep();
        Ds.hienThi();
        
        System.out.println("");
        Ds.max().hienThi();
        Ds.min().hienThi();
        
    }
}
