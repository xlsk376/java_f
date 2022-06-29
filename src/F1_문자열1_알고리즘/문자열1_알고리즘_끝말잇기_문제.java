package F1_문자열1_알고리즘;

import java.util.Scanner;

public class 문자열1_알고리즘_끝말잇기_문제 {

	public static void main(String[] args) {
		/*
		 * # 끝말잇기 게임을 만들어보세요.
		 * 
		 * 제시어 : 자전거
		 * 입력 : 거미
		 * 제시어 : 거미
		 * 입력 : 미술
		 * ...
		 */
		
		String start = "자전거";
		
		//equals ==> 반복문 
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("제시어 : " + start + " , 종료 : quit");
			String input = scan.next();
			if(input.equals("quit")) {
				System.out.println("게임오버");
				break;
			}
			
			if(start.charAt(start.length(	)-1) == input.charAt(0)) { // charAt는 한글자기 때문에 "==" 이 된다
				start = input;
				System.out.println("정답");
			}else {
				System.out.println("땡");
			}
			
			
		}

	}

}
