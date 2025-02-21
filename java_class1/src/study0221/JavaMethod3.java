package study0221;

public class JavaMethod3 {
	
	static void fS( Courses[] arr ) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].point == 2) {
				System.out.println(arr[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Courses[] course = new Courses[] {
				new Courses(1, "정보사회와 컴퓨터", 3),
				new Courses(2, "데이터베이스", 3),
				new Courses(3, "자료구조", 3),
				new Courses(4, "java", 3),
				new Courses(5, "html", 2)
		};
		
		
		fS(course);
		
		// 학점이 2 학점인 과목을 찾아라. - 메서드
		// 메서드 내용은 course 배열을 반복문으로 돌려서
		// point 가 2 인거 찾기 위한 if문
		// 찾으면 그자리에 출력 or 반환
		// 위의 내용이 동작하기 위해 필요한 것
		// - course 배열이 필요 -> 매개변수
		

	}

}

/*
	 메서드 정의를 위한 메서드 원형작성법
	 
	 1. 메서드를 ㅙ만듦?
	 	- 메서드 만들어서 어디에 씀?
	 	- 메서드 만들어서 머핢?
	 	- 메서드 안 안들면 코드 복잡함?
	 	- 반복문으로 충분히 표현이 안됨?
	 	
	 2. 메서드를 구현하면 내가 편함
	 	- 처음에는 하나하나 메서드를 만들어야 해서 시간이  걸리지만
	 	- 이후에는 이전에 만든 메서드를 응용하면 되니까 시간이 단축된다.
	 	- 그래서 메서드도 설계를 따로 해주긴 한다. 
	 
	 3. 메서드에 필요한것을 제공 (매개변수)
	 	- 여러개의 메서드는 서로 협력하여 일을 진행한다.
	 	- 데이터를 제공받기 위한 매개변수 
	 	
	 4. 다음 할일을 하기 위해 필요한거 돌려받기 ( 반환 - return )
 		- 매개변수가 정방향으로 데이터를 제공하는 방법이라면
 		- 반환 (return) 은 역방향으로 데이터를 제공하는 방법이다.
 
 
 */
