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
public class Test3 <T extends Number>{
    public void test(T t){
        System.out.println(t);
    }
    
    public static void main(String[] args) {
        Test3 test = new Test3();
        //test.test();
    }
}
