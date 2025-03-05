package exception4;

public class MainMt {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		Member m2 = new Member("김유신", 25);
		
//		m1.nameCount();
//		m2.nameCount();
		
		try {
			int a = m1.getBirthYear();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

/*
		오류 발생이 예상되는 코드에 try{ } catch() {} 를 넣어준다.
		오류는 대부분 입력, 계산, 인덱스, 창조변수활용 에서 많이 발생한다.
			이유 -> 사용자조작과 밀접하기에
			
		try{ } 에서 발생한 오류는 catch 로 넘어가게 된다.
		catch 에서는 오류에 맞는 예외클래스를 사용하면 좋지만
		어떤 오류가 발생할지 예상하기 어려운 경우 부모클래스( Exception ) 으로 받는것도 방법
		
		예외를 강제 발생 시키기 (오류 발생)
		throw new 예외클래스("메세지")
		
		예외 던지기
		메서드 이름 뒤에 throws 예외클래스
		어떤 객체에 의해 오류가 발생했는지 확인하고자 하는 경우
		메서드에서 예외 던지기를 한다.
		
*/