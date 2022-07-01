package F1_문자열1_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 문자열1_프로젝트_타자연습 {

	public static void main(String[] args) {
		/*
		 * # 타자연습 게임[1단계]
		 * 1. 문제를 섞는다.(shuffle)
		 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		 * 예)
		 * 문제 : mysql
		 * 입력 : mydb
		 * 문제 : mysql
		 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		 * 문제 : jsp
		 */

		String[] words = { "java", "mysql", "jsp", "spring" };

//		for (String str : words) {
//			System.out.println(str);
//		}
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			int r1 = ran.nextInt(words.length);
			int r2 = ran.nextInt(words.length);
			String temp = words[r1];
			words[r1] = words[r2];
			words[r2] = temp;
		}
		int count = 0;
		for (String str : words) {
			System.out.println(str);
			if(count == 5) {
				break;
			}
			while(true) {
				String str1 = scan.next();
				if(str.length() == str1.length()) {
					boolean check = false;
					for(int i = 0; i < str.length(); i++) {
						char a = str.charAt(i);
						char b = str1.charAt(i);
						if(a != b) {
							check = true;
							break;
						}
					}
					if(check == false) {
						System.out.println("정답");
						count += 1;
						break;
					}else {
						System.out.println("땡");
					}
				}else {
					System.out.println("땡");
				}
				
			}
			
		}
		
		

	}

}
