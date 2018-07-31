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
    
    public boolean insert(TransaksiBuku transaksiBuku) {
        return this.fdao.executeDML("INSERT INTO trans_buku VALUES("
                + transaksiBuku.getBukuId().getId() + ",'" + transaksiBuku.getBukuId().getId()+ "')");
    }

    public boolean delete(String transId) {
        return this.fdao.executeDML("DELETE FROM trans_buku WHERE transaksi_id=" + transId);
    }

    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT tb.transaksi_id, t.akun_id, a.nama, b.judul, t.tanggal_pinjam, t.tanggal_kembali, t.status_pinjam, t.terlambat, t.denda"
                + " from Akun a join Transaksi t"
                + " on a.id = t.akun_id"
                + " join Trans_buku tb"
                + " on t.id = tb.transaksi_id"
                + " join Buku b"
                + " on tb.buku_id = b.id");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT tb.transaksi_id, t.akun_id, a.nama, b.judul, t.tanggal_pinjam, t.tanggal_kembali, t.status_pinjam, t.terlambat, t.denda"
                + " from Akun a join Transaksi t"
                + " on a.id = t.akun_id"
                + " join Trans_buku tb"
                + " on t.id = tb.transaksi_id"
                + " join Buku b"
                + " on tb.buku_id = b.id ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM Transaksi_Buku WHERE " + category + " LIKE '%" + data + "%'");
    }

}
