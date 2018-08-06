/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.AkunDAO;
import daos.RoleDAO;
import entities.Akun;
import entities.Role;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dayinta Warih Wulandari
 */
public class AkunController {

    private final AkunDAO adao;
        private final RoleDAO roleDAO;

    public AkunController(Connection connection) {
        this.adao = new AkunDAO(connection);
                this.roleDAO = new RoleDAO(connection);
    }

    /**
     * fungsi untuk menyimpan data dengan parameter dibawah
     * @param nama nama yang akan ditambahkan bertype data string
     * @param alamat alamat yang akan dimasukan bertype data string
     * @param password password yang akan dimasukan bertype data string
     * @return memanggil method insert dari class AkunDAO dengan parameter membuat instance dari kelas Akun
     * dimana instance tersebut berisi nama, alamat, password
     */
    public boolean save(String nama, String alamat, String password) {
        return this.adao.insert(new Akun(nama, alamat, password));
    }

    /**
     * fungsi untuk mengubah data dengan parameter dibawah 
     * @param id id dari data yang akan dirubah bertype data string
     * @param nama nama dari data yang akan dirubah bertype data string
     * @param alamat alamat dari data yang akan dirubah bertype data string
     * @param pass password dari data yang akan dirubah bertype data string
     * @return memanggil method update dari class AkunDAO dengan parameter membuat instance dari kelas Akun
     * dimana instance tersebut berisi nama, alamat, password
     */
    public boolean edit(String id, String nama, String alamat, String pass) {
        return this.adao.update(new Akun(id, nama, alamat, pass));
    }

    /**
     * fungsi untuk menghapus data berparameter seperti dibawah
     * @param akunId id dari data akun yang akan dihapus bertype data string 
     * @return memanggil fungsi delete dari class AkunDAO dengan parameter akunId
     */
    public boolean drop(String akunId) {
        return this.adao.delete(akunId);
    }

    /**
     * fungsi untuk menampilkan semua data
     * @return memanggil fungsi getAll dari class AkunDAO
     */
    public List<Object[]> binding() {
        return this.adao.getAll();
    }

    /**
     * Fungsi untuk menampilkan data dengan berurutan
     * @param category kategori dari data berdasarkan variable bertype data string
     * @param sort keyword dari pencarian bertype data string
     * @return memamnggil fungsi search dari class AkunDAO dengan parameter category dan data
     */
    public List<Object[]> bindingSort(String category, String sort) {
        return this.adao.getAllSort(category, sort);
    }

    /**
     * Fungsi untuk mencari data dengan parameter dibawah 
     * @param category kategori pada suatu data
     * @param data variable dari suatu data yang akan dicari
     * @return 
     */
    public List<Object[]> find(String category, String data) {
        return this.adao.search(category, data);
    }

    /**
     * fungsi untuk mencari data berdasarkan variable dari akunId
     * @param akunId id dari data yang akan dicari
     * @return 
     */
    public Object findById(String akunId) {
        return this.adao.getById(akunId);
    }
}
