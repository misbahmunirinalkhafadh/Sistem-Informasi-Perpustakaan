/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daos;

import entities.TransaksiBuku;
import java.sql.Connection;
import java.util.List;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class TransaksiBukuDAO {
        
    private final FunctionDAO fdao;

    public TransaksiBukuDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }
    
    public boolean insert(TransaksiBuku tb) {
        return this.fdao.executeDML("INSERT INTO Transaksi_Buku VALUES("
                + tb.getBukuId() + ",'" + tb.getTransaksiId()+ "')");
    }

    public boolean delete(String transId) {
        return this.fdao.executeDML("DELETE FROM Transaksi_Buku WHERE buku_id=" + transId);
    }

    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT * FROM Transaksi_Buku");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT * FROM Transaksi_Buku ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM Transaksi_Buku WHERE " + category + " LIKE '%" + data + "%'");
    }

}
