package F3_���ڿ�3_�˰���;

import java.util.Scanner;

public class ���ڿ�3_�˰���_��ٱ��� {

	public static void main(String[] args) {
		/*
		 *  # ���θ� [��ٱ���]
		 * 1. �α��� �� ���� �޴��� �����ϸ�, ������ ���� ��ǰ����� �����ش�.
		 * 	 (1) ��� (2) �ٳ��� (3) ���� 
		 * 2. ��ȣ�� ������ ��ǰ�� ��ٱ��Ͽ� ���� �� �ִ�.
		 * 3. �α��� ȸ�����̵� �� �� ���� ù��° ���� �����Ѵ�.
		 * 4. �ش� ȸ���� ������ ��ǰ��  �� ���� �ι�° ���� �����Ѵ�.
		 * ��)
		 * {
		 * 		{qwer, ���},				
		 * 		{javaking, �ٳ���},				
		 * 		{abcd, ���},				
		 * 		{qwer, ����},		
		 * 		{qwer, ���},			
		 * 		...
		 * }
		 * 5. ��ٱ��� �޴��� �����ϸ� �ڱⰡ �� ��ǰ�� ���̵����Ѵ�.
		 * ��)  qwer ==> ��� , ���� , ���
		 */
			Scanner scan = new Scanner(System.in);
			
			String[] idList = {"qwer", "javaking", "abcd"};
			String[] pwList = {"1111",     "2222", "3333"};
			
			int MAX_SIZE = 100;
			String[][] cartList = new String[MAX_SIZE][2];
			
			int count = 0;
			
			String[] items = {"���", "�ٳ���", "����"};
			
			int log = -1;
			
			while(true) {
				
				System.out.println("[MEGA MART]");
				System.out.println("[1]�� �� ��");
				System.out.println("[2]�α׾ƿ�");
				System.out.println("[3]��     ��");
				System.out.println("[4]��ٱ���");
				System.out.println("[0]��     ��");
				
				System.out.print("�޴� ���� : ");
				int sel = scan.nextInt();
				
				if(sel == 1) {}
				else if(sel == 2) {}
				else if(sel == 3) {}
				else if(sel == 4) {}
				else if(sel == 0) {
					System.out.println("���α׷� ����");
					break;
				}		
			}

	}

}
