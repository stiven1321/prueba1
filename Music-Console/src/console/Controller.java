package console;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.text.Text;

public class Controller {
	
	
    
    @FXML protected void Accion1(ActionEvent event) {
       System.out.println("Parar....");
       
    }
    
    @FXML protected void Accion2(ActionEvent event) {
        System.out.println("Empesar....");
        
     }
    
    @FXML protected void EntradaEncendida(ActionEvent event){
    	
    	Alert r = new Alert(AlertType.INFORMATION);
    	r.setTitle("Entrada");
    	r.setHeaderText("La entrada aesta abierta");
    	r.setContentText("Puedes empezar a hablar");
    	r.showAndWait(); 
    }
    
@FXML protected void SalidaEncendida(ActionEvent event){
    	
    	Alert r = new Alert(AlertType.INFORMATION);
    	r.setTitle("Salida");
    	r.setHeaderText("La Salida esta encendida");
    	r.setContentText("Puedes empezar a escuchar");
    	r.showAndWait(); 
    }
}
