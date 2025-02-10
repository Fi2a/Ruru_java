package study0207;

import java.util.Scanner;

public class JavaTest2 {

	public static void main(String[] args) {
		
		/*
		 	문제 4
		 	*
		 	**
		 	***
		 	별을 위와 같이 출력
		 	힌트) 첫번째 줄이라 별이 한개, 두번째 줄이라 별이 두개. ( 이중 for 문 )
		 */
		
//		for( int i = 1 ; i<=3 ; i++ ) {
//			for( int a = 1 ; a<=i ; a++) {
//				System.out.print("*");
//			}
//			System.out.printf("\n");
//		}
		
		
		
		
		
		 	
		 	
		/*
		 	문제 5 
		 	0 1 2 3
		 	4 5 6 7
		 	8 9 10 11
		 	
		 	숫자를 위와 같이 출력 ( 이중 for 문 )
		 	
		*/
		
//		int num =-1;
//		for (int i = 1 ; i <=3 ; i++) {
//					
//			for (int a = 1; a <= 4 ; a++) {
//				num++;
//				System.out.print(num + " ");
//			}
//			
//			System.out.printf("\n");
//		}
		
		/*
		 	비밀번호 찾기
		 	1. 비밀번호는 4자리로 구성되어있다.
		 	2. 비밀번호는 각각의 숫자는 1~9 중 하나이고, 중복은 없다.
		 	3. 첫번째 숫자는 네번째 숫자보다 2만큼 크다.
		 	4. 두번째 숫자는 세번째 숫자보다 작다.
		 	5. 비밀번호와 비밀번호 역순의 숫자를 더하기 하면 16566 이다. 예) 1234 + 4321
		 	6. 위 조건을 모두 충족하는 비밀번호 네자리를 출력
		 */
		
//		for (int a = 1; a <= 9 ; a++ ) {
//			
//			for (int b = 1; b <= 9 ; b++ ) {
//								
//				for (int c = 1; c <= 9 ; c++ ) {
//					
//					for (int d = 1; d <= 9 ; d++ ) {
//						
//						if(a!=b && b!=c && c!=d) {
//							if(b<c) {								
//								if( a==d+2 ) {
//									int p1 = 1000 * a + 100 * b + 10 * c + d;
//									int p2 = 1000 * d + 100 * c + 10 * b + a;
//									
//									if(p1+p2 == 16566) {
//										System.out.printf("비밀번호 : %d%d%d%d ",a,b,c,d);						
//										break;	
//									}
//							
//								}
//							}										
//						}						
//					}
//				}				
//			}
//		}
			
			
		/*
		 	문제 7 - 알파벳 찾기 (반드시 반복문 사용해서)
		 	알파벳 (대문자 또는 소문자 모두 가능하게) 입력
		 	입력한 알파벳이 몇번째 알파벳인지 찾기 - 반드시 for 문으로		 	
		 */
		Scanner scan = new Scanner(System.in);
		
		char user ;
		
//		int A = (int)('A');
//		int z = (int)('z');
//		System.out.println(b);
//		System.out.println(z);
		
//		char a = (char)(97);
		
//		System.out.println(A);
		
		System.out.print("알파벳 입력 : ");
		user = scan.next().charAt(0);
		
		for ( int apb = 1; apb <= 26; apb++) {
			if ( user == (apb+64) || user == (apb+96)) {
				System.out.printf("알파벳 %c는 %d번째 알파벳 \n", user, apb);
			}
		}
		
		
		
		for ( int apb = 97 ; apb <= 122 ; apb++ ) {
			if(user == (char)(apb)) 
			System.out.printf("알파벳 %c는 %d번째 알파벳 \n", user,apb-96);			
		}
		
		for ( int apb = 65 ; apb <= 90 ; apb++ ) {
			if(user == (char)(apb)) 
				System.out.printf("알파벳 %c는 %d번째 알파벳 \n", user,apb-64);			
		}
		
			
		
	

	
	
	
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
