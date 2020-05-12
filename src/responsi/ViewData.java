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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ViewData extends JFrame{
    JButton btnHome = new JButton("HOME");
   JButton btnGaji = new JButton("GAJI");
   JButton btnData = new JButton("DATA");
   JButton btnPetunjuk = new JButton("PETUNJUK");
   
   JButton btnShow = new JButton(" SHOW ");
   JButton btnAdmin = new JButton(" ADMIN ");
   
   JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    //JScrollPane scrollPane1;
    Object namaKolom[] = {"ID","Nama", "Posisi", "Gaji Pokok", "Jam Lembur", "Tunjangan","Total Gaji"};
    
     public ViewData(){
        setTitle("DATA");
        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable (tableModel);
        scrollPane = new JScrollPane(tabel);
        //scrollPane1 = new JScrollPane(tfAlasan);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(900,700);
        setLocation(225,75);
       
        add(btnAdmin);
        btnAdmin.setBounds(500,50,90,50);
        add(btnShow);
        btnShow.setBounds(405,600,90,50);
       
        add(btnHome);
       btnHome.setBounds(50,10,100,100);
       add(btnGaji);
       btnGaji.setBounds(50,120,100,100);
       add(btnData);
       btnData.setBounds(50,230,100,100);
       add(btnPetunjuk);
       btnPetunjuk.setBounds(50,340,100,100);
       
       
       btnHome.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                 MVC mvc = new MVC();
                        mvc.Home();
                 
            //ViewData data= new ViewData();
            dispose();

                }
           });
       btnGaji.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                 MVC mvc = new MVC();
                        mvc.Gaji();
                 
            //ViewData data= new ViewData();
            dispose();

                }
           });
       
       btnData.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                 MVC mvc = new MVC();
                        mvc.Data();
                 
            //ViewData data= new ViewData();
            dispose();

                }
           });
       btnPetunjuk.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                 MVC mvc = new MVC();
                        mvc.Petunjuk();
                 
            //ViewData data= new ViewData();
            dispose();

                }
           });
       
        
        add(scrollPane);
        scrollPane.setBounds(160,200,700,180);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                btnAdmin.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
            LoginAdmin login= new LoginAdmin();
            dispose();

                }
           });
     }    
}
