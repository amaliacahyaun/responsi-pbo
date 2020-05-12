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
public class MVC {
 public void Gaji(){
        ViewGaji viewGaji = new ViewGaji();
        ModelProject modelProject = new ModelProject();
        ControllerProject controllerProject = new ControllerProject(modelProject, viewGaji);
    }
    public void Data(){
        ViewData viewData = new ViewData();
        ModelProject modelProject = new ModelProject();
        ControllerProject controllerProject = new ControllerProject(modelProject, viewData);
    }
      public void Home(){
        ViewHome viewHome = new ViewHome();
      //  ModelProject modelProject = new ModelProject();
      //  ControllerProject controllerProject = new ControllerProject(modelProject, viewAdmin);
    }
      public void Petunjuk(){
        ViewPetunjuk viewPetunjuk = new ViewPetunjuk();
      //  ModelProject modelProject = new ModelProject();
      //  ControllerProject controllerProject = new ControllerProject(modelProject, viewAdmin);
    }
   
}
