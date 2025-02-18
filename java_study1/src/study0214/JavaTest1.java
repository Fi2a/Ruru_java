package study0214;

import java.lang.reflect.Array;
import java.security.DrbgParameters.NextBytes;
import java.util.Arrays;
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
		
//		String[] word = new String[] {
//				"apple", "banana", "cherry", "date", "elderberry", 
//	            "fig", "grape", "honeydew", "kiwi", "lemon", 
//	            "mango", "nectarine", "orange", "papaya", "quince", 
//	            "raspberry", "strawberry", "tangerine", "ugli", "vanilla", 
//	            "watermelon", "xigua", "yam", "zucchini", "avocado", 
//	            "blueberry", "cantaloupe", "dragonfruit", "apricot", "blackberry", 
//	            "coconut", "dragonfruit", "eggplant", "feijoa", "grapefruit", 
//	            "huckleberry", "iceplant", "jackfruit", "kiwifruit", "lime", 
//	            "mangosteen", "nectar", "orange", "peach", "pineapple", 
//	            "pear", "plum", "pomegranate", "pear", "lime", 
//	            "apricot", "banana", "papaya", "melon", "peach", 
//	            "plum", "raspberry", "blueberry", "citrus", "mango", 
//	            "blackcurrant", "cucumber", "fennel", "grape", "strawberry", 
//	            "apricot", "blackberry", "currant", "kiwi", "orange", 
//	            "lemon", "watermelon", "melon", "tangerine", "apple", 
//	            "date", "elderberry", "fruit", "peach", "fruit", 
//	            "apple", "cherry", "fig", "honeydew", "jackfruit", 
//	            "papaya", "blueberry", "plum", "pomegranate", "grape", 
//	            "avocado", "kiwi", "lemon", "watermelon", "tangerine", 
//	            "strawberry", "dragonfruit", "lime", "pear", "peach"
//		};
//		
//		int total = 0;
//		char user;
//		System.out.print("알파벳 입력 : ");
//		// 알파벳을 무조건 소문자로 변환
//		user = sc.nextLine().toLowerCase().charAt(0);
		
//		for (String str : word) {					
//			if(str.charAt(0) == user) {		
//				System.out.println(str);
//				total++;
//			};
//		}
//		
//		if(total == 0) System.out.println("알파벳이 포함된 단어가 없습니다.");
//		else System.out.println("알파벳이 포함 된 단어 갯수 : " + total);
		
		
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
	   
	      
	      
//	      int[][] arr = new int[][]{
//	         {1,0,1,1,1,1,1,1,1,1,1,1},
//	         {1,0,0,0,0,0,0,1,0,0,1,0},
//	         {1,0,0,0,0,0,0,1,0,1,1,0},
//	         {1,0,0,0,0,0,0,1,0,1,1,0},
//	         {1,0,0,0,0,0,0,1,0,1,1,0},
//	         {1,0,0,0,0,0,0,0,0,0,1,0},
//	         {1,0,0,0,0,0,0,0,1,0,0,0},
//	         {1,0,0,0,0,0,0,0,1,0,1,0}, 
//	      };
//	            
//	      
//	      for(int i = 0; i < arr.length; i++) {
//	         for(int k = 0; k < arr[i].length; k++) { 
//	            System.out.print(arr[i][k]+" ");
//	         if(k==arr[i].length-1) System.out.println("");
//	         }
//	      }
//	   
//	      int p = 0;
//	      System.out.print("예약 할 인원 수 : ");
//	      p = sc.nextInt();
//	      int count = 0;
//	      
//	         for(int i = 0; i < arr.length; i++) {
//	            for(int k = 0; k <arr[i].length; k++) {
//	               for(int n = 0; n < p; n++) { // 빈좌석 검사
//	            	   if(k+n < arr[i].length) { // 가로열 좌석이 부족할 경우 방지
//	            		   if(arr[i][k+n] == 0) count++;
//	            		   else count = 0;
//	            		   } else break;
//	               }
//	            		
//	               if( count == p) {
//	            	   for( int o = 0; o < p; o++) {
//	            		   arr[i][k+o] = 1;
//	            		   System.out.printf("예약된 자리는 %d줄%d열 입니다.",i+1,k+o+1); 
//	            	   }	         
//	               }
//	            }            
//            }
//		
//		
//	         for(int i = 0; i < arr.length; i++) {
//		         for(int k = 0; k < arr[i].length; k++) { 
//		            System.out.print(arr[i][k]+" ");
//		         if(k==arr[i].length-1) System.out.println("");
//		         }
//		      }
		
		
		/*
		 	문제 4.
		 	
		 	도서관의 관리자로 대출한 사람들의 기록을 관리하고 있다.
		 	도서관에서 여러사람들이 책을 대출하며 각 사람은 여러권의 책을 대출 할 수 있다.
		 	
		 	각 사람이 대출한 책의 제목을 배열로 저장하고 그사람의
		 	대출 내역을 출력하는 프로그램을 작성하시오.
		 	조건.
		 		- 도서관에는 3명의 이용자가 있고 최대 5권까지 대출
		 		- 각 이용자의 이름과 대출한 제목을 출력
		 		
		 		# 이용자의 이름과 책 제목은 키보드를 통해 입력해도 되고 배열 선언시 초기값 지정도 가능
		 	 	
		*/
		
//		String[][] library = new String[][] {
//			{"책1", "책2", "책3", "책4", "책5"},
//			{"책6", "책7", "책8", "책9", "책10"},
//			{"책11", "책12", "책13", "책14", "책15"},			
//		};
//		
//		String[] 윤찬혁 = new String[5];
//		String[] 정민성 = new String[5];
//		String[] 홍인택 = new String[5];
//		윤찬혁 = library[0];
//		정민성 = library[1];
//		홍인택 = library[2];
//		
//		System.out.print("윤찬혁 :");
//		for(String info : 윤찬혁)
//			System.out.print(" " + info);
//		
//		System.out.println();
//		
//		System.out.print("정민성 :");
//		for(String info : 정민성)
//			System.out.print(" " + info);
//		
//		System.out.println();
//		
//		System.out.print("홍인택 :");
//		for(String info : 홍인택)
//			System.out.print(" " + info);
		
		
		
		/*
		 	문제 5.
		 	농장 수확량 계산
		 	농장의 일일 수확량을 배열에 저장한다.
		  	전체 수확량을 구하고, 평균 수확량을 구하세요.
		  	가장 많은 수확량은 얼마인지 출력
		  
		 */
		
		int [] harvest = {9, 10, 11, 8, 7, 5};
		
		int sum = 0, avg = 0;
		
		for(int i = 0; i < harvest.length; i++) {
			sum+=harvest[i];
		}
		
		avg=sum/harvest.length;
		
		System.out.printf("전체 수확량 : %d, 평균 수확량 : %d \n", sum, avg);
		
		Arrays.sort(harvest);
		System.out.println("가장 많은 수확량 : " + harvest[harvest.length-1]);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
