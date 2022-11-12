

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Stage;
import java.application.Application;

public class Main extends Application;
public static void main(String[]args){
        Application.launch(args);
        }
    @Override
    public void start(Stage primaryStage) throws Exaption{
        Group group = new Group();
        Scene scene = new Scene(group, 300,400);

        primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
