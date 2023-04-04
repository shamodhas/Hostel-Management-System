package lk.ijse.hms.controller.student;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import lk.ijse.hms.view.tm.StudentTM;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/5/2023
 * Time :1:00 AM
 */

public class AddStudentFormController {

    @FXML
    private Button btnRegister;

    @FXML
    private ComboBox<String> cmbGender;

    @FXML
    private DatePicker dpDOB;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    void btnRegisterOnAction(ActionEvent event) {

    }

    public void init(TableView<StudentTM> tblStudent) {

    }
}
