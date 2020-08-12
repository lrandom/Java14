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
public class Car1 extends Car{

    @Override
    public void run() {
        super.run();
        System.out.println("Running car child");
    }

    
   
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.run();
    }
    
    
}
