/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Penulis;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dayinta Warih Wulandari
 */
public class PenulisDAO {

    private final FunctionDAO fdao;
    private Connection connection;

    public PenulisDAO(Connection connection) {
        this.connection = connection;
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Penulis penulis) {
        try {
            CallableStatement cs = connection.prepareCall("{CALL tambahPenulis(?)}");
            cs.setString(1, penulis.getPenulis());
            cs.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PenulisDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean update(Penulis penulis) {
        return this.fdao.executeDML("UPDATE Penulis SET penulis='"
                + penulis.getPenulis() + "' WHERE id='" + penulis.getId()+"'");
    }

    public boolean delete(String penulisId) {
        return this.fdao.executeDML("DELETE FROM Penulis WHERE id='" + penulisId+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT * FROM Penulis");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT * FROM Penulis ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM Penulis WHERE REGEXP_LIKE(" + category + ",'" + data + "', 'i')");
    }

    public Object getById(String penulisId) {
        return this.fdao.getDataByID("SELECT * FROM Penulis WHERE id=" + penulisId);
    }

    public String getAutoId() {
        return this.fdao.getAutoID("SELECT MAX(id)+1 AS MAXID FROM Penulis");
    }
}
