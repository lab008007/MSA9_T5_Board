package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

	@FXML
	private AnchorPane anchorPane;

    Stage stage;
	
    @FXML
    private Button btnExit;

    @FXML
    private Button btnList;

    @FXML
    void exit(ActionEvent event) {
    	
    	System.out.println("프로그램 종료를 시도합니다...");
		
		//확인 경고창
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("프로그램 종료");
		alert.setHeaderText("프로그램을 종료합니다.");
		alert.setContentText("종료 전에 수정 내용을 저장하시겠습니다?");
		
		//경고창에서 OK 버튼 클릭 시
		if( alert.showAndWait().get() == ButtonType.OK ) {
			stage = (Stage) anchorPane.getScene().getWindow();
			System.out.println("프로그램을 종료합니다...");
			stage.close();
		}
    }

    /**
     * 게시글 목록으로 이동
     * @param event
     * @throws IOException 
     */
    @FXML
    void toList(ActionEvent event) throws IOException {
    	Main.setRoot("UI/List");
    }

}