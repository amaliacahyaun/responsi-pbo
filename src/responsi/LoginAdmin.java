/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

/**
 *
 * @author DELL
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LoginAdmin extends JFrame {
    Connection con;
    Statement stm;
    ResultSet rs;
    String sql;
    
   final JTextField fnama = new JTextField(10);
   final JPasswordField fpass = new JPasswordField(10);

   JLabel lnama = new JLabel(" Username ");
   JLabel lpass = new JLabel(" Password ");
   JButton btnSave = new JButton("Login");
   

public LoginAdmin() {
   
setTitle("Login");
	setDefaultCloseOperation(3);
	setSize(350,200);
        setLocation(500,275);
setLayout(null);
	add(lnama);
	add(fnama);
        add(lpass);
	add(fpass);
        add(btnSave);
   
lnama.setBounds(10,10,120,20);
fnama.setBounds(140,10,150,20);
lpass.setBounds(10,30,120,20);
fpass.setBounds(140,30,150,20);
btnSave.setBounds(135,130,100,20);

        
        btnSave.addActionListener(new ActionListener(){
       
             @Override
             public void actionPerformed(ActionEvent e){
                 try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/responsipbo", "root", "");
            stm = con.createStatement();
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+exc.getMessage());
        }
                 if(fnama.getText().length()>0){
                                   try {
                    sql = "SELECT * FROM admin WHERE Username='"+fnama.getText()+"' AND Password='"+fpass.getText()+"'";
                    rs = stm.executeQuery(sql);
                    if(rs.next()){
                        if(fnama.getText().equals(rs.getString("Username")) && fpass.getText().equals(rs.getString("password"))){
                            JOptionPane.showMessageDialog(null, "berhasil login");
                            System.out.println("Koneksi berhasil");
                         //   Menuutama menu = new Menuutama();
                        }
                    }else{
                            JOptionPane.showMessageDialog(null, "username atau password salah");
                          //  Kepanitiaan login = new Kepanitiaan();
                        }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
               System.out.println("Koneksi gagal"); }
                             
                 }
            dispose();
             }
   });
        
               
        setVisible(true);
}
}
