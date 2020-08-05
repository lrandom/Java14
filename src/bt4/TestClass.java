/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

/**
 *
 * @author Lrandom
 */
public class TestClass {
    public static void main(String[] args) {
        HinhVuong hinhvuong = new HinhVuong(100);
        System.out.println(hinhvuong.tinhChuVi()); 
        System.out.println(hinhvuong.tinhDientich());
        
        //HinhTamgiac hinhTamgiac = new HinhTamgiac(10, 10, 10);
        HinhTamgiac hinhTamgiac = new HinhTamgiac();
        hinhTamgiac.setCanhA(10);
        hinhTamgiac.setCanhB(20);
        hinhTamgiac.setCanhC(30);
        System.out.println(hinhTamgiac.tinhChuvi());
        System.out.println(hinhTamgiac.tinhDientich());
    }
}
