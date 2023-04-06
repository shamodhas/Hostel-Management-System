package lk.ijse.hms.controller;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/5/2023
 * Time :7:35 PM
 */

public class DashboardFormController {

    @FXML
    private Label lblTotalStudent;

    @FXML
    private Label lblTotalReservation;

    @FXML
    private Label lblTotalNonPaidReservation;

    @FXML
    private Label lblTotalIncomeToDay;

    @FXML
    private Label lblTotalReservationToDay;

    @FXML
    private BarChart<?, ?> barChart;

    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    @FXML
    private ScrollPane scPane;

}

