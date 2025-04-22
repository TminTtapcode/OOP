/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class TkCoKyHan extends TaiKhoan {

    /**
     * @return the KH
     */
    public KyHan getKH() {
        return KH;
    }

    /**
     * @param KH the KH to set
     */
    public void setKH(KyHan KH) {
        this.KH = KH;
    }

    /**
     * @return the NgayDaoHan
     */
    public LocalDate getNgayDaoHan() {
        return NgayDaoHan;
    }

    /**
     * @param NgayDaoHan the NgayDaoHan to set
     */
    public void setNgayDaoHan(LocalDate NgayDaoHan) {
        this.NgayDaoHan = NgayDaoHan;
    }
    private KyHan KH;
    private LocalDate NgayDaoHan;
    public TkCoKyHan(String ttk, double st, KyHan kh) {
        super(ttk, st);
        this.KH=kh;
        
        this.NgayDaoHan= kh.tinhDaoHan(LocalDate.now());

    }
    @Override
    public void HienThi(){
        super.HienThi();
            System.out.printf("Ky Han: %s\nNgay dao han: %s\n",this.KH,this.NgayDaoHan.format(CauHinh.FORMATTER));
    }

    @Override
    public boolean isDaoHan() {
        if (this.NgayDaoHan==LocalDate.now())
            return true;
        return false;
    }

    @Override
    public double tinhTienLai() {
        return this.KH.tinhTienLai(this.getSt());
    }
    
}
