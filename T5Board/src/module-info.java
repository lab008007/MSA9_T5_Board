module T5Board {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires lombok;
	requires java.sql;
	requires javafx.graphics;
	
	
	opens application to javafx.base, javafx.graphics, javafx.fxml, lombok, java.sql;
	opens application.controller to javafx.fxml;
	opens application.DTO to javafx.base;
}
