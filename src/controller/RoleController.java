/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import daos.RoleDAO;
import entities.Role;
import java.sql.Connection;
import java.util.List;
/**
 * 
 * @author  Dayinta Warih Wulandari
 */
public class RoleController {

    private final RoleDAO rdao;
    
    public RoleController(Connection connection) {
        this.rdao = new RoleDAO(connection);
    }
    
    public boolean save(String roleId, String role){
        return this.rdao.insert(new Role(roleId, role));
    }
    
    public boolean edit(String roleId, String role){
        return this.rdao.update(new Role(roleId, role));
    }
    
    public boolean drop(String roleId){
        return this.rdao.delete(roleId);
    }
    
    public List<Object[]> binding(){
        return this.rdao.getAll();
    }
    
    public List<Object[]> bindingSort(String category, String sort){
        return this.rdao.getAllSort(category, sort);
    }
    
    public List<Object[]> find(String category, String data){
        return this.rdao.search(category, data);
    }
    
    public Object findById(String roleId){
        return this.rdao.getById(roleId);
    }
    
    public String getAutoId(){
        return this.rdao.getAutoId();
    }
}
