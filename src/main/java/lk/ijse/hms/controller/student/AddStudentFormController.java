package lk.ijse.hms.controller.student;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyEvent;
import lk.ijse.hms.controller.ManageStudentFormController;
import lk.ijse.hms.view.tm.StudentTM;


/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/5/2023
 * Time :1:00 AM
 */

public class AddStudentFormController {
    @FXML
    private JFXButton btnRegister;

    @FXML
    private JFXTextField txtId;

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
    void OnActionReleasedOnAction(KeyEvent event) {

    }

    @FXML
    void btnRegisterOnAction(ActionEvent event) {

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
    void txtIdOnAction(ActionEvent event) {

    }

    @FXML
    void txtIdReleasedOnAction(KeyEvent event) {

    }

    @FXML
    void txtNameOnAction(ActionEvent event) {

    }

    @FXML
    void txtNameReleasedOnAction(KeyEvent event) {

    }
    public void init(TableView<StudentTM> tblStudent, ManageStudentFormController manageStudentFormController) {
        if (tblStudent != null){

        }
    }
}
