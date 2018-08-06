/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;
import entities.Buku;
import entities.Penulis;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class PenulisBuku {
    private String bukuID;
    private String penulisId;

    public PenulisBuku() {
    }

    public PenulisBuku(String bukuID, String penulisId) {
        this.bukuID = bukuID;
        this.penulisId = penulisId;
    }

    public PenulisBuku(Penulis penulis) {
        this.penulisId = penulisId;
    }
    
    /**
     * @return the bukuID
     */
    public String getBukuID() {
        return bukuID;
    }

    /**
     * @param bukuID the bukuID to set
     */
    public void setBukuID(String bukuID) {
        this.bukuID = bukuID;
    }

    /**
     * @return the penulisId
     */
    public String getPenulisId() {
        return penulisId;
    }

    /**
     * @param penulisId the penulisId to set
     */
    public void setPenulisId(String penulisId) {
        this.penulisId = penulisId;
    }
    
}
