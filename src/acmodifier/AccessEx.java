package acmodifier;

public class AccessEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Sample sample = new Sample();
			sample.a = 10;
			//sample.b = 10;
			sample.c = 10;
			int [] ab[]=new int [3][2];
			int [][] abb[] = new int [1][2][3];
			System.out.println("\\n");
			char aff='\u0041';
			System.out.println(aff);
			short jj = (short)'A';
			System.out.println(jj);
	}

}

class Sample {
	public int a;
	private int b;
	int c;
	int d;
}

class Sample2 extends Sample{
	//c=a;
}