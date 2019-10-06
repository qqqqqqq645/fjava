package testIimport;

//import java.util.*;
public class TestImport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Scanner aa = new Scanner(System.in);
			//int b = aa.nextInt();
			//System.out.println(b).println();
	
			int i = 0;
			String cc = "asdf";
			System.out.println(cc);
			System.out.println(cc.getClass());
			System.out.println(cc.getClass().getName());
			cc=cc+"asdf";
			System.out.println(cc);
			System.out.println(cc.toString());
			Integer ii= 5;
			System.out.println(ii.toString());
			System.out.println(Integer.toString(5));
			/*
			int [][] fdsa = new int [4][];
			
			fdsa [1] = {1,2,3};
			}
			fdsa [2] = new int [2];
			fdsa [3] = new int [5];
			
			//fdsa [4] = new int [3];
			fdsa [0] = new int [2];
			//fdsa [6] = new int [3];
			System.out.println(fdsa.length);
			*/
			int ffds[][] = {{1,2,3},{4,5,6,7},{8,9},{10,11,12}};
			System.out.println(ffds.length);
			System.out.println(ffds.getClass());
			char data[] = {'a','b','c','d'};
			String kk = "abcd";
			System.out.println(data.length);
			System.out.println(data.getClass());
			System.out.println(ffds[0][2]);
			System.out.println(data);
			data.equals(kk);
			System.out.println(data.equals(kk));
			System.out.println("kk[0] = "+kk.charAt(0));
			
			int jjjj[] = {1,2,3};
			for(int qqbk :jjjj) {
				System.out.println(qqbk);
			}
			
			int kkab [] [] = {{},{},{}};
			kkab[0] = new int [5];
			System.out.println("kkab[0] = "+kkab[0].length);
			System.out.println("kkab= "+kkab.length);
	}

}
