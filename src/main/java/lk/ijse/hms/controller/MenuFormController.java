package lk.ijse.hms.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import lk.ijse.hms.util.Navigation;
import lk.ijse.hms.util.Route;


/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/4/2023
 * Time :11:20 PM
 */

public class MenuFormController {

    @FXML
    public void manageStudentOnAction(ActionEvent actionEvent) {
        Navigation.navigate(Route.STUDENT);

    }

    @FXML
    public void manageRoomOnAction(ActionEvent actionEvent) {
        Navigation.navigate(Route.ROOM);
    }

    @FXML
    public void reservationOnAction(ActionEvent actionEvent) {
        Navigation.navigate(Route.RESERVATION);
    }
}
