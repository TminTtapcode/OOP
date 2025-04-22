/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class QLTaiKhoan {
    private List<TaiKhoan> ds= new ArrayList<>();
    public void themTK(TaiKhoan ... a){
        this.ds.addAll(Arrays.asList(a));
    }
    public void hienThi(){
        this.ds.forEach(h->h.HienThi());
    }
}
