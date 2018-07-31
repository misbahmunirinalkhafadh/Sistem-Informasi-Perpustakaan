/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daos;

import entities.Buku;
import java.sql.Connection;
import java.util.List;

/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class BukuDAO {
    
    private final FunctionDAO fdao;

    public BukuDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Buku buku) {
        return this.fdao.executeDML("INSERT INTO Buku VALUES("
                + buku.getId() + ",'" + buku.getJudul() + ",'" + buku.getTahun()
                + ",'" + buku.getStatus()+ "')");
    }

    public boolean update(Buku buku) {
        return this.fdao.executeDML("UPDATE Buku SET judul='"
                + buku.getJudul() + "', tahun='" + buku.getTahun() + "', status='"
                + buku.getStatus() + " WHERE id=" + buku.getId());
    }

    public boolean delete(String bukuId) {
        return this.fdao.executeDML("DELETE FROM Buku WHERE id=" + bukuId);
    }

    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT * FROM Buku");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT * FROM Buku ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM Buku WHERE " + category + " LIKE '%" + data + "%'");
    }
    
    public Object getById(String bukuId){
        return this.fdao.getDataByID("SELECT * FROM Buku WHERE id="+bukuId);
    }
    
    public String getAutoId(){
        return this.fdao.getAutoID("SELECT MAX(id)+1 AS MAXID FROM Buku");
    }
}
