package lk.ijse.hms.controller.room;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyEvent;
import lk.ijse.hms.controller.ManageRoomFormController;
import lk.ijse.hms.view.tm.RoomTM;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/5/2023
 * Time :9:46 AM
 */

public class AddRoomFormController {

    @FXML
    private JFXTextField txtRoomTypeId;

    @FXML
    private JFXComboBox<?> cmbType;

    @FXML
    private JFXTextField txtKeyMoney;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private JFXButton btnAdd;

    @FXML
    void btnAddOnAction(ActionEvent event) {

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

    public void init(TableView<RoomTM> tblRoom, ManageRoomFormController manageRoomFormController) {

    }
}
