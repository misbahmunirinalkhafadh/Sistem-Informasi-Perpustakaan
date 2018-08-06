/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.ParameterDAO;
import entities.Parameter;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dayinta Warih Wulandari
 */
public class ParameterController {

    private final ParameterDAO parameterDAO;

    public ParameterController(Connection connection) {
        this.parameterDAO = new ParameterDAO(connection);
    }

    /**
     * fungdi untuk menyimpan data
     * @param waktu waktu dengan type data string
     * @param denda denda dengan type data string
     * @return memanggil method insert dari class ParameterDAO dengan parameter membuat instance dari kelas Parameter
     * dimana instance tersebut berisi waktu, denda
     */
    public boolean save(String waktu, String denda) {
        return this.parameterDAO.insert(new Parameter(Integer.parseInt(waktu), Integer.parseInt(denda)));
    }

    /**
     * fungsi untuk menghapus data 
     * @param waktu variable untuk menghapus data
     * @return memanggil fungdi delete pada class ParameterDAO
     */
    public boolean drop(String waktu) {
        return this.parameterDAO.delete(Integer.parseInt(waktu));
    }

    /**
     * fungsi untuk menampilkan data waktu
     * @param idParameter variable untuk menampilkan data
     * @return memanggil fungsi getWaktu 
     */
    public Object bindingWaktu(String idParameter) {
        return (this.parameterDAO.getWaktu(idParameter));
    }

    /**
     * fungsi untuk menampilkan data denda 
     * @param idParameter variable untuk menampilkan data denda
     * @return memanggil fungsi getDenda
     */
    public Object bindingDenda(String idParameter) {
        return (this.parameterDAO.getDenda(idParameter));
    }
}
