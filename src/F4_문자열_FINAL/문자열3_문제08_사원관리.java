package F4_���ڿ�_FINAL;

import java.util.Arrays;

public class ���ڿ�3_����08_������� {

	public static void main(String[] args) {
		// [�μ�����]
		// [�μ���ȣ,�μ���,����]
		String[][] departmentData = { 
				{ "10", "ACCOUNTING", "NEW YORK" }, 
				{ "20", "RESEARCH", "DALLAS" },
				{ "30", "SALES", "CHICAGO" }, 
				{ "40", "OPERATIONS", "BOSTON" }, 
			};
		// [�������]
		// [��ȣ,�̸�,��å,����ȣ,�Ի���,�޿�,Ŀ�̼�,�μ���ȣ]
		String[][] employeeData = { { "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },
				{ "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30" },
				{ "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30" },
				{ "7566", "JONES", "MANAGER", "7839", "2-4-1981", "2975", "0", "20" },
				{ "7654", "MARTIN", "SALESMAN", "7698", "28-9-1981", "1250", "1400", "30" },
				{ "7698", "BLAKE", "MANAGER", "7839", "1-5-1981", "2850", "0", "30" },
				{ "7782", "CLARK", "MANAGER", "7839", "9-6-1981", "2450", "0", "10" },
				{ "7788", "SCOTT", "ANALYST", "7566", "13-7-1987", "3000", "0", "20" },
				{ "7839", "KING", "PRESIDENT", "NULL", "17-11-1981", "5000", "0", "10" },
				{ "7844", "TURNER", "SALESMAN", "7698", "8-9-1981", "1500", "0", "30" },
				{ "7876", "ADAMS", "CLERK", "7788", "13-7-1987", "1100", "0", "20" },
				{ "7900", "JAMES", "CLERK", "7698", "3-12-1981", "950", "0", "30" },
				{ "7902", "FORD", "ANALYST", "7566", "3-12-1981", "3000", "0", "20" },
				{ "7934", "MILLER", "CLERK", "7782", "23-1-1982", "1300", "0", "10" } };

		// [���� ���]
		// [��� , �޿�MIN , �޿�MAX]
		int salaryGradeData[][] = { 
				{ 1, 700, 1200 }, // 1����̰� �޿� 700~1200 ����
				{ 2, 1201, 1400 }, 
				{ 3, 1401, 2000 }, 
				{ 4, 2001, 3000 },
				{ 5, 3001, 9999 } };
		// ����) # "DALLAS"���� �ٹ��ϴ� ����� �̸�,����,�μ���ȣ,�μ����� ��ȸ�Ͻÿ�.
//		String departMentNumber = "";
//		for (int i = 0; i < departmentData.length; i++) {
//			if (departmentData[i][2].equals("DALLAS")) {
//				departMentNumber = departmentData[i][0];
//			}
//		}
//		System.out.println(departMentNumber);
//		for (int i = 0; i < employeeData.length; i++) {
//			if (departMentNumber.equals(employeeData[i][7])) {
//				System.out.println(Arrays.toString(employeeData[i]));
//			}
//		}
//
//		// ����) # ALLEN�� ���� �μ��� �ٹ��ϴ� ����� �̸�, �μ���ȣ�� ��ȸ�Ͻÿ�.
//		String depNum = "";
//		for (int i = 0; i < employeeData.length; i++) {
//			if (employeeData[i][1].equals("ALLEN")) {
//				depNum = employeeData[i][7];
//			}
//		}
//
//		for (int i = 0; i < employeeData.length; i++) {
//			if (depNum.equals(employeeData[i][7])) {
//				System.out.println(employeeData[i][1] + " : " + employeeData[i][7]);
//			}
//		}
		/*
		 * # �μ��� �ִ� �޿��� �ּ� �޿��� ���Ͻÿ�.
		 * 
		 * #�μ����� �޿� ��� (��, �μ��� �޿� ����� 2000 �̻�)
		 * 
		 * #�μ���ȣ�� 30���� ������� �̸�, ����, �μ���ȣ, �μ���ġ�� ��ȸ�Ͻÿ�.
		 * 
		 * #DALLAS���� �ٹ��ϴ� ����� �̸�,����,�μ���ȣ,�μ����� ��ȸ�Ͻÿ�.
		 * 
		 * # �̸��� A �� ���� ����� �̸�,�μ����� ��ȸ�Ͻÿ�.
		 * 
		 * # ����� 'JONES'�� ���� �μ����� ��ȸ�Ͻÿ�.
		 * 
		 * # 10�� �μ����� �ٹ��ϴ� ����� �̸��� 10�� �μ��� �μ����� ��ȸ�Ͻÿ�.
		 * 
		 */
		
		//# �μ��� �ִ� �޿��� �ּ� �޿��� ���Ͻÿ�.
//		String str = "";
//		for(int i = 0; i < departmentData.length; i++) {
//			System.out.println(departmentData[i][1] + " : ");
//			str = departmentData[i][0];
//			int max = 0;
//			int min = 9999;
//			for(int j = 0; j < employeeData.length; j++) {
//				if(str.equals(employeeData[j][7])) {
//					//System.out.println(Arrays.toString(employeeData[j]));
//					int temp = Integer.parseInt(employeeData[j][5]);
//					if(max < temp) {
//						max = temp;
//					}
//					if(min > temp) {
//						min = temp;
//					}
//				}
//			}
//			if(max != 0 && min != 9999) {
//				System.out.println("�ִ�޿� : " + max);
//				System.out.println("�ּұ޿� : " + min);
//			}
//		}
		//#�μ����� �޿� ��� (��, �μ��� �޿� ����� 2000 �̻�)
//		String str = "";
//		for(int i = 0; i < departmentData.length; i++) {
//			str = departmentData[i][0];
//			System.out.print(str + " : ");
//			int pay = 0;
//			int avg = 0;
//			int count = 0;
//			for(int j = 0; j < employeeData.length; j++) {
//				if(str.equals(employeeData[j][7])) {
//					int temp = Integer.parseInt(employeeData[j][5]);
//					pay += temp;
//					count += 1;
//				}
//			}
//			if(count == 0) {
//				continue;
//			}else {
//				avg = pay/count;
//				if(avg >= 2000) {
//					System.out.print(avg);
//				}
//			}
//			System.out.println();
//		}
		
		// #�μ���ȣ�� 30���� ������� �̸�, ����, �μ���ȣ, �μ���ġ�� ��ȸ�Ͻÿ�.
//		String str = "";
//		for(int i = 0; i < departmentData.length; i++) {
//			if(departmentData[i][0].equals("30")) {
//				str = departmentData[i][0];
//				for(int j = 0; j < employeeData.length; j++) {
//					if(str.equals(employeeData[j][7])) {
//						System.out.println(Arrays.toString(employeeData[j]));
//					}
//				}
//			}
//		}
		
		//#DALLAS���� �ٹ��ϴ� ����� �̸�,����,�μ���ȣ,�μ����� ��ȸ�Ͻÿ�.
//		String str = "";
//		for(int i = 0; i < departmentData.length; i++) {
//			if(departmentData[i][2].equals("DALLAS")) {
//				str = departmentData[i][0];
//			}
//		}
//		
//		for(int i = 0; i < employeeData.length; i++) {
//			if(str.equals(employeeData[i][7])) {
//				System.out.println(Arrays.toString(employeeData[i]));
//			}
//		}
		
		//# �̸��� A �� ���� ����� �̸�,�μ����� ��ȸ�Ͻÿ�.
//		String str = "";
//		char a = 'A';
//		int temp = (int) a;
//		for(int i = 0; i < employeeData.length; i++) {
//			str = employeeData[i][1];
//			boolean check = false;
//			for(int j = 0; j < str.length(); j++) {
//				char b = str.charAt(j);
//				int temp1 = (int) b;
//				if(temp == temp1) {
//					check = true;
//					break;
//				}
//			}
//			if(check == true) {
//				System.out.println(Arrays.toString(employeeData[i]));
//			}
//		}
		
		// # ����� 'JONES'�� ���� �μ����� ��ȸ�Ͻÿ�.
//		String str = "JONES";
//		for(int i = 0; i < employeeData.length; i++) {
//			if(str.equals(employeeData[i][1])) {
//				String str1 = employeeData[i][7];
//				for(int j = 0; j < departmentData.length; j++) {
//					if(str1.equals(departmentData[j][0])) {
//						System.out.println(departmentData[j][1]);
//					}
//				}
//			}
//		}
		
		//# 10�� �μ����� �ٹ��ϴ� ����� �̸��� 10�� �μ��� �μ����� ��ȸ�Ͻÿ�.
		String str = "";
		for(int i = 0; i < departmentData.length; i++) {
			if(departmentData[i][0].equals("10")) {
				str = departmentData[i][0];
				for(int j = 0; j < employeeData.length; j++) {
					if(str.equals(employeeData[j][7])) {
						System.out.println(Arrays.toString(employeeData[j]));
					}
				}
			}
			if(departmentData[i][0].equals("10")) {
				System.out.println("�μ��� : "+departmentData[i][1]);
			}
		}
		
		
		
		

	}

}
