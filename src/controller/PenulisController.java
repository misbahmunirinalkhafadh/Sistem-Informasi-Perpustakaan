/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import daos.PenulisDAO;
import entities.Penulis;
import java.sql.Connection;
import java.util.List;
/**
 * 
 * @author  Dayinta Warih Wulandari
 */
public class PenulisController {

    private final PenulisDAO penulisDAO;
    private Connection connection;

    public PenulisController(Connection connection) {
        this.penulisDAO = new PenulisDAO(connection);
    }

    /**
     * fungsi untuk menyimpan data 
     * @param penulis data nama penulis yang akan di tambahkan 
     * @return memanggil method insert dari class PenulisDAO dengan parameter membuat instance dari kelas Penulis
     * dimana instance tersebut berisi penulis
     */
    public boolean save(String penulis) {
        return this.penulisDAO.insert(new Penulis(penulis));
    }

    /**
     * fungsi untuk mengubah data penulis
     * @param id id yang akan diubah datanya
     * @param penulis nama penulis yang akan diubah datanya
     * @return memanggil method update dari class PenulisDAO dengan parameter membuat instance dari kelas Penulis
     * dimana instance tersebut berisi id, penulis
     */
    public boolean edit(String id, String penulis) {
        return this.penulisDAO.update(new Penulis(id, penulis));
    }

   /**
     * fungsi untuk menghapus data
     * @param penulsId id penulis sebagai variable untuk menghapus data
     * @return memanggil fungsi delete
     */
    public boolean drop(String penulsId) {
        return this.penulisDAO.delete(penulsId);
    }

    /**
     * fungsi untuk menampilkan semua data 
     * @return memanggil fungsi dari getAll 
     */
    public List<Object[]> binding() {
        return this.penulisDAO.getAll();
    }

    /**
     * fungsi untuk menampilkan data berdasarkan variable tertentu
     * @param category kategori sebuah data
     * @param sort variable untuk mengurutkan data
     * @return memanggil fungsi getAll 
     */
    public List<Object[]> bindingSort(String category, String sort) {
        return this.penulisDAO.getAllSort(category, sort);
    }

    /**
     * fungsi untuk mencari data 
     * @param category kategori untuk golongan data 
     * @param data variable data untuk menentukan data yang dicari
     * @return memanggil fungsi search 
     */
    public List<Object[]> find(String category, String data) {
        return this.penulisDAO.search(category, data);
    }

    /**
     * fungsi untuk mencari data dengan variable penulisId
     * @param penulisId id penulis sebagai variable untuk mencari data 
     * @return memanggil fungsi getById
     */
    public Object findById(String penulisId) {
        return this.penulisDAO.getById(penulisId);
    }

    /**
     * Fungsi untuk mendapatkan id secara otomatis
     * @return 
     */
    public String getAutoId() {
        return this.penulisDAO.getAutoId();
    }
}
