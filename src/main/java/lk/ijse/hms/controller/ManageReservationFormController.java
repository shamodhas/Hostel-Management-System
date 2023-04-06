package lk.ijse.hms.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/4/2023
 * Time :11:57 PM
 */

public class ManageReservationFormController {

    @FXML
    private TableView<?> tblCart;

    @FXML
    private JFXButton btnRegister;

    @FXML
    private Label lblReservation;

    @FXML
    private JFXComboBox<?> cmbStudentId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtContactNo;

    @FXML
    private JFXComboBox<?> cmbRoomTypeId;

    @FXML
    private JFXTextField txtType;

    @FXML
    private JFXTextField txtKeyMoney;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private JFXComboBox<?> cmbPaymentStatus;

    @FXML
    private JFXButton btnAddToCart;

    @FXML
    void btnAddToCartOnAction(ActionEvent event) {

    }

    @FXML
    void btnRegisterOnAction(ActionEvent event) {

    }

    @FXML
    void cmbRoomTypeIdOnAction(ActionEvent event) {

    }

    @FXML
    void cmbStudentIdOnAction(ActionEvent event) {

    }

}
