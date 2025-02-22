/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projek_akhir;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author sigma
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        conn = new Koneksi();
        initComponents();
    }
private void login() {
  
    try {
        String adminSql = "SELECT * FROM admin WHERE username = ? AND password = ?";
        PreparedStatement adminStatement = conn.getConnection().prepareStatement(adminSql);
        adminStatement.setString(1, t1.getText());
        adminStatement.setString(2, new String(t2.getPassword()));
        ResultSet adminRs = adminStatement.executeQuery();

        if (adminRs.next()) {
            JOptionPane.showMessageDialog(null, "Login Sebagai Admin Berhasil","Sukses",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            Admin admin = new Admin();
            admin.setVisible(true);
        } else {
            String userSql = "SELECT * FROM register WHERE username = ? AND password = ?";
            PreparedStatement userStatement = conn.getConnection().prepareStatement(userSql);
            userStatement.setString(1, t1.getText());
            userStatement.setString(2, new String(t2.getPassword()));
            ResultSet userRs = userStatement.executeQuery();

            if (userRs.next()) {
                JOptionPane.showMessageDialog(null, "Login Anda Berhasil!","Sukses",JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                User user = new User();
                user.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Username Dan Password Anda Salah","Gagal Masuk",JOptionPane.ERROR_MESSAGE);
                t1.setText("");
                t2.requestFocus();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


 
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Mouse = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(153, 0, 153));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 0, 153));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("APLIKASI PEGADAIAN");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 310, -1));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("AJUKAN DIMANAPUN BISA MUDAH DAN CEPAT");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 340, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Java\\Projek_Akhir2\\src\\Gambar\\Gambar WhatsApp 2023-11-26 pukul 21.55.49_ed1309e7.jpg")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        Panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 680));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PEGADAIAN");
        Panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 130, 160, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        Panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        Panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, -1, -1));

        t1.setBackground(new java.awt.Color(153, 0, 153));
        t1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        Panel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 270, 32));

        t2.setBackground(new java.awt.Color(153, 0, 153));
        t2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        Panel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 270, 32));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 98, 30));

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Hapus");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 98, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Don't Have an Account?");
        Panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, -1, -1));

        Mouse.setBackground(new java.awt.Color(0, 0, 255));
        Mouse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mouse.setForeground(new java.awt.Color(255, 255, 255));
        Mouse.setText("Register");
        Mouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseMouseClicked(evt);
            }
        });
        Panel1.add(Mouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, 60, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("LOGIN AT");
        Panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void MouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseMouseClicked
        this.setVisible(false);
        Register New = new Register();
        New.setVisible(true);
    }//GEN-LAST:event_MouseMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        t1.setText("");
        t2.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     login();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    Koneksi conn;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mouse;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables
}
