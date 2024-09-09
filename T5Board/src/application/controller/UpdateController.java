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

public class UpdateController {

    @FXML
    private Button btnList;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextField taContent;

    @FXML
    private TextField tfTitle;

    @FXML
    private TextField tfWriter;
    
    
    private BoardService boardService = new BoardServiceImpl();
    
    int boardNo;
    
    @FXML
    private BoardDAO boardDAO = new BoardDAO();
    
    

    @FXML
    void toList(ActionEvent event) throws Exception {
    	Main.setRoot("UI/List");
    }

    @FXML
    void update(ActionEvent event) throws Exception {
    	Board board = new Board(tfTitle.getText(), tfWriter.getText(), taContent.getText());
    	int result = boardDAO.update(board);
    	if( result > 0 ) {
    		System.out.println("update data OK!");
    		Main.setRoot("UI/List");
    	}
    }

	public void passData(int boardNo) {
		this.boardNo = boardNo;
		Board board = boardService.select(boardNo);
		tfTitle.setText(board.getTitle());
		tfWriter.setText(board.getWriter());
		taContent.setText(board.getContent());
		
	}
    

}
