package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button btnTeste;
	
	@FXML
	public void onBtnTesteAction()
	{
		Alerts.showAlert("Alert Title", "Alert Header", "Hello Word !!", AlertType.INFORMATION);
	}
}
