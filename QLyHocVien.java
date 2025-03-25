/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab.bai7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QLyHocVien {

    /**
     * @return the Ds
     */
    public List<HocVien> getDs() {
        return Ds;
    }

    /**
     * @param Ds the Ds to set
     */
    public void setDs(List<HocVien> Ds) {
        this.Ds = Ds;
    }
    private List<HocVien> Ds= new ArrayList<>();

    public QLyHocVien() {
        this.Ds= new ArrayList<HocVien>();
    }
    
    public void themHv(HocVien...a){
        this.Ds.addAll(Arrays.asList(a));
    }
    public void themHv(){
        //Nhap...
        HocVien h = new HocVien();
        h.nhap1Hv();
        this.Ds.add(h);
    }
    public void themHv(String duongDan) throws FileNotFoundException{
        File f =new File(duongDan);
        try(Scanner sc = new Scanner(f)){
            while (sc.hasNext()){
                this.Ds.add(new HocVien(sc.nextLine(),sc.nextLine()));
            }
        }
    }
    public void hienThi(){
        this.Ds.forEach(p->p.hienThi());
    }
    void nhapDiem(){
        this.Ds.forEach(p->p.nhapDiem());
    }
    public HocVien timKiem(int id){
        return this.Ds.stream().filter(h->h.getClass()==id).findFirst().get();
    }
    public List<HocVien> timKiem(String kw){
        return this.Ds.stream().filter(h->h.getHoTen().contains(kw)).collect(Collectors.toList());
    }
}
