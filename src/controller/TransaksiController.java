/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import daos.TransaksiDAO;
import entities.Transaksi;
import entities.Akun;
import java.sql.Connection;
import java.util.List;
import java.text.SimpleDateFormat;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class TransaksiController {

    private final TransaksiDAO tdao;
    
    SimpleDateFormat sdf = new SimpleDateFormat("\"dd/MM/yyyy\"");
    
    public TransaksiController(Connection connection) {
        this.tdao = new TransaksiDAO(connection);
    }
     
    /**
     * Fungsi untuk melakukan insert data
     * @param id id yang ingin ditambahkan. String.
     * @param tglPinjam tanggal pinjam yang ingin ditambahkan. String.
     * @param tglKembali tanggal kembali yang ingin ditambahkan. String.
     * @param akunId aku id yang ingin ditambahkan. String.
     * @param stat status yang ingin ditambahkan. String.
     * @param terlambat terlambat yang ingin ditambahkan. String.
     * @param denda denda yang ingin ditambahkan. String.
     * @return memanggil method insert dari class TransaksiDAO dengan parameter membuat instance dari kelas Transaksi
     * dimana instance tersebut berisi id, tglPinjam, tglKembali, akunId, stat, terlambat, denda
     */
    public boolean save(String id, String tglPinjam, String tglKembali, String akunId, String stat, String terlambat, String denda){
        return this.tdao.insert(new Transaksi(id, tglPinjam,
                tglKembali, Integer.parseInt(stat), Integer.parseInt(terlambat), Integer.parseInt(denda), akunId));
    }
    
    /**
     * fungsi untuk mengubah data 
     * @param id id data yang akan dirubah 
     * @param tglPinjam tanggal pinjam transaksi 
     * @param tglKembali tanggal kembali transaksi 
     * @param akunId akun id peminjam 
     * @param stat status buku 
     * @param terlambat terlambat pengembalian buku
     * @param denda besar denda 
     * @return memanggil method update dari class TransaksiDAO dengan parameter membuat instance dari kelas Transaksi
     * dimana instance tersebut berisi id, tglPinjam, tglKembali, akunId, stat, terlambat, denda
     */
    public boolean edit(String id, String tglPinjam, String tglKembali, String akunId, String stat, String terlambat, String denda){
        return this.tdao.update(new Transaksi(id, tglPinjam,
                tglKembali, Integer.parseInt(stat), Integer.parseInt(terlambat), Integer.parseInt(denda), akunId));
    }
    
    /**
     * fungsi untuk menghapus data 
     * @param transId variable untuk menghapus data 
     * @return memanggil fungsi delete
     */
    public boolean drop(String transId){
        return this.tdao.delete(transId);
    }
    
    /**
     * fungsi untuk menampilkan semua data 
     * @return memanggil funsi getAll
     */
    public List<Object[]> binding(){
        return this.tdao.getAll();
    }
    
    /**
     * fungsi untuk menampilkan data secara terurut
     * @param category golongan data 
     * @param sort variable untuk menampilkan data 
     * @return memanggil fungsi getAllSort
     */
    public List<Object[]> bindingSort(String category, String sort){
        return this.tdao.getAllSort(category, sort);
    }
    
    /**
     * fungsi untuk mencari data 
     * @param category golongan data 
     * @param data variable data yang dicari
     * @return memanggil fungsi search
     */
    public List<Object[]> find(String category, String data){
        return this.tdao.search(category, data);
    }
    
    /**
     * fungsi untuk mencari data berdasarkan veriable tertentu
     * @param transId variable untuk mencari data 
     * @return memanggil fungsi getById
     */
    public Object findById(String transId){
        return this.tdao.getById(transId);
    }
    
    /**
     * 
     * @return 
     */
    public String getAutoId(){
        return this.tdao.getAutoId();
    }
}
