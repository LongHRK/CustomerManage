/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Enbity.Customer;
import Enbity.CustomerType;
import Enbity.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LongNguyen
 */
public class CustomerDAL {

    public boolean AddCustomer(Customer cs) throws SQLException {
        String sql = "INSERT INTO customer "
                + "VALUES (?,?,?,?,?)";

        try (Connection cnn = DataConnect.openConnect();
                PreparedStatement psm = cnn.prepareStatement(sql);) {
            psm.setNString(1, cs.getId());
            psm.setNString(2, cs.getTypeid());
            psm.setNString(3, cs.getName());
            psm.setString(4, cs.getPhone());
            psm.setNString(5, cs.getEmail());

            return psm.executeUpdate() > 0;
        }
    }

    public boolean UpdateCustomer(Customer cs) throws SQLException {
        String sql = "UPDATE customer SET typeid=?,fullname=?,phone=?,email=? "
                + "WHERE id=?";

        try (Connection cnn = DataConnect.openConnect();
                PreparedStatement psm = cnn.prepareStatement(sql);) {

            psm.setString(1, cs.getTypeid());
            psm.setString(2, cs.getName());
            psm.setString(3, cs.getPhone());
            psm.setString(4, cs.getEmail());
            psm.setString(5, cs.getId());

            return psm.executeUpdate() > 0;
        }
    }

    public boolean DeleteCustomer(String id) throws SQLException {
        String sql = "DELETE FROM customer WHERE id=?";

        try (Connection cnn = DataConnect.openConnect();
                PreparedStatement psm = cnn.prepareStatement(sql);) {
            psm.setString(1, id);
            return psm.executeUpdate() > 0;
        }
    }

    public List<Customer> FillDataTable() throws SQLException {
        String sql = "Select * from customer";

        try (Connection cnn = DataConnect.openConnect();
                PreparedStatement pst = cnn.prepareStatement(sql)) {
            try (ResultSet rs = pst.executeQuery()) {
                List<Customer> list = new ArrayList<>();
                while (rs.next()) {
                    Customer cs = new Customer();
                    cs.setTypeid(rs.getNString("typeid"));
                    cs.setId(rs.getNString("id"));
                    cs.setName(rs.getNString("fullname"));
                    cs.setPhone(rs.getString("phone"));
                    cs.setEmail(rs.getString("email"));
                    list.add(cs);
                }
                return list;
            }
        }
    }
    
    public List<Customer> FillDataTableByID(String idtype) throws SQLException {
        String sql = "Select * from customer where typeid=?";

        try (Connection cnn = DataConnect.openConnect();
                PreparedStatement pst = cnn.prepareStatement(sql)) {
            pst.setNString(1, idtype);
            try (ResultSet rs = pst.executeQuery()) {
                List<Customer> list = new ArrayList<>();
                while (rs.next()) {
                    Customer cs = new Customer();
                    cs.setId(rs.getNString("id"));
                    cs.setName(rs.getNString("fullname"));
                    cs.setPhone(rs.getString("phone"));
                    cs.setEmail(rs.getString("email"));
                    list.add(cs);
                }
                return list;
            }
        }
    }
    
    public Customer FindCustomer(String id) throws SQLException {
        String sql = "Select * from customer where id=?";

        try (Connection cnn = DataConnect.openConnect();
                PreparedStatement pst = cnn.prepareStatement(sql)) {
            pst.setNString(1, id);
            try (ResultSet rs = pst.executeQuery()) {
                
                if(rs.next()) {
                    Customer cs = new Customer();
                    cs.setId(rs.getNString("id"));
                    cs.setTypeid(rs.getNString("typeid"));
                    cs.setName(rs.getNString("fullname"));
                    cs.setPhone(rs.getString("phone"));
                    cs.setEmail(rs.getString("email"));
                    return cs;
                }
            }
        }
        return null;
    }

}
