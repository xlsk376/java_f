package F1_문자열1_프로젝트;

import java.util.Scanner;

public class 문자열1_프로젝트_대소문자 {

	public static void main(String[] args) {
		/*
		아이디와 비밀번호 입력받고 로그인출력 		
		조건) 단, 아이디와 비밀번호는 
		1) 대문자로 입력하던 , 
		2) 소문자로 입력하던 , 
		3) 섞어서 입력하던 전부 인식되어야한다.		
		 */

		Scanner scan = new Scanner(System.in);
		
		String dbid = "q1w2e3r4";
		String dbpw = "r4e3w2q1";
		
		String str0 = "0123456789";
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String id = "Q1W2E3r4";
		boolean check = false;
		if(dbid.length() != id.length()) { // 길이 비교
			check = true;
		}else {						
			for(int i = 0; i < dbid.length(); i++) {
				char dbc = dbid.charAt(i);		// id 문자열 전부 출력
				char idc = id.charAt(i);	    // 입력한 id 문자열 전부 출력
//				if(dbc == idc) {
//					System.out.println(dbc + " " + idc);
//				}
				if(dbc != idc) {	//문자열이 전부 일치하지 않으면
//                  숫자이면 아래로 내려가면 안됨
					for(int j = 0; j < str0.length(); j++) {
						if(dbc == str0.charAt(j) ) { // 숫자가 같은지 확인
							check = true;
							System.out.println(dbc + " " + idc);
							break;
						}
					}
					//글자이면 대소문자검사
					for(int j = 0; j < str1.length(); j++) {
						if(str1.charAt(j) == dbc) { // 기존 아이디 소문자 일치하는지 확인
							if(str2.charAt(j) != idc) { // 입력한 아이디 대문자 일치 안함
								check = true;
								System.out.println(dbc + " " + idc);
								System.out.println("+");
								break;
							}
						}else if(str2.charAt(j)== dbc) { // 기존 아이디 대문자 일치하는지 확인
							if(str1.charAt(j) != idc) { // 입력한 아이디 소문자 일치 안함
								check = true;
								System.out.println(dbc + " " + idc);
								break;
							}
						}
					}
				}				
			}		
		}
		if(check == false) {
			System.out.println("일치");
		}else {
			System.out.println("불일치");
		}
		

	}

}
