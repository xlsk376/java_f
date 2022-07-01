package F2_문자열2_프로젝트;

import java.util.Scanner;

public class 문자열2_프로젝트_숫자검사_문제 {

	public static void main(String[] args) {
		/*
		 * # 문자열 속 숫자검사
		 * 예) adklajsiod
		 * 	     문자만 있다.
		 * 예) 123123
		 *    숫자만 있다.
		 * 예) dasd12312asd
		 *    문자와 숫자가 섞여있다.
		 */
		// 입력한 값이 숫자가 있는지 확인
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = scan.next();
		// 길이가 매번 다름
		String strNum = "0123456789";
		String strText = "abcdefghijklmnopqrstuvwxyz";
		int count = 0; 
		for(int i = 0; i < text.length(); i++) {
			char a = text.charAt(i);
			for(int j = 0; j < strNum.length(); j++) {
				char b = strNum.charAt(j);
				if(a == b) {
					System.out.println(a + " " + b);
					count += 1; // 전체 길이와 숫자의 길이를 비교해서 같으면 숫자 아니면 문자가 섞임
				}
			}
		}
		if(count == text.length()) {
			System.out.println("숫자");
		}else {
			System.out.println("문자와 숫자");
		}
		
		
		
		
		
		

	}

}
