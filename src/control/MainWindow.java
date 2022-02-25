package control;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainWindow {
	
	@FXML
    private TableColumn<?, ?> amountCOL;

    @FXML
    private TableColumn<?, ?> dateCOL;

    @FXML
    private TableView<?> financesTable;

    @FXML
    private TableColumn<?, ?> typeCOL;

}
