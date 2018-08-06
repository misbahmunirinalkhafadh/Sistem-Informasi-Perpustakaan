/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

/**
 * 
 * @author Day5nta War5h Wulandari
 */
public class Buku {
    private String id;
    private String judul;
    private String tahun;
    private int status;

    public Buku(String id, String judul, String tahun, int status) {
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.status = status;
    }

    public Buku(String judul, String tahun) {
        this.judul = judul;
        this.tahun = tahun;
    }
    
    public Buku(String judul, String tahun, int status) {
        this.judul = judul;
        this.tahun = tahun;
        this.status = status;
    }

    public Buku() {
        
    }

    public Buku(String id) {
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
     * @return the judul
     */
    public String getJudul() {
        return judul;
    }

    /**
     * @param judul the judul to set
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * @return the tahun
     */
    public String getTahun() {
        return tahun;
    }

    /**
     * @param tahun the tahun to set
     */
    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }
    
}
