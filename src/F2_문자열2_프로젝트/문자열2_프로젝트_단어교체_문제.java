package F2_문자열2_프로젝트;

import java.util.Scanner;

public class 문자열2_프로젝트_단어교체_문제 {

	public static void main(String[] args) {
		/*
		 * # 단어 교체하기(replace)
		 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
		 * 2. 교체해주는 기능을 구현한다.
		 * 예)
		 * 		Life is too short.
		 * 		변경하고 싶은 단어입력 : Life
		 * 		바꿀 단어입력 : Time
		 * 
		 * 		Time is too short.
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);

		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		String front = "";
		String end = "";
		for(int i = 0; i < text.length() - word.length() + 1; i++) {
			int count = 0;
			for(int j = 0; j < word.length(); j++) {
				if(text.charAt(i + j) == word.charAt(j)) {
					count += 1;
				}
			}
			if(count == word.length()) {
				front = text.substring(0, i);
				end = text.substring(i + word.length()); // 시작위치부터 끝까지
			}
		}
		System.out.println(front);
		System.out.println(end);
		System.out.print("삽입할 단어를 입력하세요 : ");
		String word2 = scan.nextLine();
		
		System.out.println(front + word2 + end);
		
		

	}

}
