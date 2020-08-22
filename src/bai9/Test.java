/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;

/**
 *
 * @author Lrandom
 */
public class Test {
    public static void main(String[] args) {
        /*try {
            FileInputStream fis = new FileInputStream("data.txt");
            int data = 0;
            while((data=fis.read()) !=-1 ){
                System.out.println((char)data);
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        /*
        try {
             FileInputStream fis = new FileInputStream("data.txt");
             BufferedInputStream buf = new BufferedInputStream(fis);
             int data = 0;
             while( (data=buf.read())!=-1){
                 System.out.println((char)data);
             }
             buf.close();
             fis.close();
        } catch (Exception e) {
             e.printStackTrace();
        }*/
            
            
        //File Reader
        /*try {
            FileReader fileReader = new FileReader("data.txt");
            int data = 0;
            while( (data=fileReader.read())!=-1){
                System.out.println((char)data);
            }
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        //BufferFileReader 
        /*try {
            FileReader fileReader = new FileReader("data.txt");
            BufferedReader buf = new BufferedReader(fileReader);
            String read = "";
            while( (read=buf.readLine())!=null){
                System.out.println(read);
            }
            fileReader.close();
            buf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        /*try {
            FileOutputStream fos = new FileOutputStream(new File("data2.txt"));
            String content = "Hello bro";
            fos.write(content.getBytes());
            fos.flush(); // đẩy dữ liệu vào file
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        /*try {
            FileOutputStream fos = new FileOutputStream(new File("data2.txt"));
            BufferedOutputStream bus = new BufferedOutputStream(fos);
            bus.write("Test".getBytes());
            bus.flush();
            bus.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /*try {
            FileWriter fileWriter =new FileWriter(new File("data3.txt"));
            BufferedWriter bus = new BufferedWriter(fileWriter);
            bus.write("Hello helele");
            bus.newLine();
            bus.write("I am Luan");
            bus.newLine();
            bus.write("28 years old");
            
            
            //fileWriter.close();
            bus.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        /*try {
             File file = new File("data3.txt");
             
             System.out.println(file.exists());
             
             File file1 = new File("hihi");
             file1.mkdir();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        
       
        //Ghi đối tượng
        try {
            FileOutputStream fos = new FileOutputStream("data.dat");
            ObjectOutputStream obj = new ObjectOutputStream(fos);
            Employee emp = new Employee(1, "Luan", 20);
            obj.writeObject(emp);
            obj.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //Đọc đối tượng
        try {
            FileInputStream fis = new FileInputStream("data.dat");
            ObjectInputStream objIn = new ObjectInputStream(fis);
            Employee employee = (Employee)objIn.readObject();
            System.out.println("Thong tin nhan vien");
            System.out.println("Id"+employee.id);
            System.out.println("Name"+employee.name);
            System.out.println("Age"+employee.age);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //Vi du download file
        try {
            URL url = new URL("https://1.bp.blogspot.com/-n_bFzL9lPUU/Xp23H9Sk8yI/AAAAAAAAhyA/JYfvZhwguxc8vT_YS3w14Xi3YWf3hxqIQCLcBGAsYHQ/s1600/Hinh-Anh-Dep-Tren-Mang%2B%25282%2529.jpg");
            InputStream ip =  url.openStream();
            
            FileOutputStream fos = new FileOutputStream(new File("anh_dep.jpg"));
            BufferedInputStream buf = new BufferedInputStream(ip);
            int b = 0;
            while((b = buf.read())!=-1){
                fos.write(b);
                fos.flush();
            }
            
            ip.close();
            fos.close();
            buf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
