/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andreagung_2007051035_camera;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import kamera.db.DBHandler;
import kamera.model.Kamera;

/**
 *
 * @author ANDRE
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private Button btnSave;

    @FXML
    private TextField tfNama;

    @FXML
    private TextField tfAlamat;

    @FXML
    private DatePicker dpTanggalBeli;

    @FXML
    private RadioButton rdHitam;

   

    @FXML
    private RadioButton rdPutih;

    @FXML
    private TextField tfJenis;

    @FXML
    private TextField noHp;
    
   

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        
        System.out.println(tfNama.getText());
        System.out.println(tfAlamat.getText());
        System.out.println(dpTanggalBeli.getValue().toString());
        String warna="";
        if (rdHitam.isSelected())
           warna=rdHitam.getText();
        if (rdPutih.isSelected())
           warna=rdPutih.getText();
        
        
        
        
        System.out.println(warna);
        System.out.println(tfJenis.getText());
        System.out.println(noHp.getText());
        Kamera kmr = new Kamera(tfNama.getText(),tfAlamat.getText(),dpTanggalBeli.getValue().toString(),
            warna,tfJenis.getText(), Long.valueOf( noHp.getText()));
        DBHandler dh = new DBHandler("MYSQL");
        dh.addKamera(kmr);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
