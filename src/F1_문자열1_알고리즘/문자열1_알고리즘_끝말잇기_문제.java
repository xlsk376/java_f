package F1_���ڿ�1_�˰���;

import java.util.Scanner;

public class ���ڿ�1_�˰���_�����ձ�_���� {

	public static void main(String[] args) {
		/*
		 * # �����ձ� ������ ��������.
		 * 
		 * ���þ� : ������
		 * �Է� : �Ź�
		 * ���þ� : �Ź�
		 * �Է� : �̼�
		 * ...
		 */
		
		String start = "������";
		
		//equals ==> �ݺ��� 
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("���þ� : " + start + " , ���� : quit");
			String input = scan.next();
			if(input.equals("quit")) {
				System.out.println("���ӿ���");
				break;
			}
			
			if(start.charAt(start.length(	)-1) == input.charAt(0)) { // charAt�� �ѱ��ڱ� ������ "==" �� �ȴ�
				start = input;
				System.out.println("����");
			}else {
				System.out.println("��");
			}
			
			
		}

	}

}
