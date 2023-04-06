package lk.ijse.hms.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.util.Callback;
import lk.ijse.hms.bo.BoFactory;
import lk.ijse.hms.bo.BoTypes;
import lk.ijse.hms.bo.custom.RoomBO;
import lk.ijse.hms.bo.custom.StudentBO;
import lk.ijse.hms.view.tm.CartTM;

import java.util.stream.Collectors;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/4/2023
 * Time :11:57 PM
 */

public class ManageReservationFormController {

    @FXML
    public TableColumn<CartTM, String> colAction;

    @FXML
    public TableColumn<CartTM, String> colType;

    @FXML
    public TableColumn<CartTM, String> colRoomTypeId;

    @FXML
    public TableColumn<CartTM, Double> colKeyMoney;

    @FXML
    public TableColumn<CartTM, String> colStatus;
    @FXML
    private TableView<CartTM> tblCart;

    @FXML
    private JFXButton btnRegister;

    @FXML
    private Label lblReservation;

    @FXML
    private JFXComboBox<String> cmbStudentId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtContactNo;

    @FXML
    private JFXComboBox<String> cmbRoomTypeId;

    @FXML
    private JFXTextField txtType;

    @FXML
    private JFXTextField txtKeyMoney;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private JFXComboBox<String> cmbPaymentStatus;

    @FXML
    private JFXButton btnAddToCart;

    private final RoomBO roomBO = BoFactory.getInstance().getBO(BoTypes.ROOM);
    private final StudentBO studentBO = BoFactory.getInstance().getBO(BoTypes.STUDENT);

    public void initialize(){
        setCellFactory();
        loadReservationId();
        loadCombo();
    }

    private void loadReservationId() {
        lblReservation.setText(roomBO.getNextReservationId());
    }

    private void loadCombo() {
        cmbStudentId.getItems().addAll(studentBO.getAllStudent().stream().map(studentDTO -> studentDTO.getStudentId()).collect(Collectors.toList()));
        cmbRoomTypeId.getItems().addAll(roomBO.getAllRoom().stream().map(roomDTO -> roomDTO.getRoomTypeId()).collect(Collectors.toList()));
        cmbPaymentStatus.getItems().addAll("PAID", "UNPAID");
    }

    private void setCellFactory() {
        colRoomTypeId.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("roomTypeId"));
        colType.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("type"));
        colKeyMoney.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("keyMoney"));
        colStatus.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("status"));
        Callback<TableColumn<CartTM, String>, TableCell<CartTM, String>> cellFactory = (TableColumn<CartTM, String> param) -> {
            // make cell containing buttons
            final TableCell<CartTM, String> cell = new TableCell<CartTM, String>() {
                @Override
                public void updateItem(String uItem, boolean empty) {
                    super.updateItem(uItem, empty);
                    //that cell created only on non-empty rows
                    if (empty) {
                        setGraphic(null);
                        setText(null);
                    } else {
                        FontAwesomeIconView deleteIcon = new FontAwesomeIconView(FontAwesomeIcon.TRASH);
                        deleteIcon.setStyle(" -fx-cursor: hand ;" + "-glyph-size:28px;" + "-fx-fill:#ff1744;");
                        deleteIcon.setOnMouseClicked((MouseEvent event) -> {
                            CartTM cartTM = tblCart.getSelectionModel().getSelectedItem();

                        });
                        HBox hBox = new HBox(deleteIcon);
                        hBox.setStyle("-fx-alignment:center");
                        HBox.setMargin(deleteIcon, new Insets(2, 2, 0, 3));
                        setGraphic(hBox);
                        setText(null);
                    }
                }
            };
            return cell;
        };
        colAction.setCellFactory(cellFactory);
    }

    @FXML
    void btnAddToCartOnAction(ActionEvent event) {
        tblCart.setItems(FXCollections.observableArrayList(new CartTM()));
        tblCart.setItems(FXCollections.observableArrayList(new CartTM()));
        tblCart.setItems(FXCollections.observableArrayList(new CartTM()));
        tblCart.setItems(FXCollections.observableArrayList(new CartTM()));
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
