/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package database;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shafira SS
 */
public class modul5 extends javax.swing.JFrame {
    int kodeproduk, hargaproduk;
    /**
     * Creates new form modul5
     */
    public modul5() {
        conn = new koneksi();
        initComponents();
        tampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        frame = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bayar = new javax.swing.JButton();
        tbayar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        kembalian = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hitung = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        product = new javax.swing.JComboBox<>();
        simpan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        kode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        tharga = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kodepembeli = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpenjualan = new javax.swing.JTable();
        tampil = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THE ORIGINOTE PRODUCT");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1187, 27);

        jPanel4.setLayout(null);

        frame.setLayout(null);
        jPanel4.add(frame);
        frame.setBounds(20, 10, 1100, 360);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(11, 80, 1150, 370);

        jButton1.setText("1");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(464, 33, 35, 38);

        jButton2.setText("2");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(612, 33, 35, 38);

        jButton3.setText("3");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(735, 33, 35, 38);

        jTabbedPane1.addTab("Informasi Product", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(null);

        jLabel5.setText("Jumlah Product");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 230, 120, 16);

        bayar.setText("Bayar");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });
        jPanel2.add(bayar);
        bayar.setBounds(720, 290, 72, 23);
        jPanel2.add(tbayar);
        tbayar.setBounds(190, 290, 523, 22);

        jLabel6.setText("Kode Product");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 170, 110, 16);

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset);
        reset.setBounds(570, 360, 72, 23);
        jPanel2.add(kembalian);
        kembalian.setBounds(190, 320, 601, 22);

        jLabel7.setText("Total Harga");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 260, 100, 16);

        jLabel10.setText("Harga Barang");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(40, 200, 110, 16);

        jLabel3.setText("Product");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 140, 80, 16);

        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        jPanel2.add(hitung);
        hitung.setBounds(720, 230, 72, 23);

        jLabel8.setText("Total Bayar");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 290, 100, 16);
        jPanel2.add(nama);
        nama.setBounds(190, 100, 601, 30);

        product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH PRODUCT--", "Moisturizer Hyalucera", "Moisturizer Cica B5 Soothing", "Moisturizer Brightening", "Moisturizer Ceratinol", "Symwhite Jelly Booster", "Lip Treatment Serum", "Eyelash Serum", "Eye Serum Treatment", "Ceramelia SS SPF PA 50++", "Niaceramid SS SPF PA 50++" }));
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });
        jPanel2.add(product);
        product.setBounds(190, 140, 601, 22);

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel2.add(simpan);
        simpan.setBounds(690, 360, 72, 23);

        jLabel9.setText("Kembalian");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 320, 90, 16);
        jPanel2.add(kode);
        kode.setBounds(190, 170, 601, 22);

        jLabel4.setText("Atas Nama");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 110, 100, 16);
        jPanel2.add(harga);
        harga.setBounds(190, 200, 601, 22);
        jPanel2.add(tharga);
        tharga.setBounds(190, 260, 601, 22);
        jPanel2.add(jumlah);
        jumlah.setBounds(190, 230, 523, 22);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("FORM PEMBELIAN");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel11.setAutoscrolls(true);
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 0, 1230, 27);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/logo.jpg"))); // NOI18N
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel2.add(jLabel12);
        jLabel12.setBounds(810, 60, 320, 330);

        jLabel2.setText("Kode Pembeli");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 70, 90, 16);
        jPanel2.add(kodepembeli);
        kodepembeli.setBounds(190, 70, 600, 22);

        jTabbedPane1.addTab("Form Pembelian", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        tabelpenjualan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelpenjualan.setShowHorizontalLines(true);
        tabelpenjualan.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tabelpenjualan);

        tampil.setText("TAMPIL");
        tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilActionPerformed(evt);
            }
        });

        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(tampil)
                        .addGap(74, 74, 74)
                        .addComponent(edit)
                        .addGap(66, 66, 66)
                        .addComponent(hapus))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus)
                    .addComponent(edit)
                    .addComponent(tampil))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Penjualan", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1187, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void tampilData(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("KODE_PEMBELI");
        tbl.addColumn("PEMBELI");
        tbl.addColumn("PRODUK");
        tbl.addColumn("KODE");
        tbl.addColumn("HARGA");
        tbl.addColumn("JUMLAH");
        tbl.addColumn("TOTAL_HARGA");
        tbl.addColumn("TOTAL_BAYAR");
        tbl.addColumn("KEMBALIAN");       
        tabelpenjualan.setModel(tbl); 
        try {
            Statement st = conn.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM datajual");
            while (rs.next()) {
                tbl.addRow( new Object[] {
                    rs.getString("kode_pembeli"),
                    rs.getString("pembeli"),
                    rs.getString("produk"),
                    rs.getString("kode"),
                    rs.getString("harga"),
                    rs.getString("jumlah"),
                    rs.getString("total_harga"),
                    rs.getString("total_bayar"),    
                    rs.getString("kembalian")
                });
                tabelpenjualan.setModel(tbl);
            }
        } catch (Exception e) {
        }
    }
    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        int c = Integer.parseInt(tharga.getText());
        int d = Integer.parseInt (tbayar.getText());
        int Susok = d - c ;
        kembalian.setText(Integer.toString(Susok));
        // TODO add your handling code here:
    }//GEN-LAST:event_bayarActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
    kodepembeli.setText("");
    nama.setText("");
    product.setSelectedItem("--PILIH PRODUCT--");
    kode.setText("");
    harga.setText("");
    jumlah.setText("");
    tharga.setText("");
    tbayar.setText("");
    kembalian.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        int a = Integer.parseInt(harga.getText());
        int b = Integer.parseInt (jumlah.getText());
        int totalharga = a * b ;
        tharga.setText(Integer.toString(totalharga));
    }//GEN-LAST:event_hitungActionPerformed

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        if (product.getSelectedItem().equals("Moisturizer Hyalucera")) {
            kodeproduk = 101;
            hargaproduk = 42000;
            kode.setText(""+kodeproduk);
            harga.setText(""+hargaproduk);
        }else if (product.getSelectedItem().equals("Moisturizer Cica B5 Soothing")) {
            kodeproduk = 102;
            hargaproduk = 48000;
            kode.setText(""+kodeproduk);
            harga.setText(""+hargaproduk);
        }else if (product.getSelectedItem().equals("Moisturizer Brightening")) {
            kodeproduk = 103;
            hargaproduk = 48000;
            kode.setText(""+kodeproduk);
            harga.setText(""+hargaproduk);
        }else if (product.getSelectedItem().equals("Moisturizer Ceratinol")) {
            kodeproduk = 104;
            hargaproduk = 48000;
            kode.setText(""+kodeproduk);
            harga.setText(""+hargaproduk);
        }else if (product.getSelectedItem().equals("Symwhite Jelly Booster")) {
            kodeproduk = 105;
            hargaproduk = 48000;
            kode.setText(""+kodeproduk);
            harga.setText(""+hargaproduk);
        }else if (product.getSelectedItem().equals("Lip Treatment Serum")) {
            kodeproduk = 106;
            hargaproduk = 36000;
            kode.setText(""+kodeproduk);
            harga.setText(""+hargaproduk);
        }else if (product.getSelectedItem().equals("Eyelash Serum")) {
            kodeproduk = 107;
            hargaproduk = 36000;
            kode.setText(""+kodeproduk);
            harga.setText(""+hargaproduk);
        }else if (product.getSelectedItem().equals("Eye Serum Treatment")) {
            kodeproduk = 108;
            hargaproduk = 37000;
            kode.setText(""+kodeproduk);
            harga.setText(""+hargaproduk);
        }else if (product.getSelectedItem().equals("Ceramelia SS SPF PA 50++")) {
            kodeproduk = 109;
            hargaproduk = 42000;
            kode.setText(""+kodeproduk);
            harga.setText(""+hargaproduk);
        }else if (product.getSelectedItem().equals("Niaceramid SS SPF PA 50++")) {
            kodeproduk = 110;
            hargaproduk = 42000;
            kode.setText(""+kodeproduk);
            harga.setText(""+hargaproduk);
        }
    }//GEN-LAST:event_productActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        try {
            Statement st = conn.getConnection().createStatement();
            st.executeUpdate("INSERT INTO datajual VALUES('"+ kodepembeli.getText() + "',"+ " '"+ nama.getText()+ "',"+ " '"
                +product.getSelectedItem()+"',"+ " '"+ kode.getText()+"',"+ " '"+ harga.getText()
                +"',"+ " '"+ jumlah.getText()+"',"+ " '"+ tharga.getText()+"',"+ " '"+ tbayar.getText()+
                "',"+ " '"+ kembalian.getText() +"')");
            st.close();
            JOptionPane.showMessageDialog(this, "data berhasil disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "data gagal disimpan");
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        product1 frame1 = new product1();
        frame.removeAll();
        frame1.setVisible(true);
        frame.add(frame1);            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    product2 frame1 = new product2();
        frame.removeAll();
        frame1.setVisible(true);
        frame.add(frame1);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    product3 frame1 = new product3();
        frame.removeAll();
        frame1.setVisible(true);
        frame.add(frame1);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilActionPerformed
        tampilData();
    }//GEN-LAST:event_tampilActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
    DefaultTableModel model = (DefaultTableModel) tabelpenjualan.getModel();

    int barisTerpilih = tabelpenjualan.getSelectedRow();

    if (barisTerpilih == -1) {
        JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus!");
    } else {
        String kodePembeliToDelete = model.getValueAt(barisTerpilih, 0).toString();
        model.removeRow(barisTerpilih);
        try {
            Statement st = conn.getConnection().createStatement();
            st.executeUpdate("DELETE FROM datajual WHERE kode_pembeli = '" + kodePembeliToDelete + "'");
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_hapusActionPerformed
    private void hapusData(String kodePembeli) {
        try {
            Statement st = conn.getConnection().createStatement();
            st.executeUpdate("DELETE FROM datajual WHERE kode_pembeli = '" + kodePembeli + "'");
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
    int barisTerpilih = tabelpenjualan.getSelectedRow();
    if (barisTerpilih == -1) {
        JOptionPane.showMessageDialog(this, "Pilih baris data yang ingin diedit!");
    } else {
        String kodePembeli = tabelpenjualan.getValueAt(barisTerpilih, 0).toString();
        String namaPembeli = tabelpenjualan.getValueAt(barisTerpilih, 1).toString();
        String namaProduk = tabelpenjualan.getValueAt(barisTerpilih, 2).toString();
        String kodeProduk = tabelpenjualan.getValueAt(barisTerpilih, 3).toString();
        String hargaProduk = tabelpenjualan.getValueAt(barisTerpilih, 4).toString();
        String Jumlah = tabelpenjualan.getValueAt(barisTerpilih, 5).toString();
        String totalHarga = tabelpenjualan.getValueAt(barisTerpilih, 6).toString();
        String totalBayar = tabelpenjualan.getValueAt(barisTerpilih, 7).toString();
        String Kembalian = tabelpenjualan.getValueAt(barisTerpilih, 8).toString();
        kode.setText(kodeProduk);
        nama.setText(namaPembeli);
        product.setSelectedItem(namaProduk);
        harga.setText(hargaProduk);
        jumlah.setText(Jumlah);
        tharga.setText(totalHarga);
        tbayar.setText(totalBayar);
        kembalian.setText(Kembalian);
        hapusData(kodePembeli);
        tampilData();
    }       // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed
    
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
            java.util.logging.Logger.getLogger(modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new modul5().setVisible(true);
            }
        });
    }
    koneksi conn;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bayar;
    private javax.swing.JButton edit;
    private javax.swing.JPanel frame;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JButton hitung;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField kembalian;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField kodepembeli;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> product;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabelpenjualan;
    private javax.swing.JButton tampil;
    private javax.swing.JTextField tbayar;
    private javax.swing.JTextField tharga;
    // End of variables declaration//GEN-END:variables
}
