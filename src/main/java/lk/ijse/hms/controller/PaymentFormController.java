package lk.ijse.hms.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/5/2023
 * Time :7:32 PM
 */

public class PaymentFormController {

    @FXML
    private TableView<?> tblReservation;

    @FXML
    private JFXTextField txtReservationId;

    @FXML
    private JFXTextField txtStudentId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtRoomTypeId;

    @FXML
    private JFXTextField txtType;

    @FXML
    private JFXTextField txtDate;

    @FXML
    private JFXButton btnPay;

    @FXML
    void btnPayOnAction(ActionEvent event) {

    }

    @FXML
    void tblClick(MouseEvent event) {

    }

}
