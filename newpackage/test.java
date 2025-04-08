/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author admin
 */
public class test {
    public static void main(String[] args) {
        QLSanPham ds= new QLSanPham();
        ds.themSP(new Sach("Triet hoc",35,200));
        ds.themSP(new BangDia("hay trao cho anh",50,10));
        ds.themSP(new Sach("KTCT hoc",60,125));
        ds.themSP(new BangDia("Lac Troi",30,2));
        ds.timKiem("Tr").forEach(s->s.hienThi());
        ds.hienThi();
    }
}
