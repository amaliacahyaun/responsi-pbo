/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ViewGaji extends JFrame{
  JLabel lKaryawan= new JLabel("INPUT ");
    
   JLabel lID= new JLabel("ID Pegawai :");
   JTextField tfID = new JTextField();
   JLabel lNama = new JLabel("Nama  :");
   JTextField tfNama = new JTextField();
   JLabel lPosisi = new JLabel(" Posisi ");
   String[] namaPosisi =
            {" Direktur"," Manajer "," Programmer "," Marketing "," Survervisor "};
   JComboBox cmbPosisi = new JComboBox(namaPosisi);
   
   JLabel lAlamat = new JLabel("Alamat  :");
   JTextField tfAlamat = new JTextField();
   JLabel lNoHP = new JLabel("No HP  :");
   JTextField tfNoHP = new JTextField();
   
   JLabel lGaji= new JLabel("Gaji Pokok :");
   JLabel lJam= new JLabel("Jam lembur :");
   JLabel lTunjang= new JLabel("Tunjangan :");
   JLabel lPajak= new JLabel("Pajak :");
   JLabel lTGaji= new JLabel("Total Gaji :");
   
   JTextField tfGaji = new JTextField();
   JTextField tfJam = new JTextField();
   JTextField tfTunjang = new JTextField();
   JTextField tfPajak = new JTextField();
   JTextField tfTGaji = new JTextField();
   
   JButton btnHome = new JButton("HOME");
   JButton btnGaji = new JButton("GAJI");
   JButton btnData = new JButton("DATA");
   JButton btnPetunjuk = new JButton("PETUNJUK");
   
   
   JButton btnCreatePanel = new JButton("Simpan");
   JButton btnHitungPanel = new JButton("Hitung");
   JButton btnAdmin = new JButton("Admin");
   
   
   public ViewGaji(){
      setDefaultCloseOperation(EXIT_ON_CLOSE);
       //setVisible(true);
       setLayout(null);
       setSize(900,700);
       setLocation(225,75);
       
       add(lKaryawan);
       lKaryawan.setBounds(345,15,150,20);
       add(lID);
       lID.setBounds(215,50,90,20);
       add(tfID);
       tfID.setBounds(315,50,90,20);
       add(lNama);
       lNama.setBounds(215,80,100,20);
       add(tfNama);
       tfNama.setBounds(315,80,90,20);
       add(lPosisi);
       lPosisi.setBounds(215,110,90,20);
       add(cmbPosisi);
       cmbPosisi.setBounds(315,110,90,20);
       add(lAlamat);
       lAlamat.setBounds(215,140,90,20);
       add(tfAlamat);
       tfAlamat.setBounds(315,140,90,20);
       
       add(lNoHP);
       lNoHP.setBounds(215,170,90,20);
       add(tfNoHP);
       tfNoHP.setBounds(315,170,90,20);
       add(lGaji);
       lGaji.setBounds(215,200,90,20);
       add(lJam);
       lJam.setBounds(215,230,90,20);
       add(lTunjang);
       lTunjang.setBounds(215,260,90,20);
       add(lPajak);
       lPajak.setBounds(215,290,90,20);
       add(lTGaji);
       lTGaji.setBounds(215,320,90,20);
       add(tfGaji);
       tfGaji.setBounds(315,200,90,20);
       add(tfJam);
       tfJam.setBounds(315,230,90,20);
       add(tfTunjang);
       tfTunjang.setBounds(315,260,90,20);
       add(tfPajak);
       tfPajak.setBounds(315,290,90,20);
       add(tfTGaji);
       tfTGaji.setBounds(315,320,90,20);
       
       
       add(btnCreatePanel);
       btnCreatePanel.setBounds(500,200,90,50);
       add(btnHitungPanel);
       btnHitungPanel.setBounds(500,300,90,50);
       add(btnAdmin);
       btnAdmin.setBounds(500,50,90,50);
       
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
      btnHitungPanel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
          String gaji= getGaji();  
          String jam=getJam();
        int Tunjang,Pajak,Total;
        if (gaji==null) {
          Tunjang   = 0;
          Pajak=0;
          Total=0;
        } else  {
            int Gaji = Integer.parseInt(gaji);
            int Jam = Integer.parseInt(jam);
            Tunjang = Jam*15000;
            Pajak = Gaji/100*1;
            Total= Gaji-Pajak+Tunjang;    
          }
        String tunjang = String.valueOf(Tunjang);
        String pajak = String.valueOf(Pajak);
        String total = String.valueOf(Total);
        
        tfTunjang.setText(tunjang);
        tfPajak.setText(pajak);
        tfTGaji.setText(total);
        
      }
    });
      
     setVisible(true);
   }
   
    public String getID(){
       return tfID.getText();
   }
   public String getNama(){
       return tfNama.getText();
   }
   public String getPosisi(){
       return (String) cmbPosisi.getSelectedItem();
   }
   public String getAlamat(){
       return tfAlamat.getText();
   
}
    public String getNoHP(){
       return tfNoHP.getText();
}  
    public String getGaji(){
       return tfGaji.getText();
   
}
    public String getJam(){
       return tfJam.getText();
   
}
    public String getTunjang(){
       return tfTunjang.getText();
   
}
    public String getPajak(){
       return tfPajak.getText();
   
}
    public String getTGaji(){
       return tfTGaji.getText();
   
}
}
