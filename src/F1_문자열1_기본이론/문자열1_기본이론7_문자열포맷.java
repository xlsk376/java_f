package F1_���ڿ�1_�⺻�̷�;

public class ���ڿ�1_�⺻�̷�7_���ڿ����� {

	public static void main(String[] args) {
		// ���ڿ��� + �� �����Ҽ��ִ�.
		String menu = "";
		menu += "======�Ե�����=====";
		menu += "\n";
		menu += "1)�ܹ��� 200��";
		menu += "\n";
		menu += "2)�ݶ� 1200��";
		menu += "\n";
		menu += "3)����Ƣ�� 1300��";
		System.out.println(menu);

		System.out.println("----------------------");

		String name[] = { "aaa", "bbbbbbbb", "c" };
		int total[] = { 271, 200, 24 };
		double avg[] = new double[3];
		for (int i = 0; i < 3; i++) {
			avg[i] = (double) total[i] / 3;
		}

		for (int i = 0; i < 3; i++) {
			System.out.printf("[%10s] [%5d] [%6.2f]", name[i], total[i], avg[i]);
			System.out.println();
		}
		System.out.println("---------------------------------------");
		// - �� ��������
		for (int i = 0; i < 3; i++) {
			System.out.printf("[%-10s] [%-5d] [%-6.2f]", name[i], total[i], avg[i]);
			System.out.println();
		}
		System.out.println("---------------------------------------");
		// String.format(); //�ܼ��� ����� �ƴ϶� ���ڿ��� �����ϰ������ ���

		String data = "";
		for (int i = 0; i < 3; i++) {
			data += String.format("[%-10s] [%-5d] [%-6.2f]", name[i], total[i], avg[i]);
			data += "\n";
		}
		System.out.println(data);
		System.out.println("---------------------------------------");

	}

}
