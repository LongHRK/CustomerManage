/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DAL.DataConnect;
import Enbity.Customer;
import Enbity.CustomerType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LongNguyen
 */
public class CustomerTypeDAL {

    public List<CustomerType> FillDataCustomerTypes() throws SQLException {
        String sql = "Select * From customertype";

        try (Connection cnn = DataConnect.openConnect();
                PreparedStatement pst = cnn.prepareStatement(sql)) {
            try (ResultSet rs = pst.executeQuery()) {
                List<CustomerType> list = new ArrayList<>();
                while (rs.next()) {
                    CustomerType cst = new CustomerType();
                    cst.setTypeid(rs.getNString("typeid"));
                    cst.setNametype(rs.getNString("NameType"));
                    list.add(cst);
                }
                return list;
            }
        }
    }
    
}
