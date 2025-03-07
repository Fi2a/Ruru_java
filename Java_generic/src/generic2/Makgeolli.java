package generic2;

public class Makgeolli extends Alcohol{
	
	@Override
	public String toString() {
		return "막걸리 : " +cmp+", "+name+", 도수 : "+abv+"%"; 
	}
	
	public Makgeolli(String name, String cmp, int abv) {
		super(name, cmp, abv);
	}
}
