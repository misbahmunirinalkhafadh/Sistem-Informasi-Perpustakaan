/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Akun;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dayinta Warih Wulandari
 */
public class AkunDAO {

    private final FunctionDAO fdao;
    private final Connection connection;

    public AkunDAO(Connection connection) {
        this.connection = connection;
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Akun akun) {
        try {
            CallableStatement cs = connection.prepareCall("{CALL tambahAkun(?,?,?)}");
            cs.setString(1, akun.getNama());
            cs.setString(2, akun.getAlamat());
            cs.setString(3, akun.getPassword());
            cs.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AkunDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean update(Akun akun) {
        return this.fdao.executeDML("UPDATE Akun SET nama='"
                + akun.getNama() + "', alamat='" + akun.getAlamat() + "', password='"
                + akun.getPassword() + " WHERE id=" + akun.getId());
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
}
