/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;
import entities.Transaksi;
import entities.Buku;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class TransaksiBuku {
    private Transaksi transaksiId;
    private Buku bukuId;

    public TransaksiBuku(Transaksi transaksiId, Buku bukuId) {
        this.transaksiId = transaksiId;
        this.bukuId = bukuId;
    }
    
    /**
     * @return the transaksiId
     */
    public Transaksi getTransaksiId() {
        return transaksiId;
    }

    /**
     * @param transaksiId the transaksiId to set
     */
    public void setTransaksiId(Transaksi transaksiId) {
        this.transaksiId = transaksiId;
    }

    /**
     * @return the bukuId
     */
    public Buku getBukuId() {
        return bukuId;
    }

    /**
     * @param bukuId the bukuId to set
     */
    public void setBukuId(Buku bukuId) {
        this.bukuId = bukuId;
    }
    
}
