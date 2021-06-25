/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author LongNguyen
 */
public class ValidatorDAL {
    public static void ValidateEnbity(JTextField txt,StringBuilder bd ,String err){
        if(txt.getText().equals("")){
            bd.append(err).append("\n");
            txt.setBackground(Color.RED);
            txt.requestFocus();
        }
        else{
            txt.setBackground(Color.WHITE);
        }
    }
    
    public static void ValidateEnbity(JPasswordField txt,StringBuilder bd ,String err){
        String pass = new String(txt.getPassword());
        if(pass.equals("")){
            bd.append(err).append("\n");
            txt.setBackground(Color.RED);
            txt.requestFocus();
        }
        else{
            txt.setBackground(Color.WHITE);
        }
    }
    
    public static void ValidateEnbity(JComboBox cb,StringBuilder bd ,String err){
        if(cb.getSelectedIndex() == -1){
            bd.append(err).append("\n");
            cb.requestFocus();
        }
    }
}
