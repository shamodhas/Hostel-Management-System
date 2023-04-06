package lk.ijse.hms.controller;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import lk.ijse.hms.bo.BoFactory;
import lk.ijse.hms.bo.BoTypes;
import lk.ijse.hms.bo.custom.LoginBO;
import lk.ijse.hms.controller.student.AddStudentFormController;
import lk.ijse.hms.controller.student.UpdateStudentFormController;
import lk.ijse.hms.controller.user.AddUserFormController;
import lk.ijse.hms.controller.user.UpdateUserFormController;
import lk.ijse.hms.view.tm.StudentTM;
import lk.ijse.hms.view.tm.UserTM;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/5/2023
 * Time :11:38 AM
 */

public class ManageUserFormController {

    @FXML
    private TableView<UserTM> tblUser;

    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXButton btnUpdateDelete;

    @FXML
    private TextField txtSearchUser;

    private final LoginBO loginBO = BoFactory.getInstance().getBO(BoTypes.LOGIN);

    public void initialize(){
        btnUpdateDelete.setDisable(true);
        setCellFactory();
        loadTable();
    }

    private void loadTable() {
        tblUser.setItems(FXCollections.observableArrayList(loginBO.getAllUser().stream().map(userDTO -> new UserTM(
                        userDTO.getUserId(),
                        userDTO.getName(),
                        userDTO.getTelNo(),
                        userDTO.getEmail(),
                        userDTO.getUserName(),
                        userDTO.getPassword()))
                .collect(Collectors.toList()))
        );
        txtSearchUser.textProperty().addListener((observableValue, pre, curr) ->{
            if (!Objects.equals(pre, curr)){
                tblUser.getItems().clear();
                tblUser.setItems(FXCollections.observableArrayList(loginBO.searchUserByText(curr).stream().map(userDTO -> new UserTM(
                                userDTO.getUserId(),
                                userDTO.getName(),
                                userDTO.getTelNo(),
                                userDTO.getEmail(),
                                userDTO.getUserName(),
                                userDTO.getPassword()))
                        .collect(Collectors.toList()))
                );
            }

        } );

        tblUser.getSelectionModel().selectedItemProperty().addListener((observableValue, pre, curr) -> {
            if (curr!=pre || curr!=null){
                btnUpdateDelete.setDisable(false);
            }

        });
    }

    private void setCellFactory() {
        tblUser.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("userId"));
        tblUser.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblUser.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("telNo"));
        tblUser.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("email"));
        tblUser.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("userName"));
        tblUser.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("password"));
    }

    @FXML
    void btnAddOnAction(ActionEvent event) {
        try {
            URL resource = this.getClass().getResource("/view/user/AddUserForm.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader(resource);
            Parent load = fxmlLoader.load();
            AddUserFormController addUserFormController = fxmlLoader.getController();
            addUserFormController.init(tblUser, this);

            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("New User Registration Form");
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"forms error ..!").show();
        }
    }

    @FXML
    void btnUpdateDeleteOnAction(ActionEvent event) {
        try {
            URL resource = this.getClass().getResource("/view/user/UpdateUserForm.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader(resource);
            Parent load = fxmlLoader.load();
            UpdateUserFormController controller = fxmlLoader.getController();
            controller.init(tblUser.getSelectionModel().getSelectedItem(),this);
            Stage stage = new Stage();
            stage.setTitle("Update/Delete user details");
            stage.setScene(new Scene(load));
            stage.centerOnScreen();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"forms error ..!").show();
        }
    }

}
