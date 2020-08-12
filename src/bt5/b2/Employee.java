/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt5.b2;

/**
 *
 * @author Lrandom
 */
public class Employee {
    private int id;
    String name;
    public String address;
    float balance;
    
    public void display(){
        System.out.println("ID la"+this.id);
        System.out.println("Name la"+this.name);
        System.out.println("Address la"+this.address);
        System.out.println("Balance la"+this.balance);
    }
    
}
