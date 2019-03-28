import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AppDriver extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Image img = new Image("pic.jpg");
		ImageView iv = new ImageView(img);
		Group grp=new Group(iv);
		
		Scene sn = new Scene(grp,600,300);
		sn.getStylesheets().add("mystyle.css");
		primaryStage.setScene(sn);
		primaryStage.show();
		
		BoxBlur bb = new BoxBlur();
		iv.setEffect(bb);
		
		DropShadow ds = new DropShadow();
		ds.setOffsetX(20);
		ds.setOffsetY(20);
		
		iv.setEffect(ds);
		
		
		
		RotateTransition rt = new RotateTransition(new Duration(2000),iv);
		rt.setFromAngle(0);
		rt.setToAngle(1080);
		
		
		TranslateTransition tt = new TranslateTransition(new Duration(2000),iv);
		tt.setFromX(10);tt.setFromY(10);tt.setToX(200);tt.setToY(200);
		
		
		rt.play();
		tt.play();
		
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
		
	}

}
