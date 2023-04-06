package lk.ijse.hms.controller.room;

import javafx.event.ActionEvent;
import javafx.scene.input.KeyEvent;
import lk.ijse.hms.controller.ManageRoomFormController;
import lk.ijse.hms.view.tm.RoomTM;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/5/2023
 * Time :9:45 AM
 */

public class UpdateRoomFormController {
    @FXML
    private Label lblRoomTypeId;

    @FXML
    private JFXComboBox<?> cmbType;

    @FXML
    private JFXTextField txtKeyMoney;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private JFXButton btnDelete;

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void cmbTypeOnAction(ActionEvent event) {

    }

    @FXML
    void txtKeyMoneyKeyReleased(KeyEvent event) {

    }

    @FXML
    void txtKeyMoneyOnAction(ActionEvent event) {

    }

    @FXML
    void txtQtyKeyReleased(KeyEvent event) {

    }

    @FXML
    void txtQtyOnAction(ActionEvent event) {

    }

    public void init(RoomTM roomTM, ManageRoomFormController manageRoomFormController) {

    }
}
