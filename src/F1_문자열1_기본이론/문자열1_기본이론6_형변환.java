package F1_���ڿ�1_�⺻�̷�;

public class ���ڿ�1_�⺻�̷�6_����ȯ {

	public static void main(String[] args) {
		// ����ȯ(type conversion) ==> �ڷ���(data type)�� �ٲٴ� ���� �ǹ�

		// [1] �⺻�ڷ��� ����ȯ�ϴ¹�� (�ڷ���)����
		// ���� -> ����
		char ch = 'a'; // ���ڵ鵵 ��� ���ڷ� �Ǿ��ִ�.
		int aNum = (int) ch;
		System.out.println(aNum); // 97

		ch = (char) (aNum + 1);
		System.out.println(ch); // b

		// [2] ���ڿ� ����ȯ�ϴ¹�� Ư���Լ��� ����ؾ��Ѵ�.
		// ���ڿ� -> ����
		String strNum = "10";
		int num = Integer.parseInt(strNum);
		System.out.println(num + 1); // 11

		// ���� -> ���ڿ�
		// ���1) �ļ�
		strNum = num + "";
		System.out.println(strNum + 1); // 101
		// ���2) ����
		strNum = String.valueOf(num);
		System.out.println(strNum + 1); // 101

	}

}
