/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lrandom
 */
public class demo1 {
      public static void main(String[] args) {
          
          
          try {
              /*int num = 10;
              int b=0;
              int banphim=0 ;
              try {
              try {
              b = num/banphim;
              } catch (Exception e) {
              throw e;
              //System.out.println("Vui long cho thang num chia cai khac di, chia 0 sao ma tinh");
              }
              } catch (Exception e) {
              System.out.println("Bat loi tiep");
              System.out.println(e.getMessage());
              }
              
              System.out.println("B value is"+b);*/
              
              
              FileInputStream fis = new FileInputStream(new File("test.txt"));
          } catch (FileNotFoundException ex) {
              Logger.getLogger(demo1.class.getName()).log(Level.SEVERE, null, ex);
          }
         
      }
}
