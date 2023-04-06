package lk.ijse.hms.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import lk.ijse.hms.controller.student.AddStudentFormController;
import lk.ijse.hms.controller.user.AddUserFormController;
import lk.ijse.hms.dto.UserDTO;

import java.io.IOException;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/5/2023
 * Time :7:37 PM
 */

public class LoginFormController {
    @FXML
    private FontAwesomeIconView fxUserIcon;

    @FXML
    private JFXTextField txtUserName;

    @FXML
    private FontAwesomeIconView fxLockIcon;

    @FXML
    private JFXPasswordField pfPassword;

    @FXML
    private JFXTextField txtPassword;

    @FXML
    private FontAwesomeIconView fxEyeIcon;

    private boolean isHide = true;

    public void initialize(){
        txtPassword.setVisible(false);
    }

    @FXML
    void btnCreateAccountOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/view/user/AddUserForm.fxml"));
            Parent load = fxmlLoader.load();
            AddUserFormController addUserFormController = fxmlLoader.getController();
            addUserFormController.init(null,this);
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Create User Account");
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnLoginOnAction(ActionEvent event) {

    }

    @FXML
    void close(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    void eyeIconOnMouseClick(MouseEvent event) {
        if (isHide){
            isHide = false;
            fxEyeIcon.setIcon(FontAwesomeIcon.EYE);
            txtPassword.setText(pfPassword.getText());
            pfPassword.setVisible(false);
            txtPassword.setVisible(true);
        }else {
            isHide = true;
            fxEyeIcon.setIcon(FontAwesomeIcon.EYE_SLASH);
            pfPassword.setText(txtPassword.getText());
            txtPassword.setVisible(false);
            pfPassword.setVisible(true);
        }
    }

    @FXML
    public void passwordRelease(KeyEvent keyEvent) {
        (isHide?pfPassword:txtPassword).setFocusColor(Color.valueOf("#00b000"));
        fxLockIcon.setFill(Color.valueOf("#00b000"));
    }

    @FXML
    public void userNameRelease(KeyEvent keyEvent) {
        txtUserName.setFocusColor(Color.valueOf("#00b000"));
        fxUserIcon.setFill(Color.valueOf("#00b000"));
    }

    public void init(UserDTO userDTO) {
        txtUserName.setText(userDTO.getUserName());
        (isHide?pfPassword:txtPassword).setText(userDTO.getPassword());
        System.out.println(userDTO.getUserName());
    }
}
