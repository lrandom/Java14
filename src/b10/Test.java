/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lrandom
 */
public class Test {

    public static void main(String[] args) {
        User user = new User();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    user.calcSalary(300);
                    try {
                    
                        System.out.println(user.totalSalary());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                   
                }
            
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                    try {
                        Thread.sleep(6000);
                        user.calcSummarySalary(1000000);
                       
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                
            }
        });

        t1.start();
        t2.start();
    }
}
