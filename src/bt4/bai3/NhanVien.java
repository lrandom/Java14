/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4.bai3;

/**
 *
 * @author Lrandom
 */
public class NhanVien {
    private int id;
    private String name;
    private int age;
    private String chucVu;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(int id, String name, int age, String chucVu, double luong) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    
    
}
