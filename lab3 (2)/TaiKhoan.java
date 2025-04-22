/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author admin
 */
public abstract class TaiKhoan {
    private static int dem;
    private String stk;
    private String ttk;
    private double st;
    {
        setStk(String.format("%06d",dem++));
    }

    public TaiKhoan(String ttk, double st) {
        this.ttk = ttk;
        this.st = st;
    }
 
    public void HienThi(){
        System.out.printf("So TK: %s\nTen TK: %s\nSo Tien: %.1f\n", this.getStk(), this.getTtk(), this.getSt());
    }

    /**
     * @return the stk
     */
    public String getStk() {
        return stk;
    }

    /**
     * @param stk the stk to set
     */
    public void setStk(String stk) {
        this.stk = stk;
    }

    /**
     * @return the ttk
     */
    public String getTtk() {
        return ttk;
    }

    /**
     * @param ttk the ttk to set
     */
    public void setTtk(String ttk) {
        this.ttk = ttk;
    }

    /**
     * @return the st
     */
    public double getSt() {
        return st;
    }

    /**
     * @param st the st to set
     */
    public void setSt(double st) {
        this.st = st;
    }
    public abstract boolean isDaoHan();

    public void nopTien(int st){
        if(this.isDaoHan())
        this.st+=st;
    }
    public void rutTien(int st){
        if(this.isDaoHan())
        this.st-=st;
    }
    public abstract double tinhTienLai();
   
    
}
