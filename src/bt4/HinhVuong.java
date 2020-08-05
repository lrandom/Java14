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
public class HinhVuong {
    int chieuDaiCanh;

    public HinhVuong(int chieuDaiCanh) {
        this.chieuDaiCanh = chieuDaiCanh;
    }
    
    

    public void setChieuDaiCanh(int chieuDaiCanh) {
        this.chieuDaiCanh = chieuDaiCanh;
    }

    public int tinhChuVi(){
        return this.chieuDaiCanh*4;
    }
    
    public int tinhDientich(){
        return this.chieuDaiCanh*this.chieuDaiCanh;
    }
}
