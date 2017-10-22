/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaproyek1;

import com.jfoenix.controls.JFXTextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Hillal
 */
public class FXMLlatihanController implements Initializable {

    @FXML
    private TextField Name;
    @FXML
    private TextField Alm;
    @FXML
    private TextField Ab;
    @FXML
    private TextField Tlp;
    @FXML
    private JFXTextArea Hasil;
    @FXML
    private Button proses;
    @FXML
    private Button hapus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonProses(ActionEvent event) {
        String nama=Name.getText();
        String alamat=Alm.getText();
        String absen=Ab.getText();
        String telp=Tlp.getText();
        
        Hasil.setText("Nama Anda : "+nama+"\nAlamat : "+alamat+"\nAbsen : "+absen+"\nNo Telp : "+telp);
    }
    @FXML
    void buttonHapus(ActionEvent event) {
        Hasil.setText("");
        Name.setText("");
        Alm.setText("");
        Ab.setText("");
        Tlp.setText("");
    }
    
}
