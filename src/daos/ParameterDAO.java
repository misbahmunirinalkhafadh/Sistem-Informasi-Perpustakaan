/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Parameter;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dayinta Warih Wulandari
 */
public class ParameterDAO {

    private final FunctionDAO fdao;

    public ParameterDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Parameter parameter) {
        return this.fdao.executeDML("INSERT INTO Parameter VALUES("
                + parameter.getWaktu()+ ",'" + parameter.getDenda() + "')");
    }

    public boolean delete(int waktu) {
        return this.fdao.executeDML("DELETE FROM Parameter WHERE waktu=" + waktu);
    }

    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT * FROM Parameter");
    }
}
