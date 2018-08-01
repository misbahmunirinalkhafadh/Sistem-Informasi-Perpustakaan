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
    private Buku bukuID;
    private Penulis penulisId;

    public PenulisBuku(Buku bukuID, Penulis penulisId) {
        this.bukuID = bukuID;
        this.penulisId = penulisId;
    }

    
    
    /**
     * @return the bukuID
     */
    public Buku getBukuID() {
        return bukuID;
    }

    /**
     * @param bukuID the bukuID to set
     */
    public void setBukuID(Buku bukuID) {
        this.bukuID = bukuID;
    }

    /**
     * @return the penulisId
     */
    public Penulis getPenulisId() {
        return penulisId;
    }

    /**
     * @param penulisId the penulisId to set
     */
    public void setPenulisId(Penulis penulisId) {
        this.penulisId = penulisId;
    }
    
}
