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
public class User {
    private float salaryPerHour=200;
    private float bonu=0;
    private float total=0;
    
    public synchronized void calcSalary(int hour){
        this.total=salaryPerHour*hour;
        try {
            wait();
        } catch (Exception e) {
        }
    }
    
    public synchronized void calcSummarySalary(float bonus){
        this.total = total+bonus;
        try {
            notify();
        } catch (Exception e) {
        }
    }
    
    public float totalSalary(){
        return this.total;
    }
}
