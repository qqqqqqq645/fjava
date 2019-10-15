package constructors;

public class Book {
	String title;
	String author;
	
	void show() {
		System.out.println(title+"1 "+author);
	}
	public Book() {
		this("","");
		System.out.println("Book() 호출됨");
	}
	public Book(String title) {
		//System.out.println("asdf");
		this(title, "작자미상");
		System.out.println("Book(String Book) 호출");
	}
	public Book(String title, String author) {
		this.title = title;
		this.author =author;
		System.out.println("Book(SS) 호출");
	}
	public static void main(String [] args) {
		Book loveStory = new Book("춘양전");
		Book abook = new Book(null);
		Book emptyBook = new Book();
		Book north = new Book("","");
		loveStory.show();
		abook.show();
		emptyBook.show();
		north.show();
		System.out.println(null=="asdf");
	}
}
