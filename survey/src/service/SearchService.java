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
		int num = 0;
		for( Answer list : ans ) {
			System.out.println("1번 답변 합계 : " );
			System.out.println("2번 답변 합계 : " );
			System.out.println("3번 답변 합계 : " );
			
			
			if(list.getAns1() == 2) {
				num++;
			}
			
		}
		System.out.println(num);
		int avg = 100 * num / ans.size() ;
		System.out.println(avg);
	}
	
	
	
	
	
}
