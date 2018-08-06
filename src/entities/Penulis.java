/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class Penulis {
    private String id;
    private String penulis;

    public Penulis(String id, String penulis) {
        this.id = id;
        this.penulis = penulis;
    }

    public Penulis(String penulis) {
        this.penulis = penulis;
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
     * @return the penulis
     */
    public String getPenulis() {
        return penulis;
    }

    /**
     * @param penulis the penulis to set
     */
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
}
