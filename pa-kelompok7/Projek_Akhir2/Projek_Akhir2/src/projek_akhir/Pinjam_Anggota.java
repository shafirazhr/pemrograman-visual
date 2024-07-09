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
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sigma
 */
public class Pinjam_Anggota extends javax.swing.JFrame {

    /**
     * Creates new form Pinjam_Anggota
     */
  
      public Pinjam_Anggota() {
          initComponents();
        table();
        cari();
        table2();
//        isiNikDariDatabase();
        Persetujuan(false);

    }
    
//      private void isiNikDariDatabase() {
//    try {
//        // Mendapatkan koneksi ke database
//        Koneksi conn = new Koneksi();
//
//        // Mengambil data dari database
//        String query = "SELECT MAX(nik) FROM anggota";
//        Statement statement = conn.getConnection().createStatement();
//        ResultSet resultSet = statement.executeQuery(query);
//
//        // Jika ada data yang ditemukan, isi teks field 'nik' dengan data dari database
//        if (resultSet.next()) {
//            // Mengambil data nik dari database
//            String nikFromDB = resultSet.getString(1);
//
//            // Mengatur nilai teks field 'nik' dengan nilai dari database
//            nik.setText(nikFromDB);
//        }

//        // Tutup statement dan koneksi
//        statement.close();
//        conn.getConnection().close();
//    } catch (Exception e) {
//        e.printStackTrace();
//        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
//    }
//}
     private void table2() {
    Koneksi conn = new Koneksi();
    DefaultTableModel tableModel = new DefaultTableModel();
//    tableModel.addColumn("NIK");
    tableModel.addColumn("Nama");
    tableModel.addColumn("Tanggal");
    tableModel.addColumn("Barang");
    tableModel.addColumn("Pinjaman");
    tableModel.addColumn("Persetujuan");
    tableModel.addColumn("Waktu");

 

    try {
        Statement st = conn.getConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM pinjam");

        while (rs.next()) {
            java.util.Date tanggalDate = rs.getDate("tanggal");
            String Kelas = "barang";
            String SPP = "pinjaman";
            Object[] rowData = new Object[] {
//                rs.getString("nik"),
                rs.getString("nama"),
                rs.getString("tanggal"),
                rs.getString("barang"),
                rs.getString("pinjaman"),
                rs.getString("persetujuan"),
                rs.getString("waktu"),
                
            };

            tableModel.addRow(rowData);
        }

        Tabel2.setModel(tableModel);
        st.close(); // Menutup statement, bukan pst.close()
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
    }
}
    void cari() {
    Koneksi conn = new Koneksi();
    DefaultTableModel tableModel = new DefaultTableModel();
//    tableModel.addColumn("NIK");
    tableModel.addColumn("Nama");
    tableModel.addColumn("Tanggal");
    tableModel.addColumn("Barang");
    tableModel.addColumn("Pinjaman");
//    tableModel.addColumn("Persetujuan");
    tableModel.addColumn("Waktu");
    try {
        String nimToSearch = "%" + pencarian.getText() + "%"; 

        String sql = "SELECT * FROM pinjam WHERE nik LIKE ?";
        PreparedStatement pst = conn.getConnection().prepareStatement(sql);
        pst.setString(1, nimToSearch);

        ResultSet rs = pst.executeQuery();
        while (rs.next()) {

            Object[] rowData = new Object[] {
//                rs.getString("nik"),
                rs.getString("nama"),
                rs.getString("tanggal"),
                rs.getString("barang"),
                rs.getString("pinjaman"),
//                rs.getString("persetujuan"),
                rs.getString("waktu"),
                

            };

            tableModel.addRow(rowData);
        }

        Tabel1.setModel(tableModel);
        pst.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
    }
}
    private void hapus(){
        nik.setText("");
        nama.setText("");
        grup.clearSelection();
        Tanggal.setDate(null);
        Menu.setSelectedIndex(0);
        Menu1.setSelectedIndex(0);
        persetujuan.setSelectedIndex(0);
    }
    
      void Persetujuan(boolean atur) {
    persetujuan.setEnabled(atur);
}
    
