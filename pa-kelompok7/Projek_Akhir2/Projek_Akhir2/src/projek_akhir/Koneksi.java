/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek_akhir;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sigma
 */
public class Koneksi {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL      = "jdbc:mysql://localhost/halo";
    private static final String USER        = "root";
    private static final String PASS        = "";
    
    private Connection conn                 = null;
    
    public Koneksi(){
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Succes");
        } catch (Exception e) {
            System.out.println("Koneksi GAGAL");
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
}
