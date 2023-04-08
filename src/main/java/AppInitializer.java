import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lk.ijse.hms.util.Navigation;

import java.net.URL;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/4/2023
 * Time :10:20 PM
 * Project name : IntelliJ IDEA
 */

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Navigation.setStage(stage);
        URL resource = this.getClass().getResource("/view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("Login");
        Scene scene = new Scene(load);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
}
