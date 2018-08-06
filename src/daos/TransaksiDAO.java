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
        return this.fdao.executeDML("INSERT INTO Transaksi values('"+transaksi.getId()
                +"', to_date('"+transaksi.getTanggalPinjam()+"','dd/mm/yyyy')"
                + ", to_date('"+transaksi.getTanggalKembali()+"','dd/mm/yyyy')"
                + ","+transaksi.getStatus_pinjam()+","+transaksi.getTerlambat()+"," 
                + transaksi.getDenda() + ",'"+transaksi.getAkunId()+"')");
    }


    public boolean update(Transaksi transaksi) {
        return this.fdao.executeDML("UPDATE Transaksi set id = '' , "
                + "tanggal_pinjam = to_date('"+transaksi.getTanggalPinjam()+"','dd/mm/yyyyy'), "
                + "tanggal_kembali = to_date('"+transaksi.getTanggalKembali()+"','dd/mm/yyyy'), "
                + "status_pinjam = "+transaksi.getStatus_pinjam()+", "
                + "terlambat = "+transaksi.getTerlambat()+", "
                + "denda = "+transaksi.getDenda()+", "
                + "akun_id = '"+transaksi.getAkunId()+"'");
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
        return this.fdao.getAll("SELECT * FROM Transaksi WHERE REGEXP_LIKE(" + category + ", '" + data + "', 'i')");
    }
    
    public Object getById(String bukuId){
        return this.fdao.getDataByID("SELECT * FROM Transaksi WHERE id='"+bukuId+"'");
    }
    
    public String getAutoId(){
        return this.fdao.getAutoID("SELECT MAX(id)+1 AS MAXID FROM Transaksi");
    }
}
