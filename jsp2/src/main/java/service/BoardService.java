package service;

import java.util.ArrayList;

import DAO.BoardDao;
import DTO.Board;
import jakarta.servlet.http.HttpServletRequest;

public class BoardService {
	
	private BoardDao dao = new BoardDao();	
	
	public void save(HttpServletRequest request) {
		// request 객체에서 파라미터 값 가여와 Board 클래스 객체에 저장
		// Board 클래스 객체를 DAO 에 넘겨주기
		
		Board board = new Board();
		
		board.setTitle( request.getParameter("title") );
		board.setWriter( request.getParameter("writer") );
		board.setContent( request.getParameter("content") );
		
		
		dao.insert(board);
		
	}
	
	public void allSelect(HttpServletRequest request) {
		// 데이터베이스 테이블에서 조회하여 가져오기
		ArrayList<Board> list = dao.select();
		// 조회 결과를 ArrayList 에 저장하고 request 의 Attribute 로 저장하기
		request.setAttribute("boardList", list);
		
		
			
		
		
		
		
	}
	
	
}
