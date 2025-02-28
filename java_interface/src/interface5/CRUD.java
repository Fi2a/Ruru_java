package interface5;

public interface CRUD {
	
	public boolean save();		// DB 저장용
	public CRUD select();		// DB 조회용
	public CRUD update();		// DB 수정용
	public boolean delete();	// DB 삭제용
	
}

interface aa { // 함수형 인터페이스 ( 인터페이스 내에 메서드가 하나 )
	public void bb();
}


/*
 	
 		
 		
 */
