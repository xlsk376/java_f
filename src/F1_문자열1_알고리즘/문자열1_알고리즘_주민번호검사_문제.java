package F1_���ڿ�1_�˰���;

public class ���ڿ�1_�˰���_�ֹι�ȣ�˻�_���� {

	public static void main(String[] args) {
		String jumin = "890101-2012932";
		
		// ���� 1) ���� ���
		// ���� 1) ����
		char a = jumin.charAt(7);
		System.out.println(a); // '2' / ����
		if(a == 2) {
			System.out.println("����");
		}else {
			System.out.println("��");
		}		
		if(a == '2') {
			System.out.println("+");
		}		
		String str = a + ""; // '2' ==> "2" ==> 2
		int b = Integer.parseInt(str);
		if(b == 2) {
			System.out.println("2");
		}
		
		// ���� 2) ���� ���
		// ���� 2) 30��
		//System.out.println(2022-1989);
		String c = jumin.substring(0, 2);
		System.out.println(c);
		String d = 19 + "";
		System.out.println(d + c);
		String f = d + c;
		int e = Integer.parseInt(f);
		System.out.println(e);
		System.out.println("�� "+ (2022-e) + "��");
		
		

	}

}
