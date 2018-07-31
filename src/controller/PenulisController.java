/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import daos.PenulisDAO;
import entities.Penulis;
import java.sql.Connection;
import java.util.List;
/**
 * 
 * @author  Dayinta Warih Wulandari
 */
public class PenulisController {

    private final PenulisDAO penulisDAO;

    public PenulisController(Connection connection) {
        this.penulisDAO = new PenulisDAO(connection);
    }

    public boolean save(String id, String penulis) {
        return this.penulisDAO.insert(new Penulis(id, penulis));
    }

    public boolean edit(String id, String penulis) {
        return this.penulisDAO.update(new Penulis(id, penulis));
    }

    public boolean drop(String penulsId) {
        return this.penulisDAO.delete(penulsId);
    }

    public List<Object[]> binding() {
        return this.penulisDAO.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.penulisDAO.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.penulisDAO.search(category, data);
    }

    public Object findById(String penulisId) {
        return this.penulisDAO.getById(penulisId);
    }

    public String getAutoId() {
        return this.penulisDAO.getAutoId();
    }
}
