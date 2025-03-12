package main;

import java.util.Scanner;

import service.QuestionService;
import service.SearchService;


public class MainMt {

	private static Scanner sc = new Scanner(System.in);
	private static int menu() {
		
		System.out.println("\n\n============메뉴============");
		System.out.println("1. 설문조사 참여");
		System.out.println("2. 설문조사 결과조회");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		return num;		
	}
	
	private static int menu2() {
		
		System.out.println("\n\n========설문조사 결과조회 메뉴=========");
		System.out.println("1. 답변 합계 ");
		System.out.println("2. 답변 비율 ");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		return num;		
	}
	
	public static void main(String[] args) {
		
		QuestionService question = new QuestionService();
		SearchService search = new SearchService();
		
		while(true) {
			switch( menu() ) {
			case 1: question.question();
					break;
			case 2:
				switch( menu2() ) {
				case 1: search.searchSum();
				case 2:
				case 3: return;			
				}
				
			case 3: return;
			default : System.out.println("숫자 틀림\n");
			
			
			
			}
		}
		
	}

}
