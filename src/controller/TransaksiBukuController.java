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
import entities.Transaksi;
import entities.Buku;
import entities.TransaksiBuku;
import java.sql.Connection;
import java.util.List;

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

    public boolean save(String transaksiId, String bukuId) {
        return this.tbdao.insert(new TransaksiBuku(new Transaksi(transaksiId, 
                java.sql.Date.valueOf(""), 
                java.sql.Date.valueOf(""), 
                0, 0, 0, akun), 
                new Buku(bukuId, "", "", 0)));
    }

    public boolean drop(String tranId) {
        return this.tbdao.delete(tranId);
    }

    public List<Object[]> binding() {
        return this.tbdao.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.tbdao.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.tbdao.search(category, data);
    }
}
