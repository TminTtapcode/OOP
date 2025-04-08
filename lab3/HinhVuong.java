/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author admin
 */
public class HinhVuong extends HinhChuNhat {
    private double canh;
    public HinhVuong(String ten,double canh){
        super(ten,canh,canh);
    }

    /**
     * @return the canh
     */
    public double getCanh() {
        return canh;
    }

    /**
     * @param canh the canh to set
     */
    public void setCanh(double canh) {
        this.canh = canh;
    }
    
}
