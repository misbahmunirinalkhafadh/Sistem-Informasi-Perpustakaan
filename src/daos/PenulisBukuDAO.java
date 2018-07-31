/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.PenulisBuku;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dayinta Warih Wulandari
 */
public class PenulisBukuDAO {

    private final FunctionDAO fdao;
    
    public PenulisBukuDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }
    
    public boolean insert(PenulisBuku pb) {
        return this.fdao.executeDML("INSERT INTO Penulis_Buku VALUES("
                + pb.getBukuID().getId() + ",'" + pb.getPenulisId().getId()+ "')");
    }

    public boolean delete(String bukuId) {
        return this.fdao.executeDML("DELETE FROM Penulis_Buku WHERE buku_id=" + bukuId);
    }

    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT * FROM Penulis_Buku");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT * FROM Penulis_Buku ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM Penulis_Buku WHERE " + category + " LIKE '%" + data + "%'");
    }

}
