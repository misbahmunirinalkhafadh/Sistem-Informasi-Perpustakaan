/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.TransaksiBukuDAO;
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

    public TransaksiBukuController(Connection connection) {
        this.tbdao = new TransaksiBukuDAO(connection);
    }

    public boolean save(Transaksi transId, Buku bukuId) {
        return this.tbdao.insert(new TransaksiBuku(transId, bukuId));
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
