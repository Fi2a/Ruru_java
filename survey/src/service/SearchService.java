package service;

import java.util.ArrayList;

import dao.AnswerDAO;
import vo.Answer;

public class SearchService {

	private AnswerDAO dao;
	
	public SearchService() {
		this.dao = new AnswerDAO();
	}
	
	public void searchSum() {
		ArrayList<Answer> ans = dao.answer();
		for( Answer list : ans ) {
			System.out.println("1번 답변 합계 : " );
		}
	}
	
	
	
	
	
}
