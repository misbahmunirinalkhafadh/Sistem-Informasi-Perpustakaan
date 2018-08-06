/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Buku;
import entities.Penulis;
import entities.PenulisBuku;
import controller.PenulisBukuController;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dayinta Warih Wulandari
 */
public class PenulisBukuDAO {

    private final FunctionDAO fdao;
    private final Connection connection;
    
    public PenulisBukuDAO(Connection connection) {
        this.connection = connection;
        this.fdao = new FunctionDAO(connection);
    }

    /**
     * Fungsi untuk menambah data 
     * @param buku variable untuk menambah data
     * @param penulis variable untuk menambah data
     * @return memanggil fungsi prepareCall 
     */
    public boolean insert(Buku buku, Penulis penulis) {
        try {
            CallableStatement cs = connection.prepareCall("{CALL tambahBuku(?,?,?)}");
            cs.setString(1, buku.getJudul());
            cs.setString(2, buku.getTahun());
            cs.setString(3, penulis.getId());
            cs.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PenulisBukuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    /**
     * Fungsi untuk menambah data penulis buku
     * @param pb variable untuk menambah data 
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query insert 
     */
    public boolean insertPenulisBuku(PenulisBuku pb){
                return this.fdao.executeDML("INSERT INTO Penulis_buku VALUES('"
                + pb.getBukuID() + "', '" + pb.getPenulisId() + "')");
    }

    /**
     * Fungsi untuk menghapus data 
     * @param bukuId variable untuk menghapus data 
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query delete
     */
    public boolean delete(String bukuId) {
        return this.fdao.executeDML("DELETE FROM Penulis_Buku WHERE buku_id=" + bukuId);
    }

    /**
     * fungsi untuk menampilkan semua data
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query untuk menampilkan data
     */
    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT pb.buku_id, pb.penulis_id, b.judul, p.penulis, b.status "
                + "FROM Penulis p JOIN Penulis_buku pb "
                + "ON p.id = pb.penulis_id "
                + "JOIN Buku b "
                + " ON pb.buku_id = b.id");
    }

    /**
     * Fungsi untuk menampilkan semua data dengan sorting
     * @param category data akan diurutkan berdasarkan variabel ini
     * @param sort jenis sortir
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query untuk menampilkan data
     */
    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT pb.buku_id, pb.penulis_id, b.judul, p.penulis, b.status "
                + "FROM Penulis p JOIN Penulis_buku pb "
                + "ON p.id = pb.penulis_id "
                + "JOIN Buku b "
                + " ON pb.buku_id = b.id ORDER BY " + category + " " + sort);
    }

    /**
     * Fungsi untuk menampilkan beberapa data / search
     * @param category data akan dicari dari kategori ini
     * @param data keyword pencarian
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query search
     */
    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT pb.buku_id, pb.penulis_id, b.judul, p.penulis, b.status "
                + "FROM Penulis p JOIN Penulis_buku pb "
                + "ON p.id = pb.penulis_id "
                + "JOIN Buku b "
                + " ON pb.buku_id = b.id WHERE REGEXP_LIKE("+category+", '" + data + "','i')");
    }
}
