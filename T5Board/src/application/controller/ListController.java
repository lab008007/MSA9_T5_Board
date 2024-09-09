package application.controller;

import java.util.ArrayList;
import java.util.List;

import application.Main;
import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class ListController {

    @FXML
    private TableView<Board> boardTableView;

    @FXML
    private TableColumn<Board, Integer> colNo;

    @FXML
    private TableColumn<Board, String> colTitle;
    
    @FXML
    private TableColumn<Board, String> colWriter;
    
    @FXML
    private TableColumn<Board, String> colDate;

    @FXML
    private TableColumn<Board, Integer> colView;

    List<Board> boardList = null;
    
    // 게시글 목록 서비스
    private BoardService boardService = new BoardServiceImpl();
    
    @FXML
    public void initialize() {
    	
    	// 데이터 목록 조회
    	boardList = boardService.list();
    	
    	// * TableColumn 에 Board 객체의 속성 매핑하기
    	colNo.setCellValueFactory( new PropertyValueFactory<>("No") );
    	colTitle.setCellValueFactory( new PropertyValueFactory<>("Title") );
    	colWriter.setCellValueFactory( new PropertyValueFactory<>("Writer") );
    	colDate.setCellValueFactory( new PropertyValueFactory<>("RegDate") );
    	colView.setCellValueFactory( new PropertyValueFactory<>("View") );
    	// (코드 설명)
    	// * new PropertyValueFactory("게터이름")		: 값으로 들어갈 객체의 게터 이름을 지정
    	// ex) new PropertyValueFactory("Title") --> getTitle() 게터 메소드의 get을 제외한 "Title"과 일치
    	// * setCellValueFactory()					: 셀의 값을 지정하는 메소드
    	// ** module-info.java 에 java.base 모듈 추가해야 사용 가능
    	
    	// 테이블뷰에 데이터 추가하기
    	ObservableList<Board> list = FXCollections.observableArrayList(boardList);
    	boardTableView.setItems(list);
    	
    	boardTableView.setOnMouseClicked( new EventHandler<MouseEvent>() {
    		
    		@Override
    		public void handle(MouseEvent event) {
    			
    			if( event.getClickCount() == 2 && boardTableView.getSelectionModel().getSelectedItem() != null ) {
    				
    				int boardNo = boardTableView.getSelectionModel().getSelectedItem().getNo();
    				
    				try {
    					String fxml = "UI/Read";
    					FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
    					Parent root = fxmlLoader.load();
    					ReadController readController = (ReadController) fxmlLoader.getController();
    					readController.passData(boardNo);
    					Main.setRoot(root);
    				} catch ( Exception e ) {
    					System.err.println("List -> Read Error...");
    				}
    				
    			}
    		}
    		
    		
    	});
    	
    	
    	
    	    	
    	
    }

    @FXML
    void toInsert(ActionEvent event) throws Exception{
    	Main.setRoot("UI/Create");
    }
    
    @FXML
    void toMain(ActionEvent event) throws Exception {
    	Main.setRoot("UI/Main");
    }

}