package lk.ijse.hms.controller.user;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import lk.ijse.hms.controller.LoginFormController;
import lk.ijse.hms.dto.UserDTO;

import javax.swing.text.TableView;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/5/2023
 * Time :11:39 AM
 */

public class AddUserFormController {
    @FXML
    private JFXButton btnRegister;

    @FXML
    private JFXTextField txtId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtContact;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtUserName;

    @FXML
    private JFXTextField txtPassword;
    private LoginFormController loginFormController;

    @FXML
    void btnRegisterOnAction(ActionEvent event) {
        String userId = txtId.getText();
        String name = txtName.getText();
        String contactNo = txtContact.getText();
        String email = txtEmail.getText();
        String userName = txtUserName.getText();
        String password = txtPassword.getText();

        UserDTO userDTO = new UserDTO(userId, name, contactNo, email, userName, password);

        loginFormController.init(userDTO);

        Stage window = (Stage) btnRegister.getScene().getWindow();
        window.hide();
    }

    @FXML
    void txtContactOnAction(ActionEvent event) {

    }

    @FXML
    void txtContactReleasedOnAction(KeyEvent event) {

    }

    @FXML
    void txtEmailOnAction(ActionEvent event) {

    }

    @FXML
    void txtEmailReleasedOnAction(KeyEvent event) {

    }

    @FXML
    void txtNameOnAction(ActionEvent event) {

    }

    @FXML
    void txtNameReleasedOnAction(KeyEvent event) {

    }

    @FXML
    void txtPasswordOnAction(ActionEvent event) {

    }

    @FXML
    void txtPasswordReleasedOnAction(KeyEvent event) {

    }

    @FXML
    void txtUserNameOnAction(ActionEvent event) {

    }

    public void init(TableView tableView, LoginFormController loginFormController) {
        this.loginFormController = loginFormController;
    }
}
