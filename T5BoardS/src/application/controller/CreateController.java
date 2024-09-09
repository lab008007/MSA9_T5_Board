package application.controller;

import application.Main;
import application.DAO.BoardDAO;
import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CreateController {

    @FXML
    private Button btnCreate;

    @FXML
    private Button btnMain;

    @FXML
    private TextField taContent;

    @FXML
    private TextField tfTitle;

    @FXML
    private TextField tfWriter;
    
    @FXML
    private BoardService boardService = new BoardServiceImpl();
    
    @FXML
    private BoardDAO boardDAO = new BoardDAO();

    @FXML
    void toCreate(ActionEvent event) throws Exception {
    	Board board = new Board(tfTitle.getText(), tfWriter.getText(), taContent.getText());
    	int result = boardDAO.insert(board);
    	if( result > 0 ) {
    		System.out.println("insert data OK!");
    		Main.setRoot("UI/List");
    	}

    }

    @FXML
    void toList(ActionEvent event) throws Exception {
    	Main.setRoot("UI/List");
    }

}
