package supsub;
class Super {
	public int i = 0;
	
			public Super(String text) {
		i=1;
	}
}
public class Sub extends Super{
	public Sub(String text) {
	super(text);
		i=2;
	}
	static public void main(String args[]) {
		Sub sub = new Sub("hello");
		System.out.println(sub.i);
	}
}
