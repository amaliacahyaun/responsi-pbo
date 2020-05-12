/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author DELL
 */
public class ControllerProject {
    ModelProject modelProject;
    ViewGaji viewGaji;
    ViewData viewData;
    
    public ControllerProject(ModelProject modelProject, ViewGaji viewGaji){
    this.modelProject = modelProject;
    this.viewGaji = viewGaji;
    
    viewGaji.btnCreatePanel.addActionListener(new ActionListener(){
        @Override
    public void actionPerformed (ActionEvent e){
    if((viewGaji.getID().equals("")
            || viewGaji.getNama().equals("")
            || viewGaji.getPosisi().equals("")
            || viewGaji.getAlamat().equals("")
            || viewGaji.getNoHP().equals("")
            || viewGaji.getGaji().equals("")
            || viewGaji.getJam().equals("")
            || viewGaji.getTunjang().equals("")
           || viewGaji.getPajak().equals("")
           || viewGaji.getTGaji().equals("")
            )){
    JOptionPane.showMessageDialog(null, "Failed tidak boleh kosong");
    }
    else{
    String id = viewGaji.getID();
    String nama = viewGaji.getNama();
                    
    String posisi = viewGaji.getPosisi();;
    String alamat = viewGaji.getAlamat();
    String nohp = viewGaji.getNoHP();
    String gaji = viewGaji.getGaji();
    String jam = viewGaji.getJam();
    String tunjang = viewGaji.getTunjang();
    String pajak = viewGaji.getPajak();
    String tgaji = viewGaji.getTGaji();
    
    modelProject.insertGaji(id, nama, posisi,alamat, nohp, gaji, jam, tunjang, pajak,tgaji);
    
    }
    }
    });    
}
    
    public ControllerProject(ModelProject modelProject, ViewData viewData){
    this.modelProject = modelProject;
    this.viewData = viewData;
    
    viewData.btnShow.addActionListener(new ActionListener(){
        @Override
    public void actionPerformed (ActionEvent e){
    
    if(modelProject.getBanyakData()!=0){
    String data[][] = modelProject.readData();
    viewData.tabel.setModel((new JTable(data, viewData.namaKolom)).getModel());
    }
    else{
    JOptionPane.showMessageDialog(null, "Data tidak ada");
    }
    }
    });
    }
}
