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

    /**
     * Fungsi untuk insert data
     * @param penulis instance dari class Penulis
     * @return memanggil fungsi prepareCall dengan query 
     */
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

    /**
     * Fungsi untuk update data
     * @param penulis instance dari class Penulis 
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query untuk update
     */
    public boolean update(Penulis penulis) {
        return this.fdao.executeDML("UPDATE Penulis SET penulis='"
                + penulis.getPenulis() + "' WHERE id='" + penulis.getId()+"'");
    }

    /**
     * Fungsi untuk menghapus data
     * @param penulisId id dari data yang ingin di hapus
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query hapus
     */
    public boolean delete(String penulisId) {
        return this.fdao.executeDML("DELETE FROM Penulis WHERE id='" + penulisId+"'");
    }

    /**
     * Fungsi untuk menampilkan semua data
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query untuk menampilkan data
     */
    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT * FROM Penulis");
    }

    /**
     * Fungsi untuk menampilkan semua data dengan sorting
     * @param category data akan diurutkan berdasarkan variabel ini
     * @param sort jenis sortir
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query untuk menampilkan data
     */
    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT * FROM Penulis ORDER BY " + category + " " + sort);
    }

    /**
     * Fungsi untuk menampilkan beberapa data / search
     * @param category data akan dicari dari kategori ini
     * @param data keyword pencarian
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query search
     */
    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM Penulis WHERE REGEXP_LIKE(" + category + ",'" + data + "', 'i')");
    }

    /**
     * Fungsi untuk menampilkan data dengan id tertentu
     * @param penulisId id data yang akan ditampilkan
     * @return  memanggil fungsi getDataByID dengan query
     */
    public Object getById(String penulisId) {
        return this.fdao.getDataByID("SELECT * FROM Penulis WHERE id=" + penulisId);
    }

    /**
     * menampilkan data secara otomatis 
     * @return memanggil fungsi getAutoID dengan query
     */
    public String getAutoId() {
        return this.fdao.getAutoID("SELECT MAX(id)+1 AS MAXID FROM Penulis");
    }
}
