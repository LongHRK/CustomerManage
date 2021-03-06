/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import DAL.UserDAL;
import DAL.MessageDialogDAL;
import DAL.ValidatorDAL;
import Enbity.Login;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.IOError;
import javax.swing.JOptionPane;

/**
 *
 * @author LongNguyen
 */
public class fLogin extends javax.swing.JFrame {


    /**
     * Creates new form fLogin
     */
    public fLogin() {
        this.setLocationRelativeTo(null);
        initComponents();
        initIcon();
    }
    
    private void initIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnlogin = new javax.swing.JButton();
        btnsihnup = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\longl\\OneDrive\\Documents\\NetBeansProjects\\CustomerManageer\\image\\user.png")); // NOI18N
        jLabel1.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 5, 10);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\longl\\OneDrive\\Documents\\NetBeansProjects\\CustomerManageer\\image\\pass.png")); // NOI18N
        jLabel2.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 5, 10);
        jPanel2.add(jLabel2, gridBagConstraints);

        txtuser.setColumns(15);
        txtuser.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtuserMouseClicked(evt);
            }
        });
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 5, 10);
        jPanel2.add(txtuser, gridBagConstraints);

        txtpass.setColumns(15);
        txtpass.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpassMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 5, 10);
        jPanel2.add(txtpass, gridBagConstraints);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\longl\\OneDrive\\Documents\\NetBeansProjects\\CustomerManageer\\image\\logo.jpg")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 5, 10);
        jPanel2.add(jLabel3, gridBagConstraints);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 15, 5));

        btnlogin.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        btnlogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\longl\\OneDrive\\Documents\\NetBeansProjects\\CustomerManageer\\image\\login.png")); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel3.add(btnlogin);

        btnsihnup.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        btnsihnup.setIcon(new javax.swing.ImageIcon("C:\\Users\\longl\\OneDrive\\Documents\\NetBeansProjects\\CustomerManageer\\image\\sign up.png")); // NOI18N
        btnsihnup.setText("Sign Up");
        btnsihnup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsihnupActionPerformed(evt);
            }
        });
        jPanel3.add(btnsihnup);

        btncancel.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        btncancel.setIcon(new javax.swing.ImageIcon("C:\\Users\\longl\\OneDrive\\Documents\\NetBeansProjects\\CustomerManageer\\image\\exit.png")); // NOI18N
        btncancel.setText("Exit");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel3.add(btncancel);

        jPanel1.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsihnupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsihnupActionPerformed
        fSignUp fsign = new fSignUp();
        fsign.show();
        this.dispose();
    }//GEN-LAST:event_btnsihnupActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
       if(MessageDialogDAL.showConfirmDialog(this, "Do you want to exit", "Notification") != 
               JOptionPane.NO_OPTION){
           System.exit(0);
       }
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        StringBuilder sbd = new StringBuilder();
        ValidatorDAL.ValidateEnbity(txtuser, sbd, "Please enter your username");
        ValidatorDAL.ValidateEnbity(txtpass, sbd, "Please enter your password");
        
        if(sbd.length() > 0){
            MessageDialogDAL.showErrorrDialog(this, sbd.toString(), "Errorr");
            return;
        }
        UserDAL user = new UserDAL();
        try {
            Login lg = user.CheckLogin(txtuser.getText(), new String(txtpass.getPassword()));
            
            if(lg == null){
                MessageDialogDAL.showErrorrDialog(this, "Username and password do not match", "Errorr");
            }else{
                fCustomer fcustomer = new fCustomer();
                fcustomer.show();
                this.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        
    }//GEN-LAST:event_txtuserActionPerformed

    private void txtuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMouseClicked
        txtuser.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtuserMouseClicked

    private void txtpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassMouseClicked
        txtpass.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtpassMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(MessageDialogDAL.showConfirmDialog(this, "Do you want to exit", "Notification") != 
               JOptionPane.NO_OPTION){
            System.exit(0);
       }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsihnup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
