package study0214;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class JavaTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문제 1.
		// 학생 5명의 시험 성적을 키보드를 통해 입력받고, 평균 점수를 구하여 출력
		// 반드시 시험성적은 배열에 저장.
//		
//		int[] point = new int[5];
//		int points = 0;
//		// for(int i = 0 ; i < point.length; i++) {
//		for(int i : point) {
//			System.out.print("점수 입력 : ");
//			point[i] = sc.nextInt();
//			points += point[i];
//		}
//
//		int avg = points / point.length;
//		System.out.println("평균 점수 : " + avg);
		
		
		// 문제 2.
		// 알파벳 문자 하나를 입력 ( 대소문자 )
		// 입력한 알파벳으로 시작하는 단어를 모두 찾아 출력
		// 출력한 단어가 총 몇개인지도 출력
		
		String[] word = new String[] {
				"apple", "banana", "cherry", "date", "elderberry", 
	            "fig", "grape", "honeydew", "kiwi", "lemon", 
	            "mango", "nectarine", "orange", "papaya", "quince", 
	            "raspberry", "strawberry", "tangerine", "ugli", "vanilla", 
	            "watermelon", "xigua", "yam", "zucchini", "avocado", 
	            "blueberry", "cantaloupe", "dragonfruit", "apricot", "blackberry", 
	            "coconut", "dragonfruit", "eggplant", "feijoa", "grapefruit", 
	            "huckleberry", "iceplant", "jackfruit", "kiwifruit", "lime", 
	            "mangosteen", "nectar", "orange", "peach", "pineapple", 
	            "pear", "plum", "pomegranate", "pear", "lime", 
	            "apricot", "banana", "papaya", "melon", "peach", 
	            "plum", "raspberry", "blueberry", "citrus", "mango", 
	            "blackcurrant", "cucumber", "fennel", "grape", "strawberry", 
	            "apricot", "blackberry", "currant", "kiwi", "orange", 
	            "lemon", "watermelon", "melon", "tangerine", "apple", 
	            "date", "elderberry", "fruit", "peach", "fruit", 
	            "apple", "cherry", "fig", "honeydew", "jackfruit", 
	            "papaya", "blueberry", "plum", "pomegranate", "grape", 
	            "avocado", "kiwi", "lemon", "watermelon", "tangerine", 
	            "strawberry", "dragonfruit", "lime", "pear", "peach"
		};
		
		int total = 0;
		char user;
		System.out.print("알파벳 입력 : ");
		// 알파벳을 무조건 소문자로 변환
		user = sc.nextLine().toLowerCase().charAt(0);
		
		
		
		
//		for (int i = 0; i < word.length; i++) {					
//			if(word[i].charAt(0) == user) {		
//				System.out.println(word[i]);
//				total++;
//			};
//		}
		
		for (String str : word) {					
			if(str.charAt(0) == user) {		
				System.out.println(str);
				total++;
			};
		}
		
		if(total == 0) System.out.println("알파벳이 포함된 단어가 없습니다.");
		else System.out.println("알파벳이 포함 된 단어 갯수 : " + total);
		
		
		// 문제 3.
		/*
		 		영화관 예약 사이트를 만들려고 한다.
		 		영화관에 관별로  좌석수가 다르다. 
		 		3관의 좌석수는 96개( 8줄 12열 ) 이다. 
		 		
		 		좌석에 예약완료 된 곳은 1로 표시 
		 		비어있는 좌석은 0으로 표시
		 		
		 		몇명 예약할것인지 인원수를 입력하면
		 		연속적으로 비어있는 자리로 지정해준다.
		 		몇번째 좌석에 예약이 되었는지 출력
		 		
		 		(자리가 부족하면 -1 출력)
		 		
		 */
		
		
		
	}

}
