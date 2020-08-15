/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package7;

/**
 *
 * @author Lrandom
 */
public class Amount {
    float balance = 1000; //so tk 
    float amount = 5000;//so tien muon rut
    
    public void withdraw() throws TestException{
        if(amount <= balance){
           balance -=amount;   
        }else{
           System.out.println("Tien khong du");
            try {  
               throw new TestException();
            } catch (Exception e) {
               System.out.println(e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) throws TestException {
       Amount amount = new Amount();
       amount.withdraw();
    }
}
