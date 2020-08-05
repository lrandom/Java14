/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4.bai3;

import java.util.Scanner;

/**
 *
 * @author Lrandom
 */
public class TestClass {
    public static void main(String[] args) {
        System.out.println("Moi ban nhap so nhan vien");
        Scanner scanner = new Scanner(System.in);
        int soNhanVien = scanner.nextInt();
        
        NhanVien[] nhanviens = new NhanVien[soNhanVien];
        for (int i = 0; i < nhanviens.length; i++) {
            System.out.println("Xin moi nhap nhan vien thu "+(i+1));
            Scanner scanner1 = new Scanner(System.in);
            int id = scanner1.nextInt();
            scanner1.nextLine();
            String name = scanner1.nextLine();
            int age = scanner1.nextInt();
            scanner1.nextLine();
            String chucVu = scanner1.nextLine();
            double luong = scanner1.nextDouble();
            NhanVien nhanVien = new NhanVien(id, name, age, chucVu, luong);
            nhanviens[i] = nhanVien;
        }
        
        NhanVienDal nvDal = new NhanVienDal();
        nvDal.timKiemNV(nhanviens);
        nvDal.sapxep(nhanviens, true);
        nvDal.sapxep(nhanviens, false);
        
    }
}
