package F3_���ڿ�3_�˰���;

import java.util.Scanner;

public class ���ڿ�3_�˰���_��ٱ��� {

	public static void main(String[] args) {
		/*
		 * # ���θ� [��ٱ���] 1. �α��� �� ���� �޴��� �����ϸ�, ������ ���� ��ǰ����� �����ش�. (1) ��� (2) �ٳ��� (3) ����
		 * 2. ��ȣ�� ������ ��ǰ�� ��ٱ��Ͽ� ���� �� �ִ�. 3. �α��� ȸ�����̵� �� �� ���� ù��° ���� �����Ѵ�. 4. �ش� ȸ���� ������
		 * ��ǰ�� �� ���� �ι�° ���� �����Ѵ�. ��) { {qwer, ���}, {javaking, �ٳ���}, {abcd, ���}, {qwer,
		 * ����}, {qwer, ���}, ... } 5. ��ٱ��� �޴��� �����ϸ� �ڱⰡ �� ��ǰ�� ���̵����Ѵ�. ��) qwer ==> ��� , ����
		 * , ���
		 */

		Scanner scan = new Scanner(System.in);

		String[] idList = { "qwer", "javaking", "abcd" };
		String[] pwList = { "1111", "2222", "3333" };

		int MAX_SIZE = 100;
		String[][] cartList = new String[MAX_SIZE][2];

		int count = 0;

		String[] items = { "���", "�ٳ���", "����" };

		int log = -1;

		while (true) {

			System.out.println("[MEGA MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) { // �α���
				if (log == -1) {
					System.out.println("���̵� �Է�");
					String id = scan.next();
					System.out.println("��� �Է�");
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
						System.out.println(idList[index] + "�α��� �Ǿ����ϴ�.");
						log = index;
					} else {
						System.out.println("���̵� �� ����� �ٽ� Ȯ�����ּ���.");
					}
				} else if (log != -1) {
					System.out.println("�α׾ƿ��� �̿��� �ּ���.");
				}
			} else if (sel == 2) { // �α׾ƿ�
				if (log != -1) {
					log = -1;
				} else if (log == -1) {
					System.out.println("�α����� �̿��� �ּ���.");
				}
			} else if (sel == 3) { // ����
				if (log != -1) {
					System.out.println("��ǰ�� �����ϼ���.");
					System.out.println("(1) ��� (2) �ٳ��� (3) ����");
					int data = scan.nextInt();
					data -= 1;
					cartList[count][0] = idList[log];
					cartList[count][1] = items[data];
					count += 1;
				} else if (log == -1) {
					System.out.println("�α����� �̿��� �ּ���.");
				}
			} else if (sel == 4) { // ��ٱ���
				if (log != -1) {
					System.out.print(idList[log] + " ==> ");
					for (int i = 0; i < cartList.length; i++) {
						if (idList[log].equals(cartList[i][0])) {
							System.out.print(cartList[i][1] + " ");
						}
					}
					System.out.println();
				} else if (log == -1) {
					System.out.println("�α����� �̿��� �ּ���.");
				}
			} else if (sel == 0) { // ����
				System.out.println("���α׷� ����");
				break;
			}
		}

	}

}
