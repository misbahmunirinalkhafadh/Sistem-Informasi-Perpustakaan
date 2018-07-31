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
    private Role roleId;
    private String password;

    public Akun() {
    }

    public Akun(String id, String nama, String alamat, Role roleId, String password) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.roleId = roleId;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
