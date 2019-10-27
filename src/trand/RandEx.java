package trand;

public class RandEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		int cnt=0;
		do {
			
			a = (int)(Math.random()*10) + 1;
			b = (int)(Math.random()*10) + 1;
			c = (int)(Math.random()*10) + 1;
			d = (int)(Math.random()*10) + 1;
			//System.out.println((int)(Math.random()*10+1));
			System.out.println((int)(Math.random()*(10)));
			/*
			a=1;
			b=2;
			c=3;
			d=4;
			*/
			cnt++;
			System.out.println("cnt = "+cnt);
			
		}
		while((a==b) || (a==c) || (a==d) || (b==d) || (b==c) || (c==d) );
		System.out.println("cnt = "+cnt);
		System.out.println("a = "+a+" b = "+b+" c = "+c+" d = "+d);
		
		Float asdf = Float.valueOf((float) 1.5);
		asdf.floatValue();
		Character sdfg = Character.valueOf('b');
		sdfg.charValue();
	}

}
