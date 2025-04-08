/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author admin
 */
public class Sach extends SanPham {
    private int soTrang;
    public Sach( String ten, double gia,int soTrang) {
        super(ten, gia);
        this.soTrang = soTrang;
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.printf("So trang: %d\n",this.soTrang); 
    }
}
