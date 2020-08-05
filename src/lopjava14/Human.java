/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopjava14;

/**
 *
 * @author Lrandom
 */
class Human {
    
   public Human(String eyeColor,String hairColor){
      this.eyeColor = eyeColor;
      this.hairColor = hairColor;
   }
   

   public String eyeColor= "";
   public String hairColor= "";
   public static String greeting = "greeting";
   
   public static void getMyGreeting(){
       System.out.println("Hello"+greeting);
   }
   
   public void run(){
       System.out.println("Im running");
   }
   
   public void eat(){
       System.out.println("Im eating");
   }
   
   public void sleep(){
       System.out.println("Im sleeping");
   }
   
   
   
}