   private void table() {
    Koneksi conn = new Koneksi();
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.addColumn("NIK");
    tableModel.addColumn("Nama");
    tableModel.addColumn("Tanggal");
    tableModel.addColumn("Barang");
    tableModel.addColumn("Pinjaman");
//    tableModel.addColumn("Persetujuan");
    tableModel.addColumn("Waktu");

 

    try {
        Statement st = conn.getConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM pinjam");

        while (rs.next()) {
            java.util.Date tanggalDate = rs.getDate("tanggal");
            String Kelas = "barang";
            String SPP = "pinjaman";
            Object[] rowData = new Object[] {
                rs.getString("nik"),
                rs.getString("nama"),
                rs.getString("tanggal"),
                rs.getString("barang"),
                rs.getString("pinjaman"),
//                rs.getString("persetujuan"),
                rs.getString("waktu"),
                
            };

            tableModel.addRow(rowData);
        }

        Tabel1.setModel(tableModel);
        st.close(); // Menutup statement, bukan pst.close()
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
    }
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        pencarian = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nik = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        Simpan2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Menu = new javax.swing.JComboBox<>();
        Menu1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        persetujuan = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Tanggal = new com.toedter.calendar.JDateChooser();
        waktu = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabel2 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(pencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 280, -1));

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabel1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 371, 250));

        jButton5.setText("Cari");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("NIK");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel14.setText("NAMA");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 37, -1));

        jLabel17.setText("Tgl Gabung");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 70, 24));

        nik.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 0, 153)));
        nik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nikActionPerformed(evt);
            }
        });
        jPanel3.add(nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 180, -1));

        nama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 0, 153)));
        jPanel3.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 180, -1));

        Simpan2.setBackground(new java.awt.Color(153, 0, 153));
        Simpan2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Simpan2.setForeground(new java.awt.Color(255, 255, 255));
        Simpan2.setText("Daftar");
        Simpan2.setBorder(null);
        Simpan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Simpan2ActionPerformed(evt);
            }
        });
        jPanel3.add(Simpan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 70, 40));

        jLabel19.setText("Barang");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 62, 20));

        jLabel20.setText("Waktu");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 62, -1));

        Menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- PILIH BARANG --", "BPKB ", "EMAS", "AKTA TANAH", "HANDPHONE", "LAPTOP", "LAPTOP" }));
        jPanel3.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 180, -1));

        Menu1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH PINJAMAN--", "1.000.000", "2.000.000", "3.000.000", "4.000.000", "5.000.000", "6.000.000", "7.000.000", "8.000.000", "9.000.000", "10.000.000" }));
        jPanel3.add(Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 180, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 204));
        jButton1.setText("Hapus");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 70, 40));

        persetujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Persetujuan--", "Terima", "Tolak" }));
        persetujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persetujuanActionPerformed(evt);
            }
        });
        jPanel3.add(persetujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 180, -1));

        jLabel21.setText("Pinjaman");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 62, 20));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon("D:\\Java\\Projek_Akhir2\\src\\Gambar\\LOGO.png")); // NOI18N
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 160));
        jPanel3.add(Tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 180, 30));

        waktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Cicilan--", "3 Bulan", "6 Bulan", "12 Bulan" }));
        waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waktuActionPerformed(evt);
            }
        });
        jPanel3.add(waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 180, -1));

        jLabel24.setText("Persetujuan");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 62, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 450, 500));

        jButton6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 0, 153));
        jButton6.setText("EXIT");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 3));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 120, 60));

        Tabel2.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tabel2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 370, 280));

        jLabel22.setIcon(new javax.swing.ImageIcon("D:\\Java\\Projek_Akhir2\\src\\Gambar\\—Pngtree—blue purple gradient circle_5487754 (1).png")); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 280, 700, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseClicked
       
    }//GEN-LAST:event_TabelMouseClicked

    private void Tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel1MouseClicked
      
    }//GEN-LAST:event_Tabel1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cari();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(null, "Apakah Yakin Untuk Keluar");
        this.setVisible(false);
        User New = new User();
        New.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void nikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nikActionPerformed

    private void Simpan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Simpan2ActionPerformed
        String tmpl = "yyyy-MM-dd";
        SimpleDateFormat fn = new SimpleDateFormat(tmpl);
        String tanggal = fn.format(Tanggal.getDate());

        try {
            Koneksi conn = new Koneksi();

            String sqlPinjam = "INSERT INTO pinjam (nik, nama, tanggal, barang, pinjaman, persetujuan, waktu) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstPinjam = conn.getConnection().prepareStatement(sqlPinjam);

            pstPinjam.setString(1, nik.getText());
            pstPinjam.setString(2, nama.getText());
            pstPinjam.setString(3, tanggal);
            pstPinjam.setString(4, Menu.getSelectedItem().toString());
            pstPinjam.setString(5, Menu1.getSelectedItem().toString());
            pstPinjam.setString(6, persetujuan.getSelectedItem().toString());
            pstPinjam.setString(7, waktu.getSelectedItem().toString());

            pstPinjam.executeUpdate();
            
          String sqlAngsuran = "INSERT INTO angsuran (nik, nama, pinjaman) VALUES (?, ?, ?)";
        PreparedStatement pstAngsuran = conn.getConnection().prepareStatement(sqlAngsuran);

        pstAngsuran.setString(1, nik.getText());
        pstAngsuran.setString(2, nama.getText());
        pstAngsuran.setString(3, Menu1.getSelectedItem().toString());



            pstAngsuran.executeUpdate();
            pstAngsuran.close();

            table();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
        }
    }//GEN-LAST:event_Simpan2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hapus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Tabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabel2MouseClicked

    private void persetujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persetujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_persetujuanActionPerformed

    private void waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waktuActionPerformed

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
            java.util.logging.Logger.getLogger(Pinjam_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pinjam_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pinjam_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pinjam_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pinjam_Anggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Menu;
    private javax.swing.JComboBox<String> Menu1;
    private javax.swing.JButton Simpan2;
    private javax.swing.JTable Tabel;
    private javax.swing.JTable Tabel1;
    private javax.swing.JTable Tabel2;
    private com.toedter.calendar.JDateChooser Tanggal;
    private javax.swing.ButtonGroup grup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nik;
    private javax.swing.JTextField pencarian;
    private javax.swing.JComboBox<String> persetujuan;
    private javax.swing.JComboBox<String> waktu;
    // End of variables declaration//GEN-END:variables
}
