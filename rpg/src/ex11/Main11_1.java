package ex11;

public class Main11_1 {

	public static void main(String[] args) {
		Book book = new Book("ゲド戦記", 790, "緑", "978-4-00-114588-5", 54);
		
		System.out.println(book.getName());
		System.out.println(book.getPrice());
	}

}
