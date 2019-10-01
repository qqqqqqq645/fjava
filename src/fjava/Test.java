package fjava;

import java.util.Scanner;


public class Test {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Test() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public Test(String title) {
		this(title, "작자미상");
	}
	
	public Test(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public static void main(String [] args) {
		Test littlePrince = new Test("어린왕자","생텍쥐페리");
		Test loveStory = new Test("춘향전");
		Test emptyTest = new Test();
		loveStory.show();
}
}