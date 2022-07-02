package F3_문자열3_알고리즘;

import java.util.Scanner;

public class 문자열3_알고리즘_장바구니 {

	public static void main(String[] args) {
		/*
		 * # 쇼핑몰 [장바구니] 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다. (1) 사과 (2) 바나나 (3) 딸기
		 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다. 3. 로그인 회원아이디 는 각 행의 첫번째 열에 저장한다. 4. 해당 회원이 구매한
		 * 상품은 각 행의 두번째 열에 저장한다. 예) { {qwer, 사과}, {javaking, 바나나}, {abcd, 사과}, {qwer,
		 * 딸기}, {qwer, 사과}, ... } 5. 장바구니 메뉴를 선택하면 자기가 산 물품만 보이도록한다. 예) qwer ==> 사과 , 딸기
		 * , 사과
		 */

		Scanner scan = new Scanner(System.in);

		String[] idList = { "qwer", "javaking", "abcd" };
		String[] pwList = { "1111", "2222", "3333" };

		int MAX_SIZE = 100;
		String[][] cartList = new String[MAX_SIZE][2];

		int count = 0;

		String[] items = { "사과", "바나나", "딸기" };

		int log = -1;

		while (true) {

			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) { // 로그인
				if (log == -1) {
					System.out.println("아이디 입력");
					String id = scan.next();
					System.out.println("비번 입력");
					String pw = scan.next();
					boolean check = false;
					int index = 0;
					for (int i = 0; i < idList.length; i++) {
						if (idList[i].equals(id) && pwList[i].equals(pw)) {
							check = true;
							index = i;
							break;
						}
					}
					if (check == true) {
						System.out.println(idList[index] + "로그인 되었습니다.");
						log = index;
					} else {
						System.out.println("아이디 및 비번을 다시 확인해주세요.");
					}
				} else if (log != -1) {
					System.out.println("로그아웃후 이용해 주세요.");
				}
			} else if (sel == 2) { // 로그아웃
				if (log != -1) {
					log = -1;
				} else if (log == -1) {
					System.out.println("로그인후 이용해 주세요.");
				}
			} else if (sel == 3) { // 쇼핑
				if (log != -1) {
					System.out.println("상품을 선택하세요.");
					System.out.println("(1) 사과 (2) 바나나 (3) 딸기");
					int data = scan.nextInt();
					data -= 1;
					cartList[count][0] = idList[log];
					cartList[count][1] = items[data];
					count += 1;
				} else if (log == -1) {
					System.out.println("로그인후 이용해 주세요.");
				}
			} else if (sel == 4) { // 장바구니
				if (log != -1) {
					System.out.print(idList[log] + " ==> ");
					for (int i = 0; i < cartList.length; i++) {
						if (idList[log].equals(cartList[i][0])) {
							System.out.print(cartList[i][1] + " ");
						}
					}
					System.out.println();
				} else if (log == -1) {
					System.out.println("로그인후 이용해 주세요.");
				}
			} else if (sel == 0) { // 종료
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
