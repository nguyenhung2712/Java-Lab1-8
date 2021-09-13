/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author DELL
 */
public class mainClass {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Nước giải khát", 20000, 0.5);        
        SanPham sp2 = new SanPham("Đồ chơi", 15000);

        sp1.xuat();   
        sp2.xuat();
    }
}
