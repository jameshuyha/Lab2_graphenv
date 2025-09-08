// Git Repository: https://github.com/jameshuyha/Lab2_graphenv.git

package Lab2_HuyJamesVienHa;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.image.*;
import java.util.Random;
import javafx.geometry.Pos;

/**
 *
 * @author 6324151
 */
public class Lab02_HuyJamesVienHa extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 250, 300);
        primaryStage.setTitle("Java Games");
        
        Label topLabel = new Label("Random Game");
        Label bottomLabel = new Label("Waiting...");
        Label lblImage = new Label();
        root.setTop(topLabel);
        root.setBottom(bottomLabel);
        VBox middle = new VBox(lblImage);
        root.setCenter(middle);
        root.setAlignment(topLabel, Pos.TOP_CENTER);
        root.setAlignment(bottomLabel, Pos.BOTTOM_CENTER);
        middle.setAlignment(Pos.CENTER);
        
        int random = new Random().nextInt(101, 120);
        Image image = new Image("file:" + System.getProperty("user.dir") + "//images//" + random + ".jpg");
        lblImage.setGraphic(new ImageView(image));
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
