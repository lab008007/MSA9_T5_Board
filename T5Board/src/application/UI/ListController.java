package application.UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ListController {

    @FXML
    private TableView<?> boardTableView;

    @FXML
    private Button btnMain;

    @FXML
    private TableColumn<?, ?> colNo;

    @FXML
    private TableColumn<?, ?> colRegDate;

    @FXML
    private TableColumn<?, ?> colTitle;

    @FXML
    private TableColumn<?, ?> colView;

    @FXML
    private TableColumn<?, ?> colWriter;

    @FXML
    void toInsert(ActionEvent event) {

    }

    @FXML
    void toMain(ActionEvent event) {

    }

}
