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
    private String tanggalPinjam;
    private String tanggalKembali;
    private int status_pinjam;
    private int terlambat;
    private int denda;
    private String akunId;

    public Transaksi(String id, String tanggalPinjam, String tanggalKembali, int status_pinjam, int terlambat, int denda, String akunId) {
        this.id = id;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.status_pinjam = status_pinjam;
        this.terlambat = terlambat;
        this.denda = denda;
        this.akunId = akunId;
    }

    public Transaksi(String akunId, String tanggalPinjam, String tanggalKembali) {
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.akunId = akunId;
    }

    public Transaksi(String id) {
        this.id = id;
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
    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    /**
     * @param tanggalPinjam the tanggalPinjam to set
     */
    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    /**
     * @return the tanggalKembali
     */
    public String getTanggalKembali() {
        return tanggalKembali;
    }

    /**
     * @param tanggalKembali the tanggalKembali to set
     */
    public void setTanggalKembali(String tanggalKembali) {
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
    public String getAkunId() {
        return akunId;
    }

    /**
     * @param akunId the akunId to set
     */
    public void setAkunId(String akunId) {
        this.akunId = akunId;
    }
    
    
}
