/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daos;
import entities.Role;
import java.sql.Connection;
import java.util.List;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class RoleDAO {
    private final FunctionDAO fdao;

    public RoleDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Role role) {
        return this.fdao.executeDML("INSERT INTO Role VALUES("
                + role.getId() + ",'" + role.getRole() + "')");
    }

    public boolean update(Role role) {
        return this.fdao.executeDML("UPDATE Role SET role='"
                + role.getRole()+ "' WHERE id=" + role.getId());
    }

    public boolean delete(String roleId) {
        return this.fdao.executeDML("DELETE FROM Role WHERE id=" + roleId);
    }

    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT * FROM Role");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT * FROM Role ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM Role WHERE " + category + " LIKE '%" + data + "%'");
    }
    
    public Object getById(String roleId){
        return this.fdao.getDataByID("SELECT * FROM Role WHERE region_id="+roleId);
    }
    
    public String getAutoId(){
        return this.fdao.getAutoID("SELECT MAX(id)+1 AS MAXID FROM Role");
    }
}
