/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Lrandom
 */
public class Test2 {
    public static void main(String[] args) {
        /*System.out.println("Vui lòng nhập một số");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        try {
           int number = Integer.parseInt(num); 
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            scanner.next();
        }
        
         
        int mang[] = new int[2];
        mang[0]=1;
        mang[1]=2;
        try {
            System.out.println(mang[4]);
        } catch (Exception e) {
            System.out.println("Loi roi, lai di bro");
        }
        
        String s = null;
        s.toUpperCase();*/
        
        
         System.out.println("Vui lòng nhập vào một số");
         Scanner scanner = new Scanner(System.in);
         int choose = 0;
         boolean isReEnter= true;
         
         while(isReEnter==true){
          try {
             choose = scanner.nextInt();
             isReEnter = false;
          } catch (InputMismatchException e) {
             System.out.println("Vui lòng nhập lại số");
             isReEnter = true;
             scanner.nextLine();
             //choose = scanner.nextInt();
          }
         }
         
         System.out.println(choose);
         
        

    }
}
