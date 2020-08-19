/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

/**
 *
 * @author Lrandom
 */
public class DemoGenericMethod {
    public<N> void display(N num){
        System.out.println("So n la" +num);
    }
    
//    public void display(Float n){
//        System.out.println(n);
//    }
//    
//    public void display(Integer n){
//        System.out.println(n);
//    }
    
    public static void main(String[] args) {
        DemoGenericMethod demoGenericMethod = new DemoGenericMethod();
        Float num = new Float(0.1);
        demoGenericMethod.display(num);
        
        Integer num2 = new Integer(1);
        demoGenericMethod.display(num2);
        
        
    }
}
