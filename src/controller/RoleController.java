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
    
    /**
     * funsi untuk menyimpan data dengan parameter dibawah 
     * @param roleId id role data yang akan ditambahkan 
     * @param role role data yang akan ditambahkan 
     * @return memanggil method insert dari class RoleDAO dengan parameter membuat instance dari kelas Role
     * dimana instance tersebut berisi roleId, role
     */
    public boolean save(String roleId, String role){
        return this.rdao.insert(new Role(roleId, role));
    }
    
    /**
     * fungsi untuk mengubah data 
     * @param roleId id role variable data yang akan dirubah 
     * @param role role data yang akan dirubah 
     * @return memanggil method update dari class RoleDAO dengan parameter membuat instance dari kelas Role
     * dimana instance tersebut berisi roleId, role
     */
    public boolean edit(String roleId, String role){
        return this.rdao.update(new Role(roleId, role));
    }
    
    /**
     * fungsi untuk menghapus data 
     * @param roleId  id role variable untuk menghapus data 
     * @return memanggil fungsi delete
     */
    public boolean drop(String roleId){
        return this.rdao.delete(roleId);
    }
    
    /**
     * fungsi untuk menampilkan semuadata 
     * @return memanggil fungsi getAll
     */
    public List<Object[]> binding(){
        return this.rdao.getAll();
    }
    
    /**
     * fungsi menampilkan data dengan berurutan
     * @param category golongan data 
     * @param sort variable untuk mengurutkan data 
     * @return memanggil fungsi getAllSort
     */
    public List<Object[]> bindingSort(String category, String sort){
        return this.rdao.getAllSort(category, sort);
    }
    
    /**
     * fungsi untuk mencari data
     * @param category golongan data 
     * @param data variable untuk mencari data
     * @return memanggil fungsi search
     */
    public List<Object[]> find(String category, String data){
        return this.rdao.search(category, data);
    }
    
    /**
     * fungsi untuk mencari data berdasarkan variable tertentu
     * @param roleId variable untuk mencari data 
     * @return memanggil fungsi getById
     */
    public Object findById(String roleId){
        return this.rdao.getById(roleId);
    }
    
    /**
     * Mendapatkan id secara otomatis
     * @return 
     */
    public String getAutoId(){
        return this.rdao.getAutoId();
    }
}
