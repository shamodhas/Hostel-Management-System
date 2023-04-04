package lk.ijse.hms.controller.student;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lk.ijse.hms.controller.ManageStudentFormController;
import lk.ijse.hms.view.tm.StudentTM;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/5/2023
 * Time :1:29 AM
 */

public class UpdateStudentFormController {
    @FXML
    private Button btnDelete;

    @FXML
    private Button btnUpdate;

    @FXML
    private ComboBox<?> cmbGender;

    @FXML
    private DatePicker dpDOB;

    @FXML
    private Label lblStudentId;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtName;

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    public void init(StudentTM selectedItem, ManageStudentFormController manageStudentFormController) {

    }
}
