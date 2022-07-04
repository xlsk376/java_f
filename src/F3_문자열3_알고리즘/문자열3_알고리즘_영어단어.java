package F3_문자열3_알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 문자열3_알고리즘_영어단어 {

	public static void main(String[] args) {
		// 문제) 영어단어 맞추기
		// 영어단어가 전부 * 로 표시된다.
		// 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
		// (조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다.
		// 전부 벗겨지거나 맞추면 종료
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int check[] = new int[size]; // 힌트 체크를 통해서 확인할수있다.
		for(int i = 0; i < size; i++) {
			check[i] = word.charAt(i);
		}
		System.out.println(Arrays.toString(check));
		int temp[] = new int[size];
		while (true) {
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i = 0; i < size; i++) {
				char hit = word.charAt(i);
				if(temp[i] == 0) {
					System.out.print("*");
				}else {
					System.out.print(hit);
				}
			}
			System.out.println();
			System.out.println("영어단어를 입력하세요 >>> ");
			String me = scan.next();
			boolean tf = false;
			if(me.length() == word.length()) {
				for(int i = 0; i < word.length(); i++) {
					char a = word.charAt(i);
					char b = me.charAt(i);
					if(a == b) {
						tf = true;
					}else {
						System.out.println("땡");
					}
				}
			}else {
				System.out.println("땡");
			}
			if(tf == true) {
				System.out.println("정답");
				break;
			}else {
				
			}
		}

	}

}
