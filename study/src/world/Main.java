package world;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
//		hawk.name = "タカ";
		dog.setName("犬");
		dog.eat();
		dog.go();
//		for (int i = 0; i < 1; i++) {
//			dog.go();			
//		}
		
		Hawk hawk = new Hawk();
//		hawk.name = "タカ";
		hawk.setName("タカ");
		hawk.eat();
		hawk.go();
//		for (int i = 0; i < 10; i++) {
//			hawk.go();			
//		}

	}

}
