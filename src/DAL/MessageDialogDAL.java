/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author LongNguyen
 */
public class MessageDialogDAL {
    public static void showMrssageDialog(Component paren,String content, String title){
        JOptionPane.showMessageDialog(paren, content,title,JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showErrorrDialog(Component paren,String content, String title){
        JOptionPane.showMessageDialog(paren, content,title,JOptionPane.ERROR_MESSAGE);
    }
    
    public static int showConfirmDialog(Component paren,String content, String title){
        int check = JOptionPane.showConfirmDialog(paren, content,title,
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return check;
    }
}
