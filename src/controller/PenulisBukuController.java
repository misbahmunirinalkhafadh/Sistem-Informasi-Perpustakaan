/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.BukuDAO;
import daos.PenulisBukuDAO;
import daos.PenulisDAO;
import entities.Buku;
import entities.Penulis;
import entities.PenulisBuku;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dayinta Warih Wulandari
 */
public class PenulisBukuController {

    private PenulisDAO pdao;
    private final PenulisBukuDAO pbdao;
    private final PenulisDAO penulisDAO;
    private final BukuDAO bukuDAO;

    public PenulisBukuController(Connection connection) {
        this.pbdao = new PenulisBukuDAO(connection);
        this.bukuDAO = new BukuDAO(connection);
        this.penulisDAO = new PenulisDAO(connection);
    }
    
    /**
     * Fungsi untuk menyimpan data
     * @param judul judul buku yang akan ditambahkan, string 
     * @param thn tahun buku buku yang akan ditambahkan, string 
     * @param penulis penulis buku buku yang akan ditambahkan, string 
     * @return memanggil method insert dari class PenulisBukuDAO dengan parameter membuat instance dari kelas PenulisBuku
     * dimana instance tersebut berisi judul, thn, penulis
     */
    public boolean save(String judul, String thn, String penulis) {
        return this.pbdao.insert(new Buku(judul, thn), new Penulis("", penulis));
    }
    
    /**
     * Fungsi untuk menampilkan data penulis buku 
     * @param idPenulis id penulis yang akan ditambahkan, string
     * @param idTrans id transaksi yang akan ditambahkan, string 
     * @return memanggil method insertPenulisBuku dari class PenulisBukuDAO dengan parameter membuat instance dari kelas PenulisBuku
     * dimana instance tersebut berisi idPenulis, idTrans
     */
    public boolean savePenulisBuku(String idPenulis, String idTrans) {
        return this.pbdao.insertPenulisBuku(new PenulisBuku(idPenulis, idTrans));
    }

    /**
     * fungsi untuk menghapus data 
     * @param bukuId variable yang digunakan untuk menghapus data
     * @return memanggil fungsi delete dari class PenulisBukuDAO dengan parameter bukuId
     */
    public boolean drop(String bukuId) {
        return this.pbdao.delete(bukuId);
    }

    /**
     * fungsi untuk menampilkan semua data 
     * @return memanggil fungsi getAll 
     */
    public List<Object[]> binding() {
        return this.pbdao.getAll();
    }

    /**
     * fungsi untuk menampilkan data yang berurutan
     * @param category kategori sebagai golongan data yang ditampilkan
     * @param sort sort variable yang digunakan untuk mengurutkan data 
     * @return memanggil fungsi dari getAllSort
     */
    public List<Object[]> bindingSort(String category, String sort) {
        return this.pbdao.getAllSort(category, sort);
    }

    /**
     * fungsi untuk mencari data 
     * @param category kategori sebagai golongan data 
     * @param data variable data sebagai penentu data
     * @return memanggil fungsi dari search
     */
    public List<Object[]> find(String category, String data) {
        return this.pbdao.search(category, data);
    }
}
