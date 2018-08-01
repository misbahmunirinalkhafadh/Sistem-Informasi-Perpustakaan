/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Akun;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dayinta Warih Wulandari
 */
public class AkunDAO {

    private final FunctionDAO fdao;

    public AkunDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Akun akun) {
        return this.fdao.executeDML(
                "");
                
//                "INSERT INTO Akun VALUES("
//                + akun.getId() + ",'" + akun.getNama() + ",'" + akun.getAlamat()
//                + ",'" + akun.getPassword()
//                + ",'" + akun.getRoleId()
//                + "')");
    }

    public boolean update(Akun akun) {
        return this.fdao.executeDML("UPDATE Akun SET nama='"
                + akun.getNama() + "', alamat'" + akun.getAlamat()
                + "', role_id'" + akun.getRoleId()
                + "', password'" + akun.getPassword()
                + " WHERE id=" + akun.getId());
    }

    public boolean delete(String akunId) {
        return this.fdao.executeDML("DELETE FROM Akun WHERE id=" + akunId);
    }

    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT * FROM Akun");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT * FROM Akun ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM Akun WHERE " + category + " LIKE '%" + data + "%'");
    }

    public Object getById(String akunId) {
        return this.fdao.getDataByID("SELECT * FROM Akun WHERE id=" + akunId);
    }

    public String getAutoId() {
        return this.fdao.getAutoID("SELECT MAX(id)+1 AS MAXID FROM Akun");
    }
}
