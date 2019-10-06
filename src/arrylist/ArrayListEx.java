package arrylist;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열만 삽입 가능한 ArrayList 생성
		ArrayList<String> a = new ArrayList<String>();
		//var b = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.print("이름을 입력하세요 >>");
			//String s = scanner.next();
			a.add(scanner.next());
		}
		
		//ArrayList에 있는 모든 이름 출력
		for(int i=0;i<a.size();i++) {
			String name = a.get(i);
			System.out.print(name +" ");
		}
		//가장 긴 이름 출력 
		int LongestIndex = 0;
		for(int i=1;i<a.size();i++) {
			if(a.get(LongestIndex).length()<a.get(i).length()) {
				LongestIndex = i; //i 번째 이름이 더 긴 이름임
			}
		}
		System.out.println("\n가장 긴 이름은 : "+a.get(LongestIndex));
		scanner.close();
	}

}
