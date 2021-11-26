package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

public class LoginController implements Initializable {

	@FXML private Button btnLogin, btnJoin;
	@FXML private TextField txtId, txtPass;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnLogin.setOnAction(event->{
			String titleText = txtId.getText();
			System.out.println("id : " + titleText);
			String pass = txtPass.getText();
			System.out.println("Pass : " + pass);
		});
		
		btnJoin.setOnAction(e->{
			try {
				Parent next = FXMLLoader.load(
					getClass().getResource("Join.fxml")
				);
				Stage stage = new Stage();
				stage.initModality(Modality.WINDOW_MODAL);
				Window w = btnJoin.getScene().getWindow();
				stage.initOwner(w);
				stage.setScene(new Scene(next));
				stage.show();
			} catch (IOException e1) {}
		});
	}

}
