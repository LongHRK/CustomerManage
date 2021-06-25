/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LongNguyen
 */
public class DataConnect {
    private static String url = "jdbc:mysql://localhost:3306/CustomerManage";
    private static String user = "root";
    private static String pass = "";
    
    public static Connection openConnect() throws SQLException{
            Connection cnn = DriverManager.getConnection(url,user,pass);
            System.out.println("success Connect");
            return cnn;
    }
}
