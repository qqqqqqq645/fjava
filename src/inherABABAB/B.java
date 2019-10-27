package inherABABAB;

public class B extends A {
	public B () {
		s="asdf";
		super("","");
		//this("");
		System.out.println("Im B");
	}
	public B(String s) {
		//super();
		System.out.println("Im Bstring");
	}
	public static void main(String args[]) {
		B asdf = new B();
		B jfjf = new B(null);
	}
}
