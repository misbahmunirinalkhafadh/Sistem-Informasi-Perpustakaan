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

    /**
     * fungsi untuk insert data 
     * @param buku instance dari class Buku
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query untuk insert
     */
    public boolean insert(Buku buku) {
        return this.fdao.executeDML("INSERT INTO Buku VALUES("
                + buku.getId() + ",'" + buku.getJudul() + ",'" + buku.getTahun()
                + ",'" + buku.getStatus()+ "')");
    }

    /**
     * fungsi untuk update data 
     * @param buku instance dari class Buku
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query untuk update
     */
    public boolean update(Buku buku) {
        return this.fdao.executeDML("UPDATE Buku SET role='"
                + buku.getJudul() + "', tahun='" + buku.getTahun() + "', status='"
                + buku.getStatus() + " WHERE id=" + buku.getId());
    }

    /**
     * fungsi untuk delete data 
     * @param bukuId id data yang akan dihapus 
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query untuk hapus
     */
    public boolean delete(String bukuId) {
        return this.fdao.executeDML("DELETE FROM Buku WHERE id=" + bukuId);
    }

    /**
     * fungsi untuk menampilkan semua data 
     * @return memanggil fungsi getAll dengan query untuk menampilkan data
     */
    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT * FROM Buku");
    }

    /**
     * fungsi untuk menampilkan semua data dengan sorting 
     * @param category variable untuk mengrutkan data 
     * @param sort jenis sortir
     * @return memanggil fungsi getAllSort dengan query untuk menampilkan data 
     */
    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT * FROM Buku ORDER BY " + category + " " + sort);
    }

    /**
     * fungsi untuk menampilkan beberapa data 
     * @param category variable untuk menampilkan data 
     * @param data keyword pencarian 
     * @return memanggil fungsi getAll dengan query search 
     */
    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM Buku WHERE REGEXP_LIKE(" + category + ", '" + data + "' , 'i')");
    }
    
    /**
     * fungsi untuk menampilkan data dengan id tertentu
     * @param bukuId id data akan ditampilkan 
     * @return memanggil fungsi getDataByID dengan query
     */
    public Object getById(String bukuId){
        return this.fdao.getDataByID("SELECT * FROM Buku WHERE id="+bukuId);
    }
    
    /**
     * 
     * @return 
     */
    public String getAutoId(){
        return this.fdao.getAutoID("SELECT MAX(id)+1 AS MAXID FROM Buku");
    }
}
