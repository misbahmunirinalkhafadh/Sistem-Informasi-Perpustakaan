/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daos;
import entities.Role;
import java.sql.Connection;
import java.util.List;
/**
 * 
 * @author Dayinta Warih Wulandari
 */
public class RoleDAO {
    private final FunctionDAO fdao;

    public RoleDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    /**
     * Fungsi untuk insert data
     * @param role instance dari claess Role
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query untuk insert
     */
    public boolean insert(Role role) {
        return this.fdao.executeDML("INSERT INTO Role VALUES("
                + role.getId() + ",'" + role.getRole() + "')");
    }

    /**
     * Fungsi untuk update data
     * @param role instance dari claess Role
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query untuk update 
     */
    public boolean update(Role role) {
        return this.fdao.executeDML("UPDATE Role SET role='"
                + role.getRole()+ "' WHERE id=" + role.getId());
    }

    /**
     * Fungsi untuk menghapus data
     * @param roleId  id dari data yang ingin di hapus
     * @return memanggil fungsi executeDML dari class FunctionDAO dengan parameter query hapus
     */
    public boolean delete(String roleId) {
        return this.fdao.executeDML("DELETE FROM Role WHERE id=" + roleId);
    }

    /**
     * Fungsi untuk menampilkan semua data
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query untuk menampilkan data
     */
    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT * FROM Role");
    }

    /**
     * Fungsi untuk menampilkan semua data dengan sorting
     * @param category data akan diurutkan berdasarkan variabel ini
     * @param sort jenis sortir
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query untuk menampilkan data
     */
    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT * FROM Role ORDER BY " + category + " " + sort);
    }

    /**
     * Fungsi untuk menampilkan beberapa data / search
     * @param category data akan dicari dari kategori ini
     * @param data keyword pencarian
     * @return memanggil fungsi getAll dari class FunctionDAO dengan parameter query search
     */
    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM Role WHERE REGEXP_LIKE(" + category + ", '" + data + "', 'i')");
    }
    
    /**
     * Fungsi untuk menampilkan data dengan id tertentu
     * @param roleId id data yang akan ditampilkan
     * @return memanggil fungsi getDataByID dengan query
     */
    public Object getById(String roleId){
        return this.fdao.getDataByID("SELECT * FROM Role WHERE region_id="+roleId);
    }
    
    /**
     * Fungsi untuk mendapatkan id data secara otomatis  
     * @return memanggil fungsi getAutoID dengan query
     */
    public String getAutoId(){
        return this.fdao.getAutoID("SELECT MAX(id)+1 AS MAXID FROM Role");
    }
}
