/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import daos.BukuDAO;
import entities.Buku;
import java.sql.Connection;
import java.util.List;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class BukuController {

    private final BukuDAO bdao;
    
    public BukuController(Connection connection) {
        this.bdao = new BukuDAO(connection);
    }
        
    public boolean save(String id, String jdl, String thn, String stat){
        return this.bdao.insert(new Buku(id, jdl, thn, Integer.parseInt(stat)));
    }
    
    public boolean edit(String id, String jdl, String thn, String stat){
        return this.bdao.update(new Buku(id, jdl, thn, Integer.parseInt(stat)));
    }
    
    public boolean drop(String bukuId){
        return this.bdao.delete(bukuId);
    }
    
    public List<Object[]> binding(){
        return this.bdao.getAll();
    }
    
    public List<Object[]> bindingSort(String category, String sort){
        return this.bdao.getAllSort(category, sort);
    }
    
    public List<Object[]> find(String category, String data){
        return this.bdao.search(category, data);
    }
    
    public Object findById(String bukuId){
        return this.bdao.getById(bukuId);
    }
    
    public String getAutoId(){
        return this.bdao.getAutoId();
    }
}
