/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;
import entities.Role;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class Akun {
    private String id;
    private String nama;
    private String alamat;
    private int roleId;
    private String password;

    public Akun(String id, String nama, String alamat, String password, int roleId) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.roleId = roleId;
        this.password = password;
    }

    public Akun(String id, String nama, String alamat, String password, Role roleId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
