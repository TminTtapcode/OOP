/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author admin
 */
public class TkKhongKyHan extends TaiKhoan{
    
    public TkKhongKyHan(String ttk, double st) {
        super(ttk, st);
    }

    @Override
    public boolean isDaoHan() {
        return true;
    }

    @Override
    public double tinhTienLai() {
        return this.getSt()*0.1/(12*100);
    }
}
