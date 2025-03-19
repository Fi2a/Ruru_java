package service;

import java.util.ArrayList;
import java.util.Scanner;

import dao.SurveyDAO;
import vo.Survey;

public class QuestionService {
	
	private SurveyDAO dao ;	
	
	public QuestionService() {
		dao = new SurveyDAO();		
	}
	
	
	
	
	public void question() {
		ArrayList<Survey> list = dao.question();
		Scanner sc = new Scanner(System.in);
		for( Survey ques : list) {
			System.out.println(ques.getId() + "번 질문 : " + ques.getQuestion());
			System.out.print("번호 입력 : ");
			ans();
			
		
//			int num = sc.nextInt();
			
		}	
		
		Survey test = new Survey(1, "질문");
		
		
		
		System.out.println("\n 설문 끝!");
	}
	
	private int ans() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num>5 || num<1) { // 선택지가 1~5번 까지 있다는 가정하에
			System.out.println("숫자 범위 틀림 \n");
			System.out.print("번호 입력 : ");
			num = sc.nextInt();			
		}
		
		return num;
	}
		
		
		
	
	

}
