/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author DELL
 */
public class ViewPetunjuk extends JFrame{
    JLabel lSatu = new JLabel(" Klik tombol gaji u/ menghitung gaji anda ");
    JLabel lDua= new JLabel(" Kliktombol data u/ melihat data sudah masuk blm");
    JButton btnHome = new JButton(" HOME ");
   
    
   public ViewPetunjuk(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
       //setVisible(true);
       setLayout(null);
       setSize(900,700);
       setLocation(225,75);
       
       add(lSatu);
        lSatu.setBounds(300,380,600,20);
        add(lDua);
        lDua.setBounds(300,400,600,20);
        
       add(btnHome);
       btnHome.setBounds(405,500,100,20);
       
       btnHome.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                 MVC mvc = new MVC();
                        mvc.Home();
                 
            //ViewData data= new ViewData();
           // dispose();

                }
           });
       
     setVisible(true);    
   }
}
