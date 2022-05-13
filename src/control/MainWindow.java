package control;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import main.Main;
import model.AccountData;
import model.AccountItem;

public class MainWindow implements Initializable {

	@FXML
	private TableColumn<AccountItem, Double> amountCOL;

	@FXML
	private TableColumn<AccountItem, Date> dateCOL;

	@FXML
	private TableView<AccountItem> financesTable;

	@FXML
	private TableColumn<AccountItem, String> typeCOL;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		amountCOL.setCellValueFactory(new PropertyValueFactory<>("monto"));
		typeCOL.setCellValueFactory(new PropertyValueFactory<>("tipoMovimiento"));
		dateCOL.setCellValueFactory(new PropertyValueFactory<>("fechaMovimiento"));
		
		financesTable.setItems(AccountData.account);
		financesTable.setOnMouseClicked(event -> {
			AccountItem stClick = financesTable.getSelectionModel().getSelectedItem();
			System.out.println(stClick.getMonto());
		});
	}

	@FXML
	void addAccountItem(ActionEvent event) throws IOException {
			// Cargador del FXML
				FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/VentanaDinero.fxml"));

				// Contenido ventana
				loader.setController(new VentanaDinero());

				Parent parent;

				parent = (Parent) loader.load();

				Stage stage = new Stage();

				Scene scene = new Scene(parent);

				stage.setScene(scene);

				stage.show();
	}

	@FXML
	void closeMenu(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}

	@FXML
	void showAccountBalance(ActionEvent event) {

	}

}
