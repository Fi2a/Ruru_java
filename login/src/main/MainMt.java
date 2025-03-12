package main;

import java.util.ArrayList;
import java.util.Scanner;

import user.Method;
import user.User;
import user.UserManage;

public class MainMt {
	private static Scanner sc = new Scanner(System.in);
	private static int menu() {
		System.out.println("\n\n============메뉴============");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		return num;
	}

	public static void main(String[] args) {
		
		Method m = new Method();
		UserManage um = new UserManage();
		
		while(true) {
			switch( menu() ) {
			case 1: m.login();
					break;
			case 2: um.add( m.signUp() );
					um.rep(m);
					break;
			case 3: return;
			default : System.out.println("잘못 입력하심");
			}
		}
		
		

	}

}
