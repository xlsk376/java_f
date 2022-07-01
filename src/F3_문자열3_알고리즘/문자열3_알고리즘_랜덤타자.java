package F3_문자열3_알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 문자열3_알고리즘_랜덤타자 {

	public static void main(String[] args) {
		/*
		 * # 타자연습 게임[2단계]
		 * 1. 문제를 섞는다.(shuffle)
		 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
		 * 예)
		 * 문제 : mys*l
		 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		 * 문제 : *sp
		 * 입력 : jsp
		 * ...
		 */

		String[] words = { "java", "mysql", "jsp", "spring" };
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(words.length);
			int r2 = ran.nextInt(words.length);
			String temp = words[r1];
			words[r1] = words[r2];
			words[r2] = temp;
		}
		String temp1[] = new String[4];
		int index = 0;
		for(int i = 0; i < words.length; i++) {
			int count = 0;
			String temp= "";
			int r = ran.nextInt(words[i].length());
			for(int j = 0; j < words[i].length(); j++) {
				char a = words[i].charAt(j);
				if(r == j) {
					temp += "*";
					count +=1;
				}else {
					temp += a;
					count += 1;
				}
				if(count == words[i].length()) {
					temp1[index] = temp;
					index += 1;
				}
			}
		}
		for(int i = 0; i < temp1.length;) {
			System.out.println(temp1[i]);
			String text = scan.next();
			if(temp1[i].length() == text.length()) {
				boolean check = false;
				for(int j = 0; j < temp1[i].length(); j++) {
					char b = temp1[i].charAt(j);
					char c = text.charAt(j);
					if(b == c) {
						check = true;
					}
				}
				if(check == true) {
					System.out.println("정답");
					i += 1;
				}else {
					System.out.println("땡");
				}
			}else {
				System.out.println("땡");
			}
		}
		
		
		

	}

}
