/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import daos.PenulisBukuDAO;
import entities.Penulis;
import entities.Buku;
import entities.PenulisBuku;
import java.sql.Connection;
import java.util.List;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class PenulisBukuController {

    private final PenulisBukuDAO pbdao;

    public PenulisBukuController(Connection connection) {
        this.pbdao = new PenulisBukuDAO(connection);
    }
    
    public boolean save(Buku bukuId, Penulis penulisId) {
        return this.pbdao.insert(new PenulisBuku(bukuId, penulisId));
    }

    public boolean drop(String bukuId) {
        return this.pbdao.delete(bukuId);
    }

    public List<Object[]> binding() {
        return this.pbdao.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.pbdao.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.pbdao.search(category, data);
    }
}
