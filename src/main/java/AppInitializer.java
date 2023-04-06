import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
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
        URL resource = this.getClass().getResource("/view/ManageReservationForm.fxml");
        Parent load = FXMLLoader.load(resource);
        stage.setScene(new Scene(load));
        stage.centerOnScreen();
        stage.show();
    }
}
