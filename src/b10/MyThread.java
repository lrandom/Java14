/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b10;

/**
 *
 * @author Lrandom
 */
public class MyThread extends Thread{
    private int sleepTime = 0;
    public MyThread(String name,int sleep) {
        super(name);
        this.sleepTime = sleep;
    }
    
    
    
    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < 10; i++) {
            System.out.println(getName());
            System.out.println(i);
            try {
                sleep(sleepTime);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("Luong 1",2000);
        MyThread t2 = new MyThread("Luong 2",3000);
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        t1.start();
        //t1.join();
        t2.start();
        
        
        /*Thread thread = new Thread(new MyThread2());
        thread.start();*/
    }
    
}
