package Practice;

import java.util.Scanner;

public class WordShift {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String s = sc.nextLine();
		int len = s.length();
		for(int i=0;i<len;i++) {
			String first = s.substring(0,1);
			String last = s.substring(1);
			s = last + first;
			System.out.println(s);
		}
		sc.close();			
	}

}
