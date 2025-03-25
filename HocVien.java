package com.lab.bai7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.DoubleStream;

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
    public double[] getDiem() {
        return Diem;
    }

    /**
     * @param Diem the Diem to set
     */
    public void setDiem(double[] Diem) {
        this.Diem = Diem;
    }
    private static int dem;
    private int Id=++dem;
    private String hoTen;
    private LocalDate ngaySinh;
    private double[] Diem;

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
    public void nhap1Hv(){
        System.out.print("Ho ten = ");
        this.hoTen=CauHinh.SC.nextLine();
        System.out.print("Ngay Sinh (dd/MM/yyyy) = ");
        this.ngaySinh=LocalDate.parse(CauHinh.SC.nextLine(),CauHinh.FORMATTER);
    }
    public HocVien(){
    }
    public double tinhTb(){
        if(this.Diem!=null)
            return DoubleStream.of(this.Diem).average().getAsDouble();
        return 0;
    }
    public void nhapDiem(){
        System.out.printf("Nhap diem cuar %s\n",this.hoTen.toUpperCase());
        this.Diem = new double[CauHinh.SO_MON];
        for(int i=0;i<3;i++){
            System.out.printf("Mon thu &d = ",i+1);
            this.Diem[i]= Double.parseDouble(CauHinh.SC.nextLine());
        }
        System.out.println(this.tinhTb());
    }
    public boolean isHb(){
        if(this.Diem !=null)
            for(var d:this.Diem)
                if(d<5)
                    return false;
        return this.tinhTb() >=8;
        retur 
    }
   
}
