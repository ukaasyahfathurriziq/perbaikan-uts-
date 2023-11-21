package Perbaikan;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Koneksi {
    public static Connection sambung_ke_db(){
        try{
            MysqlDataSource m = new MysqlDataSource();
            m.setUser("root");
            m.setPassword("");
            m.setDatabaseName("mahasiswa ");
            m.setServerName("Localhost");
            m.setPortNumber(3306);
            m.setServerTimezone("Asia/Jakarta");
        
            Connection c = m.getConnection();
            System.out.println("Sukses Terhubung ke database");
            return c;
        } catch (SQLException e){
            System.err.println("Gagal Terhubung ke database");
            System.err.println("error"+e.getMessage());
        }
        return null;
    }

}