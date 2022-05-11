/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kamera.model;

/**
 *
 * @author ANDRE
 */
public class Kamera {

    private String nama;
    private String alamat;
    private String tanggalBeli;
    private String warna;
    private String Jenis;
    private Long noHp;

    public Kamera( String nama, String alamat, String tanggalBeli, String warna, String Jenis, Long noHp) {
       
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalBeli = tanggalBeli;
        this.warna = warna;
        this.Jenis = Jenis;
        this.noHp = noHp;
    }

   
   

    
   public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTanggalBeli() {
        return tanggalBeli;
    }

    public void setTanggalBeli(String tanggalBeli) {
        this.tanggalBeli = tanggalBeli;
    }

    public String getWarna() {
        return warna;
    }


    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

   

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Long getNoHp() {
        return noHp;
    }

    public void setNoHp(Long noHp) {
        this.noHp = noHp;
    }

    

    
   
  
    
    
}

