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

public class ViewHome {

        public static void main(String[] args) {
        ViewHome1 home = new ViewHome1();
        //MVC_Daftarfilm mvcp = new MVC_Daftarfilm();
    }
}
class ViewHome1 extends JFrame{
   JButton btnHome = new JButton("HOME");
   JButton btnGaji = new JButton("GAJI");
   JButton btnData = new JButton("DATA");
   JButton btnPetunjuk = new JButton("PETUNJUK");
   JButton btnAdmin = new JButton("Admin");
   
   JLabel lHome = new JLabel("Selamat datang, Silahkan Masuk ke menu gaji u/ melakukan perhitungan gaji. Jika mengalami kesulitan Klik Menu Petunjuk");
   
  public ViewHome1(){
      setDefaultCloseOperation(EXIT_ON_CLOSE);
       //setVisible(true);
       setLayout(null);
       setSize(900,700);
       setLocation(225,75);
       
       add(lHome);
       lHome.setBounds(345,120,400,200);
       
       add(btnHome);
       btnHome.setBounds(50,10,100,100);
       add(btnGaji);
       btnGaji.setBounds(50,120,100,100);
       add(btnData);
       btnData.setBounds(50,230,100,100);
       add(btnPetunjuk);
       btnPetunjuk.setBounds(50,340,100,100);
       add(btnAdmin);
       btnAdmin.setBounds(500,50,90,50);
       
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
       
       btnAdmin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
    LoginAdmin login= new LoginAdmin();
    dispose();

        }
   });
      
     setVisible(true);
   }
   
}
/*

public class Responsi {

        public static void main(String[] args) {
        Responsi1 g = new Responsi1();
        //MVC_Daftarfilm mvcp = new MVC_Daftarfilm();
    }
}

class Responsi1 extends JFrame {
   JButton btnGaji = new JButton("GAJI");
   JButton btnData = new JButton("DATA");
   JButton btnHome = new JButton("HOME");
   JButton btnPetunjuk = new JButton("PETUNJUK");
   
public Responsi1(){
setTitle("MENU");
	setDefaultCloseOperation(3);
	setSize(350,200);
        setLocation(500,275);
setLayout(null);
	add(btnGaji);
	add(btnData);
        
   
btnGaji.setBounds(10,50,150,40);
btnData.setBounds(160,10,150,40);
btnData.setBounds(160,50,150,40);
btnHome.setBounds(10,10,150,40);

        
        btnGaji.addActionListener(new ActionListener(){
       
             @Override
             public void actionPerformed(ActionEvent e){
                 MVC mvc = new MVC();
                 mvc.Gaji();
                 dispose();
             }
        });
        
       btnData.addActionListener(new ActionListener(){
       
             @Override
             public void actionPerformed(ActionEvent e){
                        MVC mvc = new MVC();
                        mvc.Data();
                 
            dispose();
             }
        }); 

        btnHome.addActionListener(new ActionListener(){
       
             @Override
             public void actionPerformed(ActionEvent e){
                 MVC mvc = new MVC();
                     mvc.Home();
                 
            dispose();
             }
         }); 
  
        btnPetunjuk.addActionListener(new ActionListener(){
       
             @Override
             public void actionPerformed(ActionEvent e){
                 MVC mvc = new MVC();
                       mvc.Petunjuk();
                 
            dispose();
             }
         }); 
  

       
        setVisible(true);
}   
}

*/