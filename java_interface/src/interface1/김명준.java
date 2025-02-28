package interface1;

public class 김명준 implements Active {
	
	@Override
	public void moving() {
		System.out.println("명준 무빙");
	}
	
	@Override
	public void target() {
		System.out.println("명준 공격");
	}
	
}
