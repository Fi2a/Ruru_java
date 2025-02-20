package study0219;

public class Product {
	
	String name ; // 상품명
	String brand ; // 브랜드명
	int amount ; // 수량
		
	Product(){}
	Product(String name, int amount){
		this.name = name;
		this.amount = amount;		
	}
	Product(String name, String brand, int amount){
		this.name = name;
		this.brand = brand;
		this.amount = amount;	
	}
	
}

 
