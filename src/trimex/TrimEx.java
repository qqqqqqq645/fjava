package trimex;

import java.util.*;

public class TrimEx {


		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("진행해봐");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		System.out.println(s.trim()); //trim 은 스트링 앞뒤만 공백제거함
		
		//StringTokenizer data = new StringTokenizer(s.trim()," ,");
		/*
		System.out.println(data.toString());
		String sname = data.nextToken();
		String major = data.nextToken();
		int snum = Integer.parseInt(data.nextToken());
		double gradeAvg = Double.parseDouble(data.nextToken());
		*/
	}

}
