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
    
    public boolean insert(Transaksi transaksi) {
        return this.fdao.executeDML("INSERT INTO Transaksi VALUES('"
                + transaksi.getId() + "', '" + transaksi.getTanggalPinjam() + "', '" + transaksi.getTanggalKembali()
                + "', '" + transaksi.getAkunId()
                + "', " + transaksi.getStatus_pinjam()
                + "," + transaksi.getTerlambat()
                + "," + transaksi.getDenda()
                + ")");
    }

    public boolean update(Transaksi transaksi) {
        return this.fdao.executeDML("UPDATE Transaksi SET tanggal_pinjam='"
                + transaksi.getTanggalPinjam() + "', tanggal_kembali='" + transaksi.getTanggalKembali()
                + "', akun_id='" + transaksi.getAkunId()
                + "', status_pinjam=" + transaksi.getStatus_pinjam()
                + ", terlambat=" + transaksi.getTerlambat()
                + ", denda=" + transaksi.getDenda()
                + " WHERE id='" + transaksi.getId()+"')");
    }

    public boolean delete(String transId) {
        return this.fdao.executeDML("DELETE FROM Transaksi WHERE id='" + transId+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT * FROM Transaksi");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT * FROM Transaksi ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM Transaksi WHERE " + category + " LIKE '%" + data + "%'");
    }
    
    public Object getById(String bukuId){
        return this.fdao.getDataByID("SELECT * FROM Transaksi WHERE id='"+bukuId+"'");
    }
    
    public String getAutoId(){
        return this.fdao.getAutoID("SELECT MAX(id)+1 AS MAXID FROM Transaksi");
    }
}
