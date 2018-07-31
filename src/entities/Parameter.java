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
public class Parameter {
    private int waktu;
    private int denda;

    public Parameter(int waktu, int denda) {
        this.waktu = waktu;
        this.denda = denda;
    }


    /**
     * @return the waktu
     */
    public int getWaktu() {
        return waktu;
    }

    /**
     * @param waktu the waktu to set
     */
    public void setWaktu(int waktu) {
        this.waktu = waktu;
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
    
}
