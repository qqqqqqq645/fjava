package stringex;

public class StringEx {
	public static void main(String ars[]) {
		StringBuffer aa =new StringBuffer( "My name is Tome.");
		char tok = ' ';
		int cnt=0;
		System.out.println(aa);
		for(int i=0;i<aa.length();i++) {
			
			if(aa.charAt(i)==tok)
				cnt++;
		}
		System.out.println(cnt);
		System.out.println(aa.reverse());
		System.out.println(aa);
	}
}
