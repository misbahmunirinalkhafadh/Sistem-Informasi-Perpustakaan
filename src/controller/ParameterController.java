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

    public boolean save(String waktu, String denda) {
        return this.parameterDAO.insert(new Parameter(Integer.parseInt(waktu), Integer.parseInt(denda)));
    }


    public boolean drop(String waktu) {
        return this.parameterDAO.delete(Integer.parseInt(waktu));
    }

    public List<Object[]> binding() {
        return this.parameterDAO.getAll();
    }
}
