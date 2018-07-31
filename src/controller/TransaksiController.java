/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import daos.TransaksiDAO;
import entities.Transaksi;
import entities.Akun;
import java.sql.Connection;
import java.util.List;
import java.text.SimpleDateFormat;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class TransaksiController {

    private final TransaksiDAO tdao;
    
    SimpleDateFormat sdf = new SimpleDateFormat("\"dd/MM/yyyy\"");
    
    public TransaksiController(Connection connection) {
        this.tdao = new TransaksiDAO(connection);
    }
            
    public boolean save(String id, String tglPinjam, String tglKembali, Akun akunId, String stat, String terlambat, String denda){
        java.sql.Date date1 = java.sql.Date.valueOf(tglPinjam);
        java.sql.Date date2 = java.sql.Date.valueOf(tglKembali);
        return this.tdao.insert(new Transaksi(id, date1,
                date2, Integer.parseInt(stat), Integer.parseInt(terlambat), Integer.parseInt(denda), akunId));
    }
    
    public boolean edit(String id, String tglPinjam, String tglKembali, Akun akunId, String stat, String terlambat, String denda){
                java.sql.Date date1 = java.sql.Date.valueOf(tglPinjam);
        java.sql.Date date2 = java.sql.Date.valueOf(tglKembali);
        return this.tdao.update(new Transaksi(id, date1,
                date2, Integer.parseInt(stat), Integer.parseInt(terlambat), Integer.parseInt(denda), akunId));
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
