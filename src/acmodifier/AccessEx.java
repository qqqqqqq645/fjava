package acmodifier;

public class AccessEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Sample sample = new Sample();
			sample.a = 10;
			//sample.b = 10;
			sample.c = 10;
	}

}

class Sample {
	public int a;
	private int b;
	int c;
}

class Sample2 extends Sample{
	//c=a;
}