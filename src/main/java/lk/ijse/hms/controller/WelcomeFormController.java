package lk.ijse.hms.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import lk.ijse.hms.util.Navigation;
import lk.ijse.hms.util.Route;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/4/2023
 * Time :11:13 PM
 */

public class WelcomeFormController {

    @FXML
    void btnMenuOnAction(ActionEvent event) {
        Navigation.navigate(Route.MENU);
    }
}
