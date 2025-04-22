/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.lab3;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public enum KyHan {
    
    MOT_TUAN(7,0.5) {
        @Override
        public LocalDate tinhDaoHan(LocalDate ngayBatDau) {
            return ngayBatDau.plusDays(this.khoangThoiGian);
        }

        @Override
        public double tinhTienLai(double st) {
            return (st*this.laiSuat)/(100*12*7);
        }
    },
    MOT_THANG(1,4.5) {
        @Override
        public LocalDate tinhDaoHan(LocalDate ngayBatDau) {
            return ngayBatDau.plusMonths(this.khoangThoiGian);
        }

        @Override
        public double tinhTienLai(double st) {
            return (st*this.laiSuat)/(100*12);
        }
    },
    MOT_NAM(1,6.8) {
        @Override
        public LocalDate tinhDaoHan(LocalDate ngayBatDau) {
            return ngayBatDau.plusYears(this.khoangThoiGian);        
        }

        @Override
        public double tinhTienLai(double st) {
            return (st*this.laiSuat)/100;
        }
    };
    protected int khoangThoiGian;
    protected double laiSuat;
    private KyHan(int khoangThoiGian,double laiSuat){
        this.khoangThoiGian=khoangThoiGian;
        this.laiSuat=laiSuat;
        
    }
    public abstract LocalDate tinhDaoHan(LocalDate ngayBatDau);
    public abstract double tinhTienLai(double st);
    
}
