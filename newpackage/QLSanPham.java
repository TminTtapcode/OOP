/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QLSanPham {
    private List<SanPham> ds= new ArrayList<>();
    
    public void themSP(SanPham ... a){
        this.getDs().addAll(Arrays.asList(a));
    }
    public void hienThi(){
        this.getDs().forEach(sp->sp.hienThi());
    }
    public void xoaSP(String tenSp){
        this.getDs().removeIf(h->h.getTen().equals(tenSp));
    }

    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }
    public List<SanPham> timKiem(String tenSP){
        return this.ds.stream().filter(sp-> sp.getTen().contains(tenSP)).collect(Collectors.toList());
    }
    public void timKiem(int MaSP){
        
    }
    
}
