/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Lrandom
 */
public class MainClass {
    public static void main(String[] args) {
        Connection conn = null;
        String urlConnectMySql = 
                "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "koodinh";
        try {
        conn = 
                DriverManager.getConnection(
                        urlConnectMySql
                        ,username
                        ,password); 
        }catch(Exception e){
           e.printStackTrace();
        }
        
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        do {        
             System.out.println("Vui long chon");
             System.out.println("1. Thêm NV");
             System.out.println("2. Xem danh sách NV");
             System.out.println("3. Thoát");
            choose = scanner.nextInt();
            switch(choose){
                case 1:
                    System.out.println("Vui long nhap thong tin");
                    scanner.nextLine();
                    System.out.println("Name");
                    String name = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Address");
                    String address = scanner.nextLine();
                    String query = "insert into employee(name,address) values(?,?)";
                    try {
                        PreparedStatement preparedStm =  conn.prepareCall(query);
                        preparedStm.setString(1, name);
                        preparedStm.setString(2, address);
                        int rowSuccess = preparedStm.executeUpdate();
                        if(rowSuccess>0){
                            System.out.println("Thêm nv thành công");
                        }else{
                            System.out.println("Thêm nv thất bại");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                   
                    break;
                    
                case 2:
                    query = "SELECT * FROM employee";
                    try {
                         Statement stm =  conn.createStatement();
                         ResultSet result = stm.executeQuery(query);
                         while(result.next()){
                             System.out.println("Id");
                             System.out.println(result.getInt("id"));
                             System.out.println("Name");
                             System.out.println(result.getString("name"));
                             System.out.println("Address");
                             System.out.println(result.getString("address"));
                         }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                   
                    break;
                    
                case 3:
                    try {
                        conn.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                   
                    break;
            }
        } while (choose!=3);
    }
}
