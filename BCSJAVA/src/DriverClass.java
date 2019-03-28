import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DriverClass extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Parent g=FXMLLoader.load(getClass().getResource("GUI_Model.fxml"));
		Scene sn=new Scene(g);
		primaryStage.setScene(sn);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
	
		launch(args);
		
		
		
	}

}
