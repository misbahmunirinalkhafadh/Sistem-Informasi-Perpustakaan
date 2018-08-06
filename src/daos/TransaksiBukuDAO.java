/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Akun;
import entities.Buku;
import entities.TransaksiBuku;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import entities.Transaksi;

/**
 *
 * @author Dayinta Warih Wulandari
 */
public class TransaksiBukuDAO {

    private final FunctionDAO fdao;
    private final Connection connection;

    public TransaksiBukuDAO(Connection connection) {
        this.connection = connection;
        this.fdao = new FunctionDAO(connection);
    }

    /**
     * fungsi untuk insert data
     * @param transaksi instance dari class TransaksiBuki
     * @param akun instance dari class TransaksiBuki
     * @param buku instance dari class TransaksiBuki
     * @return memanggil fungsi prepareCall dari class FunctionDAO dengan parameter query untuk menambahkan data
     */
    public boolean insert(Transaksi transaksi, Akun akun, Buku buku) {
        try {
            CallableStatement cs = connection.prepareCall("{CALL catatTrans(?,?,?,?)}");
            cs.setString(1, akun.getId());
            cs.setString(2, buku.getId());
            cs.setString(3, transaksi.getTanggalPinjam());
            cs.setString(4, transaksi.getTanggalKembali());
            cs.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiBukuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Fungsi Untuk Mengubah data
     * @param transaksi variable data yang akan diubah 
     * @return memanggil fungsi prepareCall dari class FunctionDAO dengan parameter query untuk mengubah data
     */
    public boolean edit(Transaksi transaksi) {
        try {
            CallableStatement cs = connection.prepareCall("{CALL editTrans(?)}");
            cs.setString(1, transaksi.getId());
            cs.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiBukuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Fungsi untuk menampilkan data berdasarkan variable id
     * @param jdl data 
     * @return memanggil fungsi getDataById dari class fungsionDAO dengan parameter query untuk menampilkan data
     */
    public Object getId(String jdl) {
        return this.fdao.getDataByID("SELECT id FROM Buku WHERE judul='" + jdl + "'");
    }

    /**
     * Fungsi untuk hapus data
     * @param transId id dari data yang ingin di hapus
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query untuk delete
     */
    public boolean delete(String transId) {
        return this.fdao.executeDML("DELETE FROM Transaksi_Buku WHERE buku_id=" + transId);
    }

    /**
     * Fungsi untuk menampilkan semua data
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query untuk menampilkan data
     */
    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT tb.transaksi_id, t.akun_id, a.nama, b.judul, to_char(t.tanggal_pinjam, 'DD-MM-YYYY'), to_char(t.tanggal_kembali, 'DD-MM-YYYY'), t.status_pinjam, t.terlambat, t.denda"
                + " from Akun a join Transaksi t"
                + " on a.id = t.akun_id"
                + " join Trans_buku tb"
                + " on t.id = tb.transaksi_id"
                + " join Buku b"
                + " on tb.buku_id = b.id ORDER BY transaksi_id");
    }

    /**
     * Fungsi untuk menampilkan semua data dengan sorting
     * @param category data akan diurutkan berdasarkan variabel ini
     * @param sort jenis sortir
     * @param nm jenis sortir dengan variable tertentu
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query untuk menampilkan data
     */
    public List<Object[]> getAllSort(String category, String sort, String nm) {
        return this.fdao.getAll("SELECT tb.transaksi_id, t.akun_id, a.nama, b.judul, to_char(t.tanggal_pinjam, 'DD-MM-YYYY'), to_char(t.tanggal_kembali, 'DD-MM-YYYY'), t.status_pinjam, t.terlambat, t.denda"
                + " from Akun a join Transaksi t"
                + " on a.id = t.akun_id"
                + " join Trans_buku tb"
                + " on t.id = tb.transaksi_id"
                + " join Buku b"
                + " on tb.buku_id = b.id "
                + "WHERE nama='" + nm + "' ORDER BY " + category + " " + sort);
    }

    /**
     * Fungsi untuk menampilkan beberapa data / search
     * @param category data akan dicari dari kategori ini
     * @param data keyword pencarian
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query search
     */
    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT tb.transaksi_id, t.akun_id, a.nama, b.judul, t.tanggal_pinjam, t.tanggal_kembali, t.status_pinjam, t.terlambat, t.denda"
                + " from Akun a join Transaksi t"
                + " on a.id = t.akun_id"
                + " join Trans_buku tb"
                + " on t.id = tb.transaksi_id"
                + " join Buku b"
                + " on tb.buku_id = b.id WHERE REGEXP_LIKE ("+category+" , '" + data + "' , 'i' )");
    }
    
    /**
     * Fungsi untuk menampilkan data buku berdasarkan variable id
     * @param bukuId variable untuk menampilkan data 
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query untuk menampilkan data
     */
    public Object getById(String bukuId){
       return this.fdao.getAll("SELECT tb.transaksi_id, t.akun_id, a.nama, b.judul, t.tanggal_pinjam, t.tanggal_kembali, t.status_pinjam, t.terlambat, t.denda"
                + " from Akun a join Transaksi t"
                + " on a.id = t.akun_id"
                + " join Trans_buku tb"
                + " on t.id = tb.transaksi_id"
                + " join Buku b"
                + " on tb.buku_id = b.id "
                + "WHERE nama =  "+ bukuId +"");
    }
}
