package interface5;

public class MainMt {

	public static void main(String[] args) {
		
		CRUD mem = new MemberService();
		CRUD board = new BoardService();
		
		mem.save();
		

	}

}
