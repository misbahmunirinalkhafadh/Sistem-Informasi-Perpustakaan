/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.sql.Date;
import entities.Akun;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class Transaksi {
    private String id;
    private Date tanggalPinjam;
    private Date tanggalKembali;
    private int status_pinjam;
    private int terlambat;
    private int denda;
    private Akun akunId;

    public Transaksi(String id, Date tanggalPinjam, Date tanggalKembali, int status_pinjam, int terlambat, int denda, Akun akunId) {
        this.id = id;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.status_pinjam = status_pinjam;
        this.terlambat = terlambat;
        this.denda = denda;
        this.akunId = akunId;
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the tanggalPinjam
     */
    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    /**
     * @param tanggalPinjam the tanggalPinjam to set
     */
    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    /**
     * @return the tanggalKembali
     */
    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    /**
     * @param tanggalKembali the tanggalKembali to set
     */
    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    /**
     * @return the status_pinjam
     */
    public int getStatus_pinjam() {
        return status_pinjam;
    }

    /**
     * @param status_pinjam the status_pinjam to set
     */
    public void setStatus_pinjam(int status_pinjam) {
        this.status_pinjam = status_pinjam;
    }

    /**
     * @return the terlambat
     */
    public int getTerlambat() {
        return terlambat;
    }

    /**
     * @param terlambat the terlambat to set
     */
    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    /**
     * @return the denda
     */
    public int getDenda() {
        return denda;
    }

    /**
     * @param denda the denda to set
     */
    public void setDenda(int denda) {
        this.denda = denda;
    }

    /**
     * @return the akunId
     */
    public Akun getAkunId() {
        return akunId;
    }

    /**
     * @param akunId the akunId to set
     */
    public void setAkunId(Akun akunId) {
        this.akunId = akunId;
    }
    
    
}
