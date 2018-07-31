/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daos;
import entities.Penulis;
import java.sql.Connection;
import java.util.List;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class PenulisDAO {
private final FunctionDAO fdao;

    public PenulisDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Penulis penulis) {
        return this.fdao.executeDML("INSERT INTO Penulis VALUES("
                + penulis.getId() + ",'" + penulis.getPenulis() + "')");
    }

    public boolean update(Penulis penulis) {
        return this.fdao.executeDML("UPDATE Penulis SET penulis='"
                + penulis.getPenulis()+ "' WHERE id=" + penulis.getId());
    }

    public boolean delete(String penulisId) {
        return this.fdao.executeDML("DELETE FROM Penulis WHERE id=" + penulisId);
    }

    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT * FROM Penulis");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT * FROM Penulis ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM Penulis WHERE " + category + " LIKE '%" + data + "%'");
    }
    
    public Object getById(String penulisId){
        return this.fdao.getDataByID("SELECT * FROM Penulis WHERE id="+penulisId);
    }
    
    public String getAutoId(){
        return this.fdao.getAutoID("SELECT MAX(id)+1 AS MAXID FROM Penulis");
    }
}
