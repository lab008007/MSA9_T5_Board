package application.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *  (DTO)
 *  게시글 정보		
 *  				Java			DB
 *  - 게시글 번호		no				no	
 *  - 제목			title			title
 *  - 작성자			writer			writer
 *  - 내용			content			content
 *  - 등록일자			regDate			red_date
 *  - 수정일자			updDate			upd_date
 */
@Data
@AllArgsConstructor
public class Board {

	private int no;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private Date updDate;
	private int view;
	
	public Board() {
		this("(제목없음)", "(작성자없음)", "");
	}
	
	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
}




//package application.DTO;
//
//import java.util.Date;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
///**
// *  (DTO)
// *  게시글 정보		
// *  				Java			DB
// *  - 게시글 번호		no				no	
// *  - 제목			title			title
// *  - 작성자			writer			writer
// *  - 내용			content			content
// *  - 등록일자			regDate			red_date
// *  - 수정일자			updDate			upd_date
// */
//@Data
//@AllArgsConstructor
//public class Board {
//
//	private int no;
//	private String title;
//	private String writer;
//	private String content;
//	private Date regDate;
//	private Date updDate;
//	
//	public Board() {
//		this("(제목없음)", "(작성자없음)", "");
//	}
//	
//	public Board(String title, String writer, String content) {
//		this.title = title;
//		this.writer = writer;
//		this.content = content;
//	}
//	
//}




//import java.util.Date;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
///**
// * (DTO)
// * 게시글 정보
// *              Java       DB
// * - 게시글 번호   no         no
// * - 제목        title      title
// * - 작성자       writer     writer
// * - 내용        content    content
// * - 등록일자     regDate    reg_date
// * - 수정일자     updDate    upd_date
// * 
// */
//
//@Data
//@AllArgsConstructor
//public class Board {
//
//	private int no;
//	private String title;
//	private String writer;
//	private String content;
//	private Date regDate;
//	private Date updDate;
//	
//	public Board() {
//		this("(제목없음)", "(작성자없음)", "");
//	}
//	public Board(String title, String writer, String content) {
//		this.title = title;
//		this.writer = writer;
//		this.content = content;
//	}
//	//	public Board(int no, String title, String writer, String content, Date regDate, Date updDate) {
//	//		this.no = no;
//	//		this.title = title;
//	//		this.writer = writer;
//	//		this.content = content;
//	//		this.regDate = regDate;
//	//		this.updDate = updDate;
//	//	}
//	//	public int getNo() {
//	//		return no;
//	//	}
//	//	public void setNo(int no) {
//	//		this.no = no;
//	//	}
//	//	public String getTitle() {
//	//		return title;
//	//	}
//	//	public void setTitle(String title) {
//	//		this.title = title;
//	//	}
//	//	public String getWriter() {
//	//		return writer;
//	//	}
//	//	public void setWriter(String writer) {
//	//		this.writer = writer;
//	//	}
//	//	public String getContent() {
//	//		return content;
//	//	}
//	//	public void setContent(String content) {
//	//		this.content = content;
//	//	}
//	//	public Date getRegDate() {
//	//		return regDate;
//	//	}
//	//	public void setRegDate(Date regDate) {
//	//		this.regDate = regDate;
//	//	}
//	//	public Date getUpdDate() {
//	//		return updDate;
//	//	}
//	//	public void setUpdDate(Date updDate) {
//	//		this.updDate = updDate;
//	//	}
//	//	@Override
//	//	public String toString() {
//	//		return "Board [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
//	//				+ regDate + ", updDate=" + updDate + "]";
//	//	}
//	
//}
