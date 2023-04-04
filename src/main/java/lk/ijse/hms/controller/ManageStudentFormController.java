package lk.ijse.hms.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import lk.ijse.hms.controller.student.AddStudentFormController;
import lk.ijse.hms.controller.student.UpdateStudentFormController;
import lk.ijse.hms.util.Navigation;
import lk.ijse.hms.util.Route;
import lk.ijse.hms.view.tm.StudentTM;

import java.io.IOException;
import java.net.URL;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/4/2023
 * Time :11:50 PM
 */

public class ManageStudentFormController {
    @FXML
    private Button btnAddStudent;

    @FXML
    private JFXButton btnBack;

    @FXML
    private Button btnReservation;

    @FXML
    private Button btnUpdateDelete;

    @FXML
    private TableView<StudentTM> tblStudent;

    @FXML
    private TextField txtSearchMember;

    public void initialize(){
        btnUpdateDelete.setDisable(true);
        btnReservation.setDisable(true);
        tblStudent.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("studentId"));
        tblStudent.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblStudent.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("address"));
        tblStudent.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("contactNo"));
        tblStudent.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("dob"));
        tblStudent.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("gender"));
    }

    @FXML
    void btnAddStudentOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/view/student/AddStudentForm.fxml"));
            Parent load = fxmlLoader.load();
            AddStudentFormController AddMemberController = fxmlLoader.getController();
            AddMemberController.init(tblStudent);
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("New Student Registration Form");
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnBackOnAction(ActionEvent event){
        Navigation.navigate(Route.MENU);
    }

    @FXML
    void btnReservationOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateDeleteOnAction(ActionEvent event) {
        try {
            URL resource = this.getClass().getResource("/view/student/UpdateStudentForm.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader(resource);
            Parent load = fxmlLoader.load();
            UpdateStudentFormController controller = fxmlLoader.getController();
            controller.init(tblStudent.getSelectionModel().getSelectedItem(),this);
            Stage stage = new Stage();
            stage.setTitle("Update/Delete MemberDTO details");
            stage.setScene(new Scene(load));
            stage.centerOnScreen();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
