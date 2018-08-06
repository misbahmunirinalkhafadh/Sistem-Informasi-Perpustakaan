/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Parameter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dayinta Warih Wulandari
 */
public class ParameterDAO {

    private final FunctionDAO fdao;
    private Connection connection;

    public ParameterDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    /**
     * fungsi untuk insert data 
     * @param parameter instace dari class Parameter
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query untuk insert
     */
    public boolean insert(Parameter parameter) {
        return this.fdao.executeDML("INSERT INTO Parameter VALUES("
                + parameter.getWaktu() + ",'" + parameter.getDenda() + "')");
    }

    /**
     * fungsi untuk menghapus data 
     * @param idParameter id untuk menghapus data 
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query untuk hapus 
     */
    public boolean delete(int idParameter) {
        return this.fdao.executeDML("DELETE FROM Parameter WHERE id=" + idParameter);
    }

    /**
     * fungsi untuk menampilkan data waktu
     * @param idParameter id untuk menampilkan data 
     * @return memanggil fungsi getDataById dari class FunctionDAO dengan parameter query untuk menampilkan data
     */
    public Object getWaktu(String idParameter) {
        return this.fdao.getDataByID("SELECT waktu FROM Penulis WHERE id=" + idParameter);
    }

    /**
     * fungsi untuk menampilkan data denda
     * @param idParameter id untuk menampilkan data 
     * @return memanggil fungsi getDataById dari class FunctionDAO dengan parameter query untuk menampilkan data denda
     */
    public Object getDenda(String idParameter) {
        return this.fdao.getDataByID("SELECT denda FROM Penulis WHERE id=" + idParameter);
    }
}
