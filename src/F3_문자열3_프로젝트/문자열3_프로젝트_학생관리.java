package F3_���ڿ�3_������Ʈ;

import java.util.Scanner;

public class ���ڿ�3_������Ʈ_�л����� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 100;
		String[][] dataList = new String[max][5];

        // ��ȣ , ���̵� , ��й�ȣ  , �̸� , ���� 
		String sample[][] = { 
				{ "1001", "qwer", "1234", "��ö��", "10" }, 
				{ "1002", "asdf", "2345", "�̿���", "30" }, };

		// ������ �迭�� �̿��ؼ� crud ����
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
			System.out.println(" [0]���� [1]���� [2]Ż�� [3]���� [4]�˻� [5] ��ü���");
			int sel = scan.nextInt();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				if(size == max) {
					System.out.println("������");
				}else {
					System.out.println("������ ���̵� �Է�");
					String id = scan.next();
					boolean check = false;
					for(int i = 0; i < sample.length; i++) {
						if(sample[i][1].equals(id)) {
							check = true;
							break;
						}
					}
					if(check == true) {
						System.out.println("�ߺ�");
					}else {
						for(int i = 0; i < 5; i++) {
							dataList[count][i] = "";
						}
						count += 1;
						dataList[count][0] = (th+count) + "";
						dataList[count][1] = id;
						System.out.println("���Լ���");
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
