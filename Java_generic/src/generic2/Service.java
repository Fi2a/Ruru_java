package generic2;
	
public class Service {
	
	public void drink( Bottle<? extends Alcohol> ach ) { // 알코올 섭취
		System.out.println(ach.item);
		System.out.println("한잔 마신다.");
	}
	
}
