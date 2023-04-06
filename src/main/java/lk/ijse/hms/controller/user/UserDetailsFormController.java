package lk.ijse.hms.controller.user;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;
import lk.ijse.hms.dto.UserDTO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :4:59 PM
 */

public class UserDetailsFormController {
    @FXML
    private Label lblUserId;

    @FXML
    private Label lblName;

    @FXML
    private Label lblContact;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblUserName;

    @FXML
    private Label lblPassword;

    private UserDTO userDTO;
    public void init(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public void initialize(){
        try {
            lblUserId.setText(userDTO.getUserId());
            lblName.setText(userDTO.getName());
            lblContact.setText(userDTO.getTelNo());
            lblEmail.setText(userDTO.getEmail());
            lblUserName.setText(userDTO.getUserName());
            lblPassword.setText(userDTO.getPassword());
        }catch (NullPointerException E){}
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/view/user/UpdateUserForm.fxml"));
            Parent load = fxmlLoader.load();
            UpdateUserFormController updateUserFormController = fxmlLoader.getController();
            updateUserFormController.init(userDTO);
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"forms error ..!").show();
        }
    }
}
