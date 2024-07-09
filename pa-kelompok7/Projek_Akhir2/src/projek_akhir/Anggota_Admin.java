/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projek_akhir;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Date;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author sigma
 */
public class Anggota_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Anggota_Admin
     */
    public Anggota_Admin() {
         Koneksi conn = new Koneksi();
        initComponents();
        table();
        cari();
        hapus();
    }
    

   //      void ambilID() {
//    Koneksi conn = new Koneksi();
//
//    try {
//        Statement st = conn.getConnection().createStatement();
//        ResultSet rs = st.executeQuery("SELECT id FROM register ORDER BY username ASC");
//
//        if (rs.next()) {
//            id.setText("");
//        }
//
//        st.close();
//    } catch (Exception e) {
//        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
//    }
//}
    

 void cari() {
    Koneksi conn = new Koneksi();
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.addColumn("ID");
    tableModel.addColumn("NIK");
    tableModel.addColumn("Username");
    tableModel.addColumn("Nama");
    tableModel.addColumn("No. Telp");
    tableModel.addColumn("Jenis Kelamin");
    tableModel.addColumn("Tanggal");
    tableModel.addColumn("Alamat");

    try {
        String nikToSearch = "%" + pencarian.getText() + "%";

        String query = "SELECT * FROM anggota WHERE nik LIKE ?";
        PreparedStatement preparedStatement = conn.getConnection().prepareStatement(query);
        preparedStatement.setString(1, nikToSearch);

        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            java.util.Date tanggalDate = rs.getDate("tanggal");

            Object[] rowData = new Object[] {
                rs.getString("id"),
                rs.getString("nik"),
                rs.getString("username_user"),
                rs.getString("nama"),
                rs.getString("telp"),
                rs.getString("jenis_kelamin"),
                rs.getString("tanggal"),
                rs.getString("alamat"),
            };

            tableModel.addRow(rowData);
        }

        Tabel.setModel(tableModel);
        preparedStatement.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
    }
}

        
//    void cari() {
//         Koneksi conn = new Koneksi();
//    DefaultTableModel tableModel = new DefaultTableModel();
//    tableModel.addColumn("ID");
//    tableModel.addColumn("NIK");
//    tableModel.addColumn("Username");
//    tableModel.addColumn("Nama");
//    tableModel.addColumn("No. Telp");
//    tableModel.addColumn("Jenis Kelamin");
//    tableModel.addColumn("Tanggal");
//    tableModel.addColumn("Alamat");
//    
//    try {
//                String nimToSearch = "%" + pencarian.getText() + "%"; 
//
//        Statement st = conn.getConnection().createStatement();
//        ResultSet rs = st.executeQuery("SELECT * FROM anggota");
//
//        while (rs.next()) {
//            java.util.Date tanggalDate = rs.getDate("tanggal");
////            String idRegister = rs.getString("id"); // Ambil nilai ID dari register
//
//            // Menambahkan data ke dalam tabelModel
//            Object[] rowData = new Object[] {
////                idRegister, // Menambahkan ID ke dalam rowData
//                rs.getString("id"),
//                rs.getString("nik"),
//                rs.getString("username_user"),
//                rs.getString("nama"),
//                rs.getString("telp"),
//                rs.getString("jenis_kelamin"),
//                rs.getString("tanggal"),
//                rs.getString("alamat"),
//            };
//
//            tableModel.addRow(rowData);
//        }
//
//        Tabel.setModel(tableModel);
//        st.close();
//    } catch (Exception e) {
//        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
//    }
//}
    
    private void hapus(){
        nik.setText("");
        username.setText("");
        nama.setText("");
        telp.setText("");
        grup.clearSelection();
        username.setText("");
        Tanggal.setDate(null);
    }
    
     private void table() {
    Koneksi conn = new Koneksi();
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.addColumn("ID"); 
    tableModel.addColumn("NIK");
    tableModel.addColumn("Username");
    tableModel.addColumn("Nama");
    tableModel.addColumn("No. Telp");
    tableModel.addColumn("Jenis Kelamin");
    tableModel.addColumn("Tanggal");
    tableModel.addColumn("Alamat");

    try {
        Statement st = conn.getConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM anggota");

        while (rs.next()) {
            java.util.Date tanggalDate = rs.getDate("tanggal");
//            String idRegister = rs.getString("id"); // Ambil nilai ID dari register

            // Menambahkan data ke dalam tabelModel
            Object[] rowData = new Object[] {
//                idRegister, // Menambahkan ID ke dalam rowData
//                rs.getString("id"),
                rs.getString("id"),
                rs.getString("nik"),
                rs.getString("username_user"),
                rs.getString("nama"),
                rs.getString("telp"),
                rs.getString("jenis_kelamin"),
                rs.getString("tanggal"),
                rs.getString("alamat"),
            };

            tableModel.addRow(rowData);
        }

        Tabel.setModel(tableModel);
        st.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
    }
    hapus();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nik = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        telp = new javax.swing.JTextField();
        laki = new javax.swing.JRadioButton();
        perem = new javax.swing.JRadioButton();
        Simpan = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        Edit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        pencarian = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Tanggal = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nik.setBackground(new java.awt.Color(204, 0, 204));
        nik.setForeground(new java.awt.Color(255, 255, 255));
        nik.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 200, 20));

        nama.setBackground(new java.awt.Color(204, 0, 204));
        nama.setForeground(new java.awt.Color(255, 255, 255));
        nama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 200, 20));

        telp.setBackground(new java.awt.Color(204, 0, 204));
        telp.setForeground(new java.awt.Color(255, 255, 255));
        telp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 200, 20));

        grup.add(laki);
        laki.setForeground(new java.awt.Color(255, 255, 255));
        laki.setText("Pria");
        jPanel1.add(laki, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 90, 30));

        grup.add(perem);
        perem.setForeground(new java.awt.Color(255, 255, 255));
        perem.setText("Wanita");
        jPanel1.add(perem, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 70, 30));

        Simpan.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Simpan.setForeground(new java.awt.Color(204, 0, 204));
        Simpan.setText("Daftar");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        jPanel1.add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, 30));

        Hapus.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Hapus.setForeground(new java.awt.Color(204, 0, 204));
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 70, 30));

        username.setBackground(new java.awt.Color(204, 0, 204));
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 200, 20));

        Edit.setBackground(new java.awt.Color(204, 0, 204));
        Edit.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setText("Edit");
        Edit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel1.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 70, 40));

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 810, 250));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 204));
        jButton3.setText("Cari");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 343, -1, 30));
        jPanel1.add(pencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 342, 250, 30));

        jButton4.setBackground(new java.awt.Color(204, 0, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("EXIT");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 70, 40));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NIK");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NAMA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 37, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NO. TELP");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 24));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("USERNAME");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 62, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TANGGAL GABUNG");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("JENIS KELAMIN");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon("D:\\Java\\Projek_Akhir2\\src\\Gambar\\LOGO.png")); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 120, 160));

        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\Java\\Projek_Akhir2\\src\\Gambar\\—Pngtree—blue purple gradient circle_5487754 (1).png")); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, -280, 700, 650));

        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\Java\\Projek_Akhir2\\src\\Gambar\\—Pngtree—blue purple gradient circle_5487754 (1).png")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 280, 700, 650));
        jPanel1.add(Tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 160, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ALAMAT");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 62, 20));

        alamat.setBackground(new java.awt.Color(204, 0, 204));
        alamat.setForeground(new java.awt.Color(255, 255, 255));
        alamat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 200, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cari();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JOptionPane.showMessageDialog(null, "Apakah Yakin Untuk Keluar");
        this.setVisible(false);
        Admin New = new Admin();
        New.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        String jk = null;

    if (laki.isSelected()) {
        jk = "Pria";
    } else if (perem.isSelected()) {
        jk = "Wanita";
    }

    String tmpl = "yyyy-MM-dd";
    SimpleDateFormat fn = new SimpleDateFormat(tmpl);
    String tanggal = fn.format(Tanggal.getDate());

    try {
        Koneksi conn = new Koneksi();

        String usernameRegister = username.getText();

        // Mengambil ID dari tabel register berdasarkan username
        String sqlID = "SELECT id FROM register WHERE username = ?";
        PreparedStatement pstID = conn.getConnection().prepareStatement(sqlID);
        pstID.setString(1, usernameRegister);
        ResultSet rsID = pstID.executeQuery();

        if (rsID.next()) {
            String idRegister = rsID.getString("id");

            // Melakukan penambahan data ke tabel anggota dengan memasukkan id dari register
            String sqlAnggota = "INSERT INTO anggota (nik, id, username_user, nama, telp, jenis_kelamin, tanggal, alamat) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstAnggota = conn.getConnection().prepareStatement(sqlAnggota);

            pstAnggota.setString(1, nik.getText());
            pstAnggota.setString(2, idRegister); // Menggunakan ID dari register
            pstAnggota.setString(3, username.getText()); 
            pstAnggota.setString(4, nama.getText());
            pstAnggota.setString(5, telp.getText());
            pstAnggota.setString(6, jk);
            pstAnggota.setString(7, tanggal);
            pstAnggota.setString(8, alamat.getText());

            pstAnggota.executeUpdate();
            pstAnggota.close();

            table();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        } else {
            JOptionPane.showMessageDialog(null, "Username tidak ditemukan, data tidak disimpan");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
    }
    }//GEN-LAST:event_SimpanActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
    try {
    Koneksi conn = new Koneksi();

    // Ambil nilai nik yang ingin dihapus
    String nikValue = nik.getText();

    String sql = "DELETE FROM anggota WHERE nik = ?";
    PreparedStatement pst = conn.getConnection().prepareStatement(sql);

    pst.setString(1, nikValue);

    int rowsAffected = pst.executeUpdate();

    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        table(); // Memperbarui tampilan tabel setelah penghapusan
        hapus(); // Clear fields setelah data dihapus
    } else {
        JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
    }

    pst.close();
} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
}
    }//GEN-LAST:event_HapusActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
     try {
    Koneksi conn = new Koneksi();

    String usernameRegister = username.getText();
    String sqlID = "SELECT id FROM register WHERE username = ?";
    PreparedStatement pstID = conn.getConnection().prepareStatement(sqlID);
    pstID.setString(1, usernameRegister);
    ResultSet rsID = pstID.executeQuery();

    if (rsID.next()) {
        String idRegister = rsID.getString("id");

        String jk = null;
        if (laki.isSelected()) {
            jk = "Pria";
        } else if (perem.isSelected()) {
            jk = "Wanita";
        }

        String tmpl = "yyyy-MM-dd";
        SimpleDateFormat fn = new SimpleDateFormat(tmpl);
        String tanggal = fn.format(Tanggal.getDate());

        // Melakukan update data ke tabel anggota dengan memasukkan id dari register
        String sqlUpdate = "UPDATE anggota SET id = ?, username_user = ?, nama = ?, telp = ?, jenis_kelamin = ?, tanggal = ?, alamat = ? WHERE nik = ?";
        PreparedStatement pstUpdate = conn.getConnection().prepareStatement(sqlUpdate);

        pstUpdate.setString(1, idRegister); // Menggunakan ID dari register
        pstUpdate.setString(2, username.getText());
        pstUpdate.setString(3, nama.getText());
        pstUpdate.setString(4, telp.getText());
        pstUpdate.setString(5, jk);
        pstUpdate.setString(6, tanggal);
        pstUpdate.setString(7, alamat.getText());
        pstUpdate.setString(8, nik.getText());

        int rowsAffected = pstUpdate.executeUpdate();
        pstUpdate.close();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
            table();
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Username tidak ditemukan, data tidak diupdate");
    }
} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
}
    }//GEN-LAST:event_EditActionPerformed

    private void TabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseClicked
       int baris = Tabel.rowAtPoint(evt.getPoint());
