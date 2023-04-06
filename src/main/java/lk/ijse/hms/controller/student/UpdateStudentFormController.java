package lk.ijse.hms.controller.student;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import lk.ijse.hms.controller.ManageStudentFormController;
import lk.ijse.hms.controller.ManageUserFormController;
import lk.ijse.hms.view.tm.StudentTM;
import lk.ijse.hms.view.tm.UserTM;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/5/2023
 * Time :1:29 AM
 */

public class UpdateStudentFormController {
    @FXML
    private Label lblStudentId;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtContact;

    @FXML
    private DatePicker dpDOB;

    @FXML
    private JFXComboBox<?> cmbGender;

    @FXML
    private JFXButton btnDelete;

    @FXML
    void OnActionReleasedOnAction(KeyEvent event) {

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void cmbGenderOnAction(ActionEvent event) {

    }

    @FXML
    void dpDOBOnAction(ActionEvent event) {

    }

    @FXML
    void txtAddressOnAction(ActionEvent event) {

    }

    @FXML
    void txtAddressReleasedOnAction(KeyEvent event) {

    }

    @FXML
    void txtContactOnAction(ActionEvent event) {

    }

    @FXML
    void txtNameOnAction(ActionEvent event) {

    }

    @FXML
    void txtNameReleasedOnAction(KeyEvent event) {

    }

    public void init(StudentTM selectedItem, ManageStudentFormController manageStudentFormController) {

    }
}
