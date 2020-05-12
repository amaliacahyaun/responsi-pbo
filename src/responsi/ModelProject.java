/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ModelProject {
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/responsipbo";
    static final String USER = "root"; 
    static final String PASS = "";  
    
    Connection con;
    Statement stm;
    
    
    public ModelProject() {
        try{
            Class.forName(JDBC_DRIVER);
            con = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Koneksi Berhasil!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi gagal");
        }
    }
    
    public void insertGaji(String id, String nama, String posisi,String alamat, String nohp, String gaji, String jam, String tunjang, String  pajak,String tgaji){
    try{
        String query = "INSERT INTO `gaji` (`ID`, `Nama`,`Posisi`, `Alamat`, `NoHP`, `Gaji`, `Jam`, `Tunjang`, `Pajak`, `Totalgaji`) VALUES ('"+id+"', '"+nama+"', '"+posisi+"', '"+alamat+"', '"+nohp+"', '"+gaji+"', '"+jam+"', '"+tunjang+"', '"+pajak+"', '"+tgaji+"')";
        stm = (Statement) con.createStatement();
        stm.executeUpdate(query);
        System.out.println("Berhasil Ditambahkan");
        JOptionPane.showMessageDialog(null, "Data berhasil ditambah");
        }
    catch(Exception sql){
        System.out.println(sql.getMessage());
        JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
   
    public String[][] readData(){
    try{
        int jmlData = 0;
        String data[][] = new String[getBanyakData()][7];
        String query = "Select * from `gaji`";
        ResultSet resultSet = stm.executeQuery(query);
        while (resultSet.next()){
        data[jmlData][0] = resultSet.getString("ID");
        data[jmlData][1] = resultSet.getString("Nama");
        data[jmlData][2] = resultSet.getString("Posisi");
        data[jmlData][3] = resultSet.getString("Gaji");
        data[jmlData][4] = resultSet.getString("Jam");
        data[jmlData][5] = resultSet.getString("Tunjang");
        data[jmlData][6] = resultSet.getString("Totalgaji");
        jmlData++;
    }
    return data;
    }
    catch(SQLException e){
        System.out.println(e.getMessage());
        System.out.println("SQL Error");
        return null;
    }
    }
    
    public int getBanyakData(){
        int jmlData = 0;
    try{
        stm = con.createStatement();
        String query = "Select * from `gaji`";
        ResultSet resultSet = stm.executeQuery(query);
        while(resultSet.next()){
            jmlData++;
            }
        return jmlData;
        }
    catch(SQLException e){
        System.out.println(e.getMessage());
        System.out.println("SQL Error");
        return 0;
        }
    }
    
    
}
