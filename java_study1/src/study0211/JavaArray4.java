package study0211;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] game = new int[25];
		
		// game 배열에 값 채우기
		
		for (int i = 0; i < game.length; i++) 
			game[i] = (int)(Math.random() * 50 +1);
			
//		System.out.println( Arrays.toString(game) );
		
		// 5줄 5칸 출력
		
		while (true) {
		
			for ( int i = 0 ; i <= 4; i++) { // 빙고판 출력
				for ( int a = 0 ; a <= 4; a++) {
					if ( game[i*5+a] == 0 )
						System.out.printf(" %2s ", "■");
					else
					System.out.printf(" %2d " , game[i*5+a]);
				}
				System.out.println();
			}
		
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt(); // 빙고판 숫자 입력
		
			for( int i = 1 ; i < game.length ; i++ ) {
				if (game[i] == num) { // 내가 입력한 숫자가 배열에 있는지 찾기
					game[i] = 0;
				}
			
			}
		
			// 빙고게임은 5줄 빙고 되면 종료
			
			// 위에 랜덤한 빙고숫자가 중복안되게끔 수정 
			
			
		
		}
		
		

	}

}
