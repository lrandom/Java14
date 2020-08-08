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
public class Test {

    public Test() {

    }
    
    public static void main(String[] args) {
           Animal a =new Animal() {
           @Override
           void go() {
               System.out.println("Đi");
           }

           @Override
           void run() {
               System.out.println("Chạy");
           }
       };
       
       a.go();
       
       Dog dog = new Dog();
       dog.go();
    }
    
}
