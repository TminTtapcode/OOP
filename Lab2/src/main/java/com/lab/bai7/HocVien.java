package com.lab.bai7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author admin
 */
public class HocVien {

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the Diem
     */
    public Double[] getDiem() {
        return Diem;
    }

    /**
     * @param Diem the Diem to set
     */
    public void setDiem(Double[] Diem) {
        this.Diem = Diem;
    }
    private static int dem;
    private int Id=++dem;
    private String hoTen;
    private LocalDate ngaySinh;
    private Double[] Diem;

    public HocVien(String hoTen, LocalDate ngaySinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }
    public HocVien(String hoten,String ns){
        this(hoten,LocalDate.parse(ns,DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    public void hienThi(){
        System.out.printf("%d - %s - %s\n",this.Id,this.hoTen,this.ngaySinh.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
   
}
