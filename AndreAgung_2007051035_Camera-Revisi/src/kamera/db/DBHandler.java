package kamera.db;


import java.sql.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kamera.model.Kamera;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDRE
 */
public class DBHandler {
    public final Connection conn;

    public DBHandler(String driver) {
        this.conn = DBHelper.getConnection(driver);
    }
    public void addKamera(Kamera kmr){
        String insertKmr = "INSERT INTO `kamera`(`id`,`nama`, `alamat`, `tgl_beli`,`warna`,`jenis_kamera`,`nohp`)"
                + "VALUES (NULL,?,?,?,?,?,?)";
        try {
            PreparedStatement stmtInsert = conn.prepareStatement(insertKmr);
            
            stmtInsert.setString(1, kmr.getNama());
            stmtInsert.setString(2, kmr.getAlamat());
            stmtInsert.setString(3, kmr.getTanggalBeli());
            stmtInsert.setString(4, kmr.getWarna());
            stmtInsert.setString(5, kmr.getJenis());
            stmtInsert.setLong(6, kmr.getNoHp());
            stmtInsert.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
