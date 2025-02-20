package study0220;

public class JavaMethod {

	// 메서드에 변환값 (출력값) 이 없는 경우 void 타입으로 작성
	
	// 메서드 정의
	// 반환과 매개변수 없는 메서드 형태
	// 외부 데이터도 필요없고 출력하는 값도 없기떄문에 대부분 단순 출력용이 많다. 예) 메뉴
	// 또는 클래스 객체의 메서드인 경우에도 반환과 매개변수 없이 정의한다.
	static void output() {
		System.out.println(" 반환이 없는 ");
		System.out.println(" 매개변수도 없는 메서드 ");
	}
	
	// 반환없고 매개변수 있는 메서드
	// 메서드의 내용을 실행하는데 필요한 데이터를 가지고 있지 않다면
	// 메서드 외부에서 데이터를 가져와야 한다.
	
	static void sum(int num1 , int num2) { // 두 정수의 합 구해서 출력까지
		 System.out.println(" 합 : "+  (num1 + num2) );
	}
	static void sum(int num1 , float num2) { // 정수와 실수 합 구해서 출력까지
		System.out.println(" 합 : "+  (num1 + num2) );
	} // sum 메서드 오버로딩
	
	// 반환은 있고 매개변수는 필요없는 메서드 - 예) int num = scan.nextInt();
	// 매개변수가 필요없기 때문에 자체적으로 필요한 데이터를 생성 할 수 있거나
	// 클래스 객체가 가지고 있는 인스턴스변수의 데이터를 가공하여
	// 외부로 내보내기 위한 목적인 경우
	
	static int total() {
		int a= 10, b = 20, c= 30;
		int tot = a+b+c;
		return tot; // tot = int, total() = int
	}
	
	// 반환, 매개변수 둘 다 있는 메서드 - 예) name.equals("뭐시기")
	
	static String game (int val) { // 1.가위 , 2. 바위, 3. 보
		if (val == 1) return "가위";
		if (val == 2) return "바위";
		if (val == 3) return "보";
		return "잘못입력함"; 	// 반환이 있는 메서드에서 if 문으로 return 했다면
							// 참인경우에만 동작할 수 있기 때문에 별도의 return 이 필요함
	}
	
	// 두 개의 정수 중 큰 값 출력하는거 만들기
	// 두 정수 비교하고 출력하는 메서드 필요 - 반환없고 매개변수 있는 메서드로
	
	static void compare (int a , int b) {
		if(a>b) System.out.printf("%d가 더 큼 \n",a);
		if(a<b) System.out.printf("%d가 더 큼 \n",b);
	}
	
	// 국어점수 : 88 , 영어점수 : 91 , 수학점수 ㅣ 74
	// 세 과목의 총점과 평균을 출력
	// 총점 계산하는 메서드, 평균 계산하는 메서드
	
	static int sum (int a, int b, int c	) {
		return a+b+c;
	}
	
	static void avg (int sum) {
		System.out.println("평균값 : " + (sum/3));
	}
	
	public static void main(String[] args) {
		
		int kor = 88, eng =91 , mat = 74;
		
		int sum = sum(kor, eng, mat);
		System.out.println("총점 : " + sum);
		avg(sum);
		
		//	메서드 출력
		output();
		
		sum(7,4);
		sum(10, 3.14f);
		
		int num = total();
		System.out.println(num);
		
		System.out.println(game(3));
		
		compare(10,25);
		
	}

}
