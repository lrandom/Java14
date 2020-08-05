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
public class HinhTamgiac {
    public int canhA;
    public int canhB;
    public int canhC;

    public void setCanhA(int canhA) {
        this.canhA = canhA;
    }

    public void setCanhB(int canhB) {
        this.canhB = canhB;
    }

    public void setCanhC(int canhC) {
        this.canhC = canhC;
    }
    
    public HinhTamgiac(){
        
    }

    public HinhTamgiac(int canhA, int canhB, int canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }
    
    public int tinhChuvi(){
        return this.canhA+this.canhB+this.canhC;
    }
    
    public double tinhDientich(){
        float p = this.tinhChuvi()/2;
        double tmp = p*(p-this.canhA)*(p-this.canhB)*(p-this.canhC);
        tmp = Math.sqrt(tmp);
        tmp = tmp/4;
        return tmp;
    }
}
