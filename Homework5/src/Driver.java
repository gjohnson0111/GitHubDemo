import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Driver extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		
	
		Parent g = FXMLLoader.load(getClass().getResource("GUI_HW5.fxml")); 
		Scene sn = new Scene(g);
		primaryStage.setScene(sn);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
