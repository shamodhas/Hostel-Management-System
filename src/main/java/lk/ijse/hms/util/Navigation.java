package lk.ijse.hms.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/5/2023
 * Time :12:16 AM
 * Project name : IntelliJ IDEA
 */

public class Navigation {
    private static AnchorPane pneContainer;

    private static Stage stage;

    public static void setStage(Stage stage) {
        Navigation.stage = stage;
    }

    public static void init(AnchorPane pneContainer){
        Navigation.pneContainer = pneContainer;
    }

    public static void navigate(Route route){
        pneContainer.getChildren().clear();
        String location = null;
        switch (route){
            case MENU:
                location = "MenuForm.fxml";
                stage.setTitle("Menu - HMS");
                break;
            case ROOM:
                location = "ManageRoomForm.fxml";
                stage.setTitle("Manage Rooms");
                break;
            case STUDENT:
                location = "ManageStudentForm.fxml";
                stage.setTitle("Manage Students");
                break;
            case WELCOME:
                location = "WelcomeForm.fxml";
                stage.setTitle("Welcome to HMS v1.0.0");
                break;
            case RESERVATION:
                location = "ManageReservationForm.fxml";
                stage.setTitle("Manage Reservation");
                break;
        }
        try {
            pneContainer.getChildren().add(FXMLLoader.load(Navigation.class.getResource("/view/"+location)));
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"Ui error ...!").show();
        }
    }
}
