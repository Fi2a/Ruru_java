package generic2;

public class Wine extends Alcohol{

	@Override
	public String toString() {
		return "와인: " +cmp+", "+name+", 도수 : "+abv+"%"; 
	}
	
	public Wine(String name, String cmp, int abv) {
		super(name, cmp, abv);
	}
}
