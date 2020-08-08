/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt5.b1;

/**
 *
 * @author Lrandom
 */
public class Car extends Vehicle{

    public Car(int price, String color) {
        super(price, color);
    }
    
    public void printDetails(){
        System.out.println("Gia la"+this.price);
        System.out.println("Mau la"+this.color);
    }
}

