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

    public boolean save(String idAkun, String idBuku, String tglP, String tglK) {
        return this.tbdao.insert(new Transaksi(idAkun, tglP, tglK), new Akun(idAkun), new Buku(idBuku));
    }

    public boolean edit(String idt) {
        return this.tbdao.edit(new Transaksi(idt));
    }

    public Object getIdBuku(String jdl) {
        return this.tbdao.getId(jdl);
    }

    public boolean drop(String tranId) {
        return this.tbdao.delete(tranId);
    }

    public List<Object[]> binding() {
        return this.tbdao.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort, String nm) {
        return this.tbdao.getAllSort(category, sort, nm);
    }

    public List<Object[]> find(String category, String data) {
        return this.tbdao.search(category, data);
    }

    public Object findById(String transId) {
        return this.tbdao.getById(transId);
    }

}
