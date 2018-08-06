/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.AkunDAO;
import daos.BukuDAO;
import daos.TransaksiBukuDAO;
import daos.TransaksiDAO;
import entities.Akun;
import entities.Buku;
import entities.Transaksi;
import entities.TransaksiBuku;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dayinta Warih Wulandari
 */
public class TransaksiBukuController {

    private final TransaksiBukuDAO tbdao;
    private BukuDAO bukuDAO;
    private TransaksiDAO transaksiDAO;
    private Akun akun;
    private AkunDAO akunDAO;

    public TransaksiBukuController(Connection connection) {
        this.tbdao = new TransaksiBukuDAO(connection);
        this.bukuDAO = new BukuDAO(connection);
        this.transaksiDAO = new TransaksiDAO(connection);
        this.akunDAO = new AkunDAO(connection);
    }

    /**
     * Fungsi untuk menyimpan data dengan parameter dibawah 
     * @param idAkun id akun yang akan ditambahkan, string
     * @param idBuku id buku data yang akan ditambahkan, string
     * @param tglP tglP data yang akan ditambahkan, STring
     * @param tglK tglK data yang akan ditambahkan, string
     * @return memanggil method insert dari class TransaksiBukuDAO dengan parameter membuat instance dari kelas Transaksi
     * dimana instance tersebut berisi idAkun, idBuku, tglP, tglK
     */
    public boolean save(String idAkun, String idBuku, String tglP, String tglK) {
        return this.tbdao.insert(new Transaksi(idAkun, tglP, tglK), new Akun(idAkun), new Buku(idBuku));
    }

    /**
     * Fungsi untuk mengubah data 
     * @param idt idt untuk mengubah data, string
     * @return memanggil fungsi edit
     */
    public boolean edit(String idt) {
        return this.tbdao.edit(new Transaksi(idt));
    }

    /**
     * Fungsi untuk menampilkan data berdasarkan id buku
     * @param jdl variable untuk menampilkan data 
     * @return 
     */
    public Object getIdBuku(String jdl) {
        return this.tbdao.getId(jdl);
    }

    /**
     * fungsi untuk menghapus data 
     * @param tranId variable untuk menghapus data 
     * @return memanggil fungsi delete
     */
    public boolean drop(String tranId) {
        return this.tbdao.delete(tranId);
    }

    /**
     * fungsi untuk menampilkan semua data
     * @return memanggil fungsi getAll
     */
    public List<Object[]> binding() {
        return this.tbdao.getAll();
    }

    /**
     * fungsi untuk menampilkan data secara terurut
     * @param category golongan data 
     * @param sort variable untuk mengurutkan data 
     * @param nm variable nama 
     * @return memanggil fungsi getAllSort
     */
    public List<Object[]> bindingSort(String category, String sort, String nm) {
        return this.tbdao.getAllSort(category, sort, nm);
    }

    /**
     * fungsi untuk mencari data 
     * @param category golongan data 
     * @param data variable untuk mencari data
     * @return memanggil fungsi search 
     */
    public List<Object[]> find(String category, String data) {
        return this.tbdao.search(category, data);
    }

    /**
     * 
     * @param transId
     * @return 
     */
    public Object findById(String transId) {
        return this.tbdao.getById(transId);
    }
}
