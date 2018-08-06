/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daos;

import entities.Transaksi;
import java.sql.Connection;
import java.util.List;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class TransaksiDAO {
        
    private final FunctionDAO fdao;

    public TransaksiDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }
    
    /**
     * Fungsi untuk insert data
     * @param transaksi instance dari class Transaksi
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query untuk insert
     */
    public boolean insert(Transaksi transaksi) {
        return this.fdao.executeDML("INSERT INTO Transaksi values('"+transaksi.getId()
                +"', to_date('"+transaksi.getTanggalPinjam()+"','dd/mm/yyyy')"
                + ", to_date('"+transaksi.getTanggalKembali()+"','dd/mm/yyyy')"
                + ","+transaksi.getStatus_pinjam()+","+transaksi.getTerlambat()+"," 
                + transaksi.getDenda() + ",'"+transaksi.getAkunId()+"')");
    }

    /**
     * Fungsi untuk update data
     * @param transaksi instance dari class Transaksi
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query untuk update
     */
    public boolean update(Transaksi transaksi) {
        return this.fdao.executeDML("UPDATE Transaksi set id = '' , "
                + "tanggal_pinjam = to_date('"+transaksi.getTanggalPinjam()+"','dd/mm/yyyyy'), "
                + "tanggal_kembali = to_date('"+transaksi.getTanggalKembali()+"','dd/mm/yyyy'), "
                + "status_pinjam = "+transaksi.getStatus_pinjam()+", "
                + "terlambat = "+transaksi.getTerlambat()+", "
                + "denda = "+transaksi.getDenda()+", "
                + "akun_id = '"+transaksi.getAkunId()+"'");
    }

    /**
     * Fungsi untuk menghapus data
     * @param transId id dari data yang ingin di hapus
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query hapus
     */
    public boolean delete(String transId) {
        return this.fdao.executeDML("DELETE FROM Transaksi WHERE id='" + transId+"'");
    }

    /**
     * Fungsi untuk menampilkan semua data
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query untuk menampilkan data
     */
    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT * FROM Transaksi");
    }

    /**
     * Fungsi untuk menampilkan semua data dengan sorting
     * @param category data akan diurutkan berdasarkan variabel ini
     * @param sort jenis sortir
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query untuk menampilkan data
     */
    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT * FROM Transaksi ORDER BY " + category + " " + sort);
    }

    /**
     * Fungsi untuk menampilkan beberapa data / search
     * @param category data akan dicari dari kategori ini
     * @param data keyword pencarian
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query search
     */
    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM Transaksi WHERE REGEXP_LIKE(" + category + ", '" + data + "', 'i')");
    }
    
    /**
     * Fungsi untuk menampilkan data dengan id tertentu
     * @param bukuId id data yang akan ditampilkan
     * @return memanggil fungsi getDataByID dengan query
     */
    public Object getById(String bukuId){
        return this.fdao.getDataByID("SELECT * FROM Transaksi WHERE id='"+bukuId+"'");
    }
    
    /**
     * fungsi untuk mendapatkan id secara otomatis 
     * @return memanggil fungsi getAutoID dengan query
     */
    public String getAutoId(){
        return this.fdao.getAutoID("SELECT MAX(id)+1 AS MAXID FROM Transaksi");
    }
}
