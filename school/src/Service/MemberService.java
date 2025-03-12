package Service;

import java.util.Scanner;

import DAO.MemberDAO;

public class MemberService implements ActiveService{

	public void singUp() {
		System.out.println("회원 가입 완료");
	}
	
	private MemberDAO dao;
	
	public MemberService() { // DAO 객체생성
		this.dao = new MemberDAO();
	}
	
	public String signIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n---- 로그인 ----");
		System.out.print("ID : ");
		String mId = sc.nextLine();
		System.out.print("PW : ");
		String mPw = sc.nextLine();
		// 로그인을 위해서 입력한 아이디와 비밀번호를 테이블에 조회한다.
		
		if( dao.userIdAndPassword( mId, mPw ) ) {
			return mId; // 로그인 성공했다면 입력한 아이디 리턴
		}
		
		return null; // 로그인 실패시 null 리턴
	}
	
	
	
	
}
