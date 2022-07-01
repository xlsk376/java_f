package F1_문자열1_알고리즘;

public class 문자열1_알고리즘_주민번호검사_문제 {

	public static void main(String[] args) {
		String jumin = "890101-2012932";
		
		// 문제 1) 성별 출력
		// 정답 1) 여성
		char a = jumin.charAt(7);
		System.out.println(a); // '2' / 문자
		if(a == 2) {
			System.out.println("정답");
		}else {
			System.out.println("땡");
		}		
		if(a == '2') {
			System.out.println("+");
		}		
		String str = a + ""; // '2' ==> "2" ==> 2
		int b = Integer.parseInt(str);
		if(b == 2) {
			System.out.println("2");
		}
		
		// 문제 2) 나이 출력
		// 정답 2) 30세
		//System.out.println(2022-1989);
		String c = jumin.substring(0, 2);
		System.out.println(c);
		String d = 19 + "";
		System.out.println(d + c);
		String f = d + c;
		int e = Integer.parseInt(f);
		System.out.println(e);
		System.out.println("만 "+ (2022-e) + "세");
		
		

	}

}
