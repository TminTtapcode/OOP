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
        QLHinh ql = new QLHinh();
        ql.themHinh(new HinhChuNhat("HCN",56, 45));
        ql.themHinh(new HinhVuong("HV",55));
        ql.themHinh(new HinhTamGiac("TG",55,30,70));
        ql.themHinh(new TamGiacCan("TGC",55,60));
        ql.themHinh(new TamGiacDeu("TGD",70));
//        ql.sapXep();
        int idx=ql.timHinh(new HinhVuong("HV", 55));
        ql.hienThi();
        System.out.println(idx);
        
        
        
        
        
    }
}
