package lk.ijse.hms.controller;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.hms.util.Navigation;
import lk.ijse.hms.util.Route;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/4/2023
 * Time :10:23 PM
 */

public class MainFormController {

    @FXML
    private AnchorPane pneContainer;

    public void initialize(){
        Navigation.init(pneContainer);
        loadWelcomeForm();
    }

    @FXML
    public void imgLogoOnMouseClicked(MouseEvent mouseEvent) {
        loadWelcomeForm();
    }

    private void loadWelcomeForm() {
        Navigation.navigate(Route.WELCOME);
    }
}

