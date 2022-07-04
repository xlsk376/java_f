package F3_문자열3_프로젝트;

import java.util.Scanner;

public class 문자열3_프로젝트_학생관리 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 100;
		String[][] dataList = new String[max][5];

        // 번호 , 아이디 , 비밀번호  , 이름 , 점수 
		String sample[][] = { 
				{ "1001", "qwer", "1234", "김철수", "10" }, 
				{ "1002", "asdf", "2345", "이영희", "30" }, };

		// 이차원 배열을 이용해서 crud 구현
		int size = 0;
		for (int i = 0; i < sample.length; i++) {
			for (int j = 0; j < sample[i].length; j++) {
				dataList[i][j] = sample[i][j];
			}
			size += 1;
		}
		int count = 2;
		int th = 1000;
		while (true) {
			System.out.println(" [0]종료 [1]가입 [2]탈퇴 [3]수정 [4]검색 [5] 전체출력");
			int sel = scan.nextInt();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				if(size == max) {
					System.out.println("가득참");
				}else {
					System.out.println("가입할 아이디 입력");
					String id = scan.next();
					boolean check = false;
					for(int i = 0; i < sample.length; i++) {
						if(sample[i][1].equals(id)) {
							check = true;
							break;
						}
					}
					if(check == true) {
						System.out.println("중복");
					}else {
						for(int i = 0; i < 5; i++) {
							dataList[count][i] = "";
						}
						count += 1;
						dataList[count][0] = (th+count) + "";
						dataList[count][1] = id;
						System.out.println("가입성공");
						size += 1;
						for (int i = 0; i < size; i++) {
							for (int j = 0; j < dataList[i].length; j++) {
								System.out.print(dataList[i][j]+ " ");
							}
							System.out.println();
						}
					}
				}

			} else if (sel == 5) {
				System.out.println(size);
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < dataList[i].length; j++) {
						System.out.print(dataList[i][j]+ " ");
					}
					System.out.println();
				}
			}
		}

	}

}
