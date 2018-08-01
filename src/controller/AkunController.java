/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.AkunDAO;
import daos.RoleDAO;
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
        private final RoleDAO roleDAO;

    public AkunController(Connection connection) {
        this.adao = new AkunDAO(connection);
                this.roleDAO = new RoleDAO(connection);
    }

    public boolean save(String id, String nama, String alamat, String roleId, String password) {
        return this.adao.insert(new Akun(id, nama, alamat, new Role(roleId, ""), password));
    }

    public boolean edit(String id, String nama, String alamat, String roleId, String password) {
        return this.adao.update(new Akun(id, nama, alamat, new Role(roleId, ""), password));
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

}
