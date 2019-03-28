import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LogicClass {

    @FXML
    private TextField displayField;

    @FXML
    private Label mlabel;

    @FXML
    private Button mClear;

    @FXML
    private Button mSubmit;

    @FXML
    void clearTextField(ActionEvent event) {
    	
    	displayField.clear();
    	mlabel.setText("");

    }

    @FXML
    void submit(ActionEvent event) {
    	
    	String tmpStr=displayField.getText();
    	mlabel.setText(tmpStr);
    	
    	int x=Integer.parseInt( tmpStr.trim() );
    	int y=x*10;
    	mlabel.setText(String.valueOf(y));
    	
    }

}
