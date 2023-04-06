package lk.ijse.hms.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import com.jfoenix.controls.JFXButton;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lk.ijse.hms.controller.student.AddStudentFormController;
import lk.ijse.hms.controller.user.UserDetailsFormController;
import lk.ijse.hms.dto.UserDTO;

import java.io.IOException;
import java.time.LocalDate;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/4/2023
 * Time :10:23 PM
 */

public class MainFormController {

    @FXML
    private AnchorPane pneContainer;

    @FXML
    private JFXButton btnDashboard;

    @FXML
    private JFXButton btnStudent;

    @FXML
    private JFXButton btnRoom;

    @FXML
    private JFXButton btnReservation;

    @FXML
    private JFXButton btnPayment;

    @FXML
    private JFXButton btnUser;

    @FXML
    private Label lblUserStatus;

    @FXML
    private Label lblDate;

    private static UserDTO userDTO;

    public void init(UserDTO userDTO) {
        MainFormController.userDTO = userDTO;
    }

    public void initialize(){
        if (userDTO != null) {
            lblUserStatus.setText(userDTO.getName());
        }
        lblDate.setText(String.valueOf(LocalDate.now()));
        navigation("/view/DashboardForm.fxml");
    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) {
        navigation("/view/DashboardForm.fxml");
    }

    @FXML
    void btnPaymentOnAction(ActionEvent event) {
        navigation("/view/PaymentForm.fxml");
    }

    @FXML
    void btnReservationOnAction(ActionEvent event) {
        navigation("/view/ManageReservationForm.fxml");
    }

    @FXML
    void btnRoomOnAction(ActionEvent event) {
        navigation("/view/ManageRoomForm.fxml");
    }

    @FXML
    void btnStudentOnAction(ActionEvent event) {
        navigation("/view/ManageStudentForm.fxml");
    }

    @FXML
    void btnUserOnAction(ActionEvent event) {
        navigation("/view/ManageUserForm.fxml");
    }

    @FXML
    void imgMouseClock(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/view/user/UserDetailsForm.fxml"));
            Parent load = fxmlLoader.load();
            UserDetailsFormController userDetailsFormController = fxmlLoader.getController();
            userDetailsFormController.init(userDTO);
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"forms error ..!").show();
        }
    }

    @FXML
    void logOutOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/view/LoginForm.fxml"));
            Parent load = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.centerOnScreen();
            stage.show();
            Stage window = (Stage) pneContainer.getScene().getWindow();
            window.close();
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"forms error ..!").show();
        }
    }

    private void navigation(String location) {
        try {
            pneContainer.getChildren().clear();
            pneContainer.getChildren().add(FXMLLoader.load(getClass().getResource(location)));
        } catch (IOException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR,"forms error ..!").show();
        }
    }
}
