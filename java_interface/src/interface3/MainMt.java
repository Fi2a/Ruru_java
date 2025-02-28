package interface3;

public class MainMt {

	public static void main(String[] args) {
		
		Animal puppy = new Dog();
		puppy.sound();
		
		Animal[] animal = new Animal[4];
		animal[0] = new Dog();
		animal[1] = new Cat();
		animal[2] = new Chicken();
		animal[3] = new Dog();
		
		for( Animal a : animal) {
			a.sound();
		}
		
		

	}

}

// 동물 소리
// 고양이 소리, 닭 소리, 강아지 소리


