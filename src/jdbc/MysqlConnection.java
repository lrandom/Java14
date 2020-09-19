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

/**
 *
 * @author Lrandom
 */
public class MysqlConnection {
    public static void main(String[] args) {
     
        String urlConnectMySql = 
                "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "koodinh";
        try {
        Connection conn = 
                DriverManager.getConnection(
                        urlConnectMySql
                        ,username
                        ,password); 
           
           //Lấy ra danh sách bản ghi
           Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
           String query = "SELECT * FROM category";
           ResultSet rs= stm.executeQuery(query);
           //rs.next();//1
           //rs.relative(2); //3
           //rs.absolute(2);//2
           rs.absolute(-2);
           while(rs.next()){
               System.out.println(rs.getString("name"));
           }
           
           //Thêm bản ghi
           /*query = "INSERT INTO "
                   + "category(name) VALUES('Volvo')";
           stm.executeUpdate(query);
           
           //Xoá bản ghi 
           query = "DELETE FROM category WHERE id = 1";
           stm.executeUpdate(query);
           
           //Update bản ghi
           query = "UPDATE category SET name='Audi'"
                   + " WHERE id = 2";
           stm.executeUpdate(query);*/
           
           /*PreparedStatement pstm = 
                   conn.prepareStatement("INSERT INTO "
                           + "category(name) VALUES(?)");
           pstm.setString(1, "Karmat");
           pstm.execute();*/
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Không thể kết nối đến CSDL");
        }
    }
}