String ID = Tabel.getValueAt(baris, 0).toString(); // Mendapatkan ID dari baris yang diklik
username.setText(ID); // Set nilai ID ke dalam JTextField id

String NIK = Tabel.getValueAt(baris, 1).toString();
nik.setText(NIK);

String Username = Tabel.getValueAt(baris,2).toString();
username.setText(Username);

String NAMA = Tabel.getValueAt(baris, 3).toString();
nama.setText(NAMA);

String TELP = Tabel.getValueAt(baris, 4).toString();
telp.setText(TELP);

String Jenis_Kelamin = Tabel.getValueAt(baris, 5).toString();

if ("Pria".equals(Jenis_Kelamin)) {
    laki.setSelected(true);
} else if ("Wanita".equals(Jenis_Kelamin)) {
    perem.setSelected(true);
}

String TanggalString = Tabel.getValueAt(baris, 6).toString();
try {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date tanggalDate = dateFormat.parse(TanggalString);
    Tanggal.setDate(tanggalDate);
} catch (ParseException ex) {
    ex.printStackTrace();
}

String ALAMAT = Tabel.getValueAt(baris, 7).toString();
alamat.setText(ALAMAT);
    }//GEN-LAST:event_TabelMouseClicked

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
            java.util.logging.Logger.getLogger(Anggota_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anggota_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anggota_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anggota_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anggota_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Simpan;
    private javax.swing.JTable Tabel;
    private com.toedter.calendar.JDateChooser Tanggal;
    private javax.swing.JTextField alamat;
    private javax.swing.ButtonGroup grup;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton laki;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nik;
    private javax.swing.JTextField pencarian;
    private javax.swing.JRadioButton perem;
    private javax.swing.JTextField telp;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
