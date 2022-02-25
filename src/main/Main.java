package main;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import control.MainWindow;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) throws IOException {
		launch(args);
		

	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		// Cargador del FXML
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/MainWindow.fxml"));

		// Contenido ventana
		loader.setController(new MainWindow());

		Parent parent = (Parent) loader.load();

		Stage stage = new Stage();

		Scene scene = new Scene(parent);

		stage.setScene(scene);

		stage.show();

	}

	
	public void compareDates() {
		Date now = new Date();
		System.out.println(now);

		long uts = now.getTime();
		System.out.println(uts);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String nowSTR = sdf.format(now);
		System.out.println(nowSTR);

		String initDate = "2022-01-27";
		String finalDate = "2022-06-03";

		try {

			Date fecha1 = sdf.parse(initDate);
			Date fecha2 = sdf.parse(finalDate);

			if (fecha1.getTime() < now.getTime() && fecha2.getTime() > now.getTime()) {
				System.out.println("esta dentro del rango de fechas");
			} else {
				System.out.println("no esta dentro del rango de fechas");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
