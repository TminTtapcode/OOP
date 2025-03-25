/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class DsPhanSo {

    /**
     * @return the Ds
     */
    public List<PhanSo> getDs() {
        return Ds;
    }

    /**
     * @param Ds the Ds to set
     */
    public void setDs(List<PhanSo> Ds) {
        this.Ds = Ds;
    }
    private List<PhanSo> Ds = new ArrayList<PhanSo>();

    public DsPhanSo() {
        Ds=new ArrayList<PhanSo>();
    
    }
    public void themPs(PhanSo ps){
        this.Ds.add(ps);
    }
    public void themPs(PhanSo ... ps){
        this.Ds.addAll(Arrays.asList(ps));
    }
    public void hienThi(){
       this.Ds.forEach(p-> p.hienThi());
    }
    public void xoaPs(PhanSo ps){
        this.Ds.removeIf(q->q.soSanh(ps)==0);
    }
    public void xoaPs(int t,int m){
        PhanSo ps=new PhanSo(t,m);
        xoaPs(ps);
    }
    public void tongPs(){
       this.Ds.stream().reduce(new PhanSo(), (t,p)->t.cong(p)).rutGon();
    }
    public PhanSo min(){
        return this.Ds.stream().min((p,q)->p.soSanh(q)).get();
    }
    public PhanSo max(){
        return this.Ds.stream().max((p,q)->p.soSanh(q)).get();
    }
    public void sapXep(){
        this.Ds.sort((q,p)->q.soSanh(p));
    }
    
    
    
}
