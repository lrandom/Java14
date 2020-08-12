/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt6.bt2;

/**
 *
 * @author Lrandom
 */
public class NhanVien {

    public float salary;

    float tinhluong(int sogio) {
        return sogio * salary;
    }

    float tinhluong(int sogio, float thuong) {
        return sogio * salary + thuong;
    }

    float tinhluong(int sogio, float thuong, float phat) {
        return sogio * salary + thuong - phat;
    }

    double tinhluong(int sogio, int thuong, int phat, double heso) {
        return sogio * salary + sogio * salary * heso + thuong - phat;
    }

    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.salary = 100000;
        System.out.printf("\n%10.2f", nv.tinhluong(240));
        System.out.printf("\n%10.2f", nv.tinhluong(240, 2000000));
        System.out.printf("\n%10.2f", nv.tinhluong(240, 2000000, 3000000));
        System.out.printf("\n%10.2f", nv.tinhluong(240, 2000000, 2000000, 5));
    }
}
