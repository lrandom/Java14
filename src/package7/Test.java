/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package7;

/**
 *
 * @author Lrandom
 */
public class Test {
    public int total(int a, int b){
        if(a<0){
           throw new ArithmeticException("Vui long nhap so a lon hon 0");
           
        }
        
        if(b<0){
           throw new ArithmeticException("Vui long nhap so b lon hon 0");
        }
        
        return a+b;
    }
    
    public static void main(String[] args) {
        Test test = new Test();
        try {
             int total =  test.total(-1, -1);
             System.out.println(total); 
        } catch (ArithmeticException e) {
             //e.printStackTrace();
             System.out.println(e.getMessage());
             
             System.out.println("Loi roi ban oi");
        } 
    }
}
