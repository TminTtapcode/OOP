/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

/**
 *
 * @author admin
 */
public class Lab3 {

    public static void main(String[] args) {
        TkKhongKyHan tk1= new TkKhongKyHan("tta", 1000);
        TkCoKyHan tk2= new TkCoKyHan("ttB", 1000,KyHan.MOT_TUAN);
        TkCoKyHan tk3= new TkCoKyHan("ttC", 1000,KyHan.MOT_THANG);
        tk1.nopTien(1000);
        tk2.nopTien(1000);
        QLTaiKhoan ds=new QLTaiKhoan();
        ds.themTK(tk1,tk2,tk3);
        ds.hienThi();
        System.out.println(tk1.tinhTienLai());
        System.out.println(tk2.tinhTienLai());

        
        
    }
}
