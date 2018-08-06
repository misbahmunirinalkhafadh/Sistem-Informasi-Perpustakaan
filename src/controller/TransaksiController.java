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
     * Fungsi untuk melakukan Edit data
     * @param id
     * @param tglPinjam
     * @param tglKembali
     * @param akunId
     * @param stat
     * @param terlambat
     * @param denda
     * @return 
     */
    public boolean edit(String id, String tglPinjam, String tglKembali, String akunId, String stat, String terlambat, String denda){
        return this.tdao.update(new Transaksi(id, tglPinjam,
                tglKembali, Integer.parseInt(stat), Integer.parseInt(terlambat), Integer.parseInt(denda), akunId));
    }
    
    /**
     * 
     * @param transId
     * @return 
     */
    public boolean drop(String transId){
        return this.tdao.delete(transId);
    }
    
    /**
     * 
     * @return 
     */
    public List<Object[]> binding(){
        return this.tdao.getAll();
    }
    
    /**
     * 
     * @param category
     * @param sort
     * @return 
     */
    public List<Object[]> bindingSort(String category, String sort){
        return this.tdao.getAllSort(category, sort);
    }
    
    /**
     * 
     * @param category
     * @param data
     * @return 
     */
    public List<Object[]> find(String category, String data){
        return this.tdao.search(category, data);
    }
    
    /**
     * 
     * @param transId
     * @return 
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
