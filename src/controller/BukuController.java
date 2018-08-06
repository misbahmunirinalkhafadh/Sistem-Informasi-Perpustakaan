/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import daos.BukuDAO;
import entities.Buku;
import java.sql.Connection;
import java.util.List;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class BukuController {

    private final BukuDAO bdao;
    
    public BukuController(Connection connection) {
        this.bdao = new BukuDAO(connection);
    }
        
    /**
     * fungis untuk menyimpan data dengan parameter dibawah 
     * @param id id dari data yang akan ditambahkan 
     * @param jdl judul buku yang akan ditambahkan 
     * @param thn tahun buku yang akan ditambahkan 
     * @param stat status buku yang akan ditambahkan
     * @return memanggil method insert dari class BukuDAO dengan parameter membuat instance dari kelas Buku
     * dimana instance tersebut berisi id, jdl, thn, stat
     */
    public boolean save(String id, String jdl, String thn, String stat){
        return this.bdao.insert(new Buku(id, jdl, thn, Integer.parseInt(stat)));
    }
    
    /**
     * fungsi untuk mengubah data buku berparameter dibawah 
     * @param id id dari buku yang datanya akan dirubah bertype data string
     * @param jdl judul buku yang datanya akan dirubah bertype data string
     * @param thn tahun buku yang datanya akan dirubah bertype data string
     * @param stat status buku yang akan dirubah bertype data string
     * @return memanggil method update dari class BukuDAO dengan parameter membuat instance dari kelas Buku
     * dimana instance tersebut berisi id, jdl, thn, stat
     */
    public boolean edit(String id, String jdl, String thn, String stat){
        return this.bdao.update(new Buku(id, jdl, thn, Integer.parseInt(stat)));
    }
    
    /**
     * fungsi untuk menghapus data berdasarkakn bukuId
     * @param bukuId variable yang digunakan untuk menghapus data 
     * @return memanggil fungsi delete dari class BukuDAO dengan parameter bukuId
     */
    public boolean drop(String bukuId){
        return this.bdao.delete(bukuId);
    }
    
    /**
     * fungsi untuk menampilkan semua data 
     * @return memanggil fungsi getAll dari class bukuId
     */
    public List<Object[]> binding(){
        return this.bdao.getAll();
    }
    
    /**
     * fungi untuk menampilkan urutan data
     * @param category kategori yang digunakan untuk menentukan golongan data
     * @param sort variable yang digunakan untuk mengurutkan 
     * @return memanggil fungsi getAll dari class bukuId
     */
    public List<Object[]> bindingSort(String category, String sort){
        return this.bdao.getAllSort(category, sort);
    }
    
    /**
     * fungsi untuk melakukan pencarian data
     * @param category kategori sebagai dari suatu data 
     * @param data variable yang digunakan untuk menampilkan data
     * @return memanggil fungsi search dari class bukuId
     */
    public List<Object[]> find(String category, String data){
        return this.bdao.search(category, data);
    }
    
    /**
     * fungsi untuk mencari data berdasarkan variable tertentu
     * @param bukuId variable yang digunakan untuk mencari data 
     * @return memanggil fungsi search dari class bukuId
     */
    public Object findById(String bukuId){
        return this.bdao.getById(bukuId);
    }
    
    /**
     * 
     * @return 
     */
    public String getAutoId(){
        return this.bdao.getAutoId();
    }
}
