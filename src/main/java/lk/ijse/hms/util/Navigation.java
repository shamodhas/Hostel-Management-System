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

    public static void navigate(Route route) {
    }
}
