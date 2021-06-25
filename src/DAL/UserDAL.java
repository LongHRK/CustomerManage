/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Enbity.Customer;
import Enbity.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author LongNguyen
 */
public class UserDAL {
    public Login CheckLogin(String user ,String pass){
        String sql = "select * from login where usernames=? and passwords=?";
        
        try (   Connection cnn = DataConnect.openConnect();
                PreparedStatement psm = cnn.prepareStatement(sql);){
            psm.setString(1, user);
            psm.setString(2, pass);
            try (ResultSet rs = psm.executeQuery()){
                if(rs.next()){
                    Login lg = new Login();
                    lg.setUsername(user);
                    return lg;
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public boolean CheckUser(String user){
        String sql = "select * from login where usernames=?";
        
        try (   Connection cnn = DataConnect.openConnect();
                PreparedStatement psm = cnn.prepareStatement(sql);){
            psm.setString(1, user);
            try (ResultSet rs = psm.executeQuery()){
                if(rs != null && rs.next()){
                    return false;
                }else{
                    return true;
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        return true;
    }
    
    public boolean AddUser(Login lg) throws SQLException {
        String sql = "INSERT INTO login "
                + "VALUES (?,?)";

        try (Connection cnn = DataConnect.openConnect();
                PreparedStatement psm = cnn.prepareStatement(sql);) {
            psm.setNString(1, lg.getUsername());
            psm.setString(2, lg.getPassword());
            return psm.executeUpdate() > 0;
        }
    }
}
