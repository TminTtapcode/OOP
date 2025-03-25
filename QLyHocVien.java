/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab.bai7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    }
//    public void themHv(String duongDan){
//        
//        File o= new File("output.txt");
//        String input;
//        Scanner sc=new Scanner(f);
//        try(PrintWriter writer=new PrintWriter(o)){
//            while(sc.hasNextLine()){
//                input=sc.nextLine();
//                    input=input.replaceFirst("\\{file}", "Tap tin");
//                writer.println(input);
//            }
//            
//        }
//
//        
//    }
    public void hienThi(){
        this.Ds.forEach(p->p.hienThi());
    }
}
