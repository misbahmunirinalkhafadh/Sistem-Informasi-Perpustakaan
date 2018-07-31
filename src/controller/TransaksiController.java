/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import daos.AkunDAO;
import daos.RoleDAO;
import daos.TransaksiDAO;
import entities.Transaksi;
import entities.Akun;
import entities.Role;
import java.sql.Connection;
import java.util.List;
import java.text.SimpleDateFormat;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class TransaksiController {

    private final TransaksiDAO tdao;
    private final AkunDAO akunDAO;
    private Role role;
    private final RoleDAO roleDAO;
    
    
//    SimpleDateFormat sdf = new SimpleDateFormat("\"dd/MM/yyyy\"");
    
    public TransaksiController(Connection connection) {
        this.tdao = new TransaksiDAO(connection);
        this.akunDAO = new AkunDAO(connection);
        this.roleDAO = new RoleDAO(connection);
    }
            
    public boolean save(String id, String tglPinjam, String tglKembali, String status, String terlambat, String denda, String akunId) {
        java.sql.Date date1 = java.sql.Date.valueOf(tglPinjam);
        java.sql.Date date2 = java.sql.Date.valueOf(tglKembali);

        return this.tdao.insert(new Transaksi(id, date1, date2,
                Integer.parseInt(status), Integer.parseInt(terlambat), Integer.parseInt(denda),
                new Akun(id, "", "", role, "")));

    }

    public boolean edit(String id, String tglPinjam, String tglKembali, String status, String terlambat, String denda, String akunId) {
        java.sql.Date date1 = java.sql.Date.valueOf(tglPinjam);
        java.sql.Date date2 = java.sql.Date.valueOf(tglKembali);

        return this.tdao.update(new Transaksi(id, date1, date2,
                Integer.parseInt(status), Integer.parseInt(terlambat), Integer.parseInt(denda),
                new Akun(id, "", "", role, "")));
    }
    
    
    public boolean drop(String transId){
        return this.tdao.delete(transId);
    }
    
    public List<Object[]> binding(){
        return this.tdao.getAll();
    }
    
    public List<Object[]> bindingSort(String category, String sort){
        return this.tdao.getAllSort(category, sort);
    }
    
    public List<Object[]> find(String category, String data){
        return this.tdao.search(category, data);
    }
    
    public Object findById(String transId){
        return this.tdao.getById(transId);
    }
    
    public String getAutoId(){
        return this.tdao.getAutoId();
    }
}
