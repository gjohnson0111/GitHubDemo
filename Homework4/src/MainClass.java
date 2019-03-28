import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	
	public void start(Stage primaryStage) throws Exception{
		Parent p = FXMLLoader.load(getClass().getClassLoader().getResource("Calc_Model.fxml"));
		Scene sn = new Scene(p);
		primaryStage.setScene(sn);
		primaryStage.show();
		
	}
	
public static void main(String[] args) {
		
		launch(args);
	
		
	}
	

}
