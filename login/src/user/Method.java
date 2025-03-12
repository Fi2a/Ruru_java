package user;

import java.util.Scanner;

public class Method {

	Scanner sc = new Scanner(System.in);
	
	public void login() {
		User u = new User();
		
		System.out.println("\n ----- 로그인 ----- \n");
		System.out.print("아이디 : ");
		u.setUsername( sc.nextLine() );
		System.out.print("비밀번호 : ");
		u.setPassword( sc.nextLine() );
		
		
	}
	
	public User signUp() {		
		User u = new User();
		
		System.out.println("\n ==== 회원 가입 ==== \n");
		System.out.print("아이디 : ");
		u.setUsername( sc.nextLine() );
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
//		while(true) {
//		if(pw.length() < 8) {
//			System.out.println("비번이 짧음");
//		}
		
		u.setPassword( pw );
		
		
		
		return u;
		
	}
	
}
