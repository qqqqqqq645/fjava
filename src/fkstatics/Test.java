package fkstatics;

public class Test {
	static int a;
	public static void setA(int x) {
		this.a=x;
	}
	
	public void setB(int x) {
		this.a=x;
	}
}
