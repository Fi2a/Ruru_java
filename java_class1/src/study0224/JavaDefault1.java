package study0224;

public class JavaDefault1 {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		
		System.out.println(m1.name);
		System.out.println(m1.count);
		
		
		Member m2 = new Member("홍길동", 20, "서울");
		
		System.out.println(m2.name);
		
		
	}

}
