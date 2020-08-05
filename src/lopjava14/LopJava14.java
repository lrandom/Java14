/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopjava14;
import java.util.Scanner;
/**
 *
 * @author Lrandom
 */
public class LopJava14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int num = 5;
        int age = 18;
        boolean troiMua = true;
        int sosanh = 10;*/
        // TODO code application logic here
        /*System.out.println("Hello các bạn, Mình tên là Luân");
        System.out.printf("%d %d %s",10,10,"helelo");*/
        
        
        //Nhap thong tin vao man hinh console
        /*
          Nhap thong tin vao man hinh
          Nhap so vao man hinh
        */
        /*System.out.println("Moi ban nhap so");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        System.out.println("Ban vua nhap vao so " + num);*/
        
        //int num1= (true)?1:2;
        /*if(true){
           num1 = 1;
        }else{
           num1 = 2;
        }*/
       // System.out.println(num1);
       
       //Kiem tra so NT
       /*System.out.println("Vui long nhap vao mot so");
       Scanner scanner = new Scanner(System.in);
       num = scanner.nextInt();
       if(soNT(num)==true){
           System.out.println("Day la só nt");
       }else{
           System.out.println("Day 0 phai la so nt");
       }
       
       if(soHoanHao(num)==true){
           System.out.println("Day la so hoan hao");
       }else{
           System.out.println("Day 0 phai so hoan hao");
       }*/
       
       /*if(age == 18){
           System.out.println("Bạn được phép truy cập vào website");
       }
       if(age==18)
           System.out.println("Bạn được phép truy cập vào website");
       
       if(troiMua==true){
           //neu troi mua 
           System.out.println("Minh se khong di choi");
       }else{
           System.out.println("Minh di choi");
       }
       
       
       if(sosanh==10){
           System.out.println("So sanh bang 10");
       }else if(sosanh == 20){
           System.out.println("So sanh bang 20");
       }else if(sosanh ==30){
           System.out.println("So sanh bang 30");
       }
       
       if(sosanh ==10){
       
       }else{
          if(sosanh==20){
          
          }
       }
       
       
       switch(num){
           case 5:
               System.out.println("Hello");
               break;
               
           case 6:
               System.out.println("Hi");
               break;
               
           case 7: 
               System.out.println("Xin chao");
               break;
               
           default:
               System.out.println("Khong vao trương hop nao ca");
               break;
               
       }*/
       /*int a = 0;
       do{
           System.out.println(a);
           a++;
       }while(a<10);
       
       while(a<20){
           System.out.println(a);
           a++;
       }*/
       
       /*for(int i =0 ;i<10;i++){
           System.out.println(i);
       }*/
       /*Human luan = new Human("Mat nau", "Toc den");
        
       System.out.println(luan.eyeColor);
       
       luan.run(); //Im running*/
       
       /*TestClass test1 = new TestClass();
       Human human = new Human("Den", "Den");
       test1.test(human);
       System.out.println(human.eyeColor);*/
       
       System.out.println(Human.greeting); //goi thuoc tinh
       Human.getMyGreeting();//goi pt tinh
    }
    
    
    /*public static boolean soNT(int num){
        for(int i = 2;i<num;i++){
           if(num%i==0){
              return false;
           }
        }
        return true;
    }
    
    public static boolean soHoanHao(int num){
       int tong=0;
       for(int i=1;i<num;i++){
         if(num%i==0){
            tong = tong+i;
         }
       }
       
       //so hoan hao
       if(tong==num){
         return true;
       }
       
       return false;
    }*/
    
    
}
