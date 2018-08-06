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

    public boolean insert(Parameter parameter) {
        return this.fdao.executeDML("INSERT INTO Parameter VALUES("
                + parameter.getWaktu() + ",'" + parameter.getDenda() + "')");
    }

    public boolean delete(int idParameter) {
        return this.fdao.executeDML("DELETE FROM Parameter WHERE id=" + idParameter);
    }

    public Object getWaktu(String idParameter) {
        return this.fdao.getDataByID("SELECT waktu FROM Parameter WHERE id='" + idParameter+"'");
    }
    
    public Object getDenda(String idParameter) {
        return this.fdao.getDataByID("SELECT denda FROM Parameter WHERE id='" + idParameter+"'");
    }

}
