import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class GUI_Controller {

    @FXML
    private TextArea SrceTxt;

    @FXML
    private TextArea AvrgTxt;

    @FXML
    private MenuBar Menu1;

    @FXML
    private MenuItem Open;

    @FXML
    private MenuItem Close;

    @FXML
    private MenuItem about;

    @FXML
    void Help(ActionEvent event)  throws IOException {
    	
    	Parent root = FXMLLoader.load(getClass().getResource("GUI_Help.fxml")); 
    	Stage stage = new Stage();
    	Scene sn = new Scene(root);
		stage.setScene(sn);
		stage.show();

    }

    @FXML
    void MenuClose(ActionEvent event) {
    	
    	Platform.exit();
    	System.exit(0);


    }

    @FXML
    void MenuOpen(ActionEvent event)throws IOException {
    	

    	FileChooser fc = new FileChooser();
    	File openFile  = fc.showOpenDialog(null);
    	
    	
    		
    	Scanner readFile = new Scanner(openFile).useDelimiter(",");
    	ArrayList<String> Grades = new ArrayList<String>();
    	String TestGrade;
    	
    	while (readFile.hasNextLine()) {
    		
    		
    		TestGrade = readFile.next();
    		
    		Grades.add(TestGrade);
    		
    		
    	}
    	
    	SrceTxt.setText(Grades.toString());
    	
    	readFile.close();
    	


    }

}
