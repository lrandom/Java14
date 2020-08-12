/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

/**
 *
 * @author Lrandom
 */
public class TestAno {
    interface EventListener{
        void click();
    }
    
    public void addOnClickListener(EventListener event){
        System.out.println("Display");
    }
    
    public static void main(String[] args) {
        TestAno testAno = new TestAno();
        testAno.addOnClickListener(new EventListener() {
            @Override
            public void click() {
               System.out.println("Hello");
            }
        });
    }
}
