package control;

import java.io.IOException;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;
import model.AccountData;
import model.AccountItem;

public class VentanaDinero {

	@FXML
	private Button addBTN;

	@FXML
	private TextField ammountTF;

	@FXML
	private DatePicker tDate;

	@FXML
	private TextField descriptionTF;
	
	@FXML
	private TextField typeTF;

	@FXML
	void addItem(ActionEvent event) {
		double amount = Double.parseDouble(ammountTF.getText());
		//Date todaysDate = tDate.;
		String itemType = typeTF.getText();
		String itemDescription = descriptionTF.getText();
		AccountItem item = new AccountItem(amount,itemType,itemDescription);
		AccountData.account.add(item);
		
		Stage stage = (Stage) ammountTF.getScene().getWindow();
		stage.close();
		
	}
}
