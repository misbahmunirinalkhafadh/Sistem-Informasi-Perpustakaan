/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.AkunDAO;
import entities.Akun;
import entities.Role;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dayinta Warih Wulandari
 */
public class AkunController {

    private final AkunDAO adao;

    public AkunController(Connection connection) {
        this.adao = new AkunDAO(connection);
    }

    public boolean save(String id, String nama, String alamat, String password, int roleId) {
        return this.adao.insert(new Akun(id, nama, alamat, password, roleId));
    }

    public boolean edit(String id, String nama, String alamat, String password, Role roleId) {
        return this.adao.update(new Akun(id, nama, alamat, password, roleId));
    }

    public boolean drop(String akunId) {
        return this.adao.delete(akunId);
    }

    public List<Object[]> binding() {
        return this.adao.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.adao.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.adao.search(category, data);
    }

    public Object findById(String akunId) {
        return this.adao.getById(akunId);
    }

    public String getAutoId() {
        return this.adao.getAutoId();
    }
}
