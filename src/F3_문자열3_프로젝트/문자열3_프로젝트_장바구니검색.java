package F3_���ڿ�3_������Ʈ;

public class ���ڿ�3_������Ʈ_��ٱ��ϰ˻� {

	public static void main(String[] args) {
		String itemData = "1001/����,1002/�����,1003/ĭ��";
		String userData = "3001/�̸���,3002/��ö��,3003/�̿���";
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
		
		//����1) ȸ���� ������ ���Ÿ�� ��� 
		//��) �̸���==> ����3,ĭ��1 / ��ö�� ==> ����1 / �̿��� ==> ����1,�����2
		
//		String userList[] = userData.split(",");
//		for(int i = 0; i < userList.length; i++) {
//			String userToken[] = userList[i].split("/");
//			System.out.print(userToken[1] + " ==> ");
//			String itemList[] = itemData.split(",");
//			String countList[][] = new String[itemList.length][2];
//			for(int j = 0; j < itemList.length; j++) {
//				String itemToken[] = itemList[j].split("/");
//				countList[j][0] = itemToken[1];
//				countList[j][1] = "0";
//			}
//			String cartList[] = cartData.split("\n");
//			for(int j = 0; j < cartList.length; j++) {
//				String cartToken[] = cartList[j].split("/");
//				if(cartToken[0].equals(userToken[0])) {
//					for(int k = 0; k < itemList.length; k++) {
//						String itemToken[] = itemList[k].split("/");
//						if(itemToken[0].equals(cartToken[1])) {
//							int count = Integer.parseInt(countList[k][1]);
//							count += 1;
//							countList[k][1] = count + "";
//						}
//					}
//				}
//			}
//			for(int j = 0; j < countList.length; j++) {
//				if(countList[j][1].equals("0") == false) {
//					System.out.print(countList[j][0] + " " + countList[j][1] + ", ");
//				}
//			}
//			System.out.println();
//			
//		}
		
		//����2) �����ۺ��� ������ ȸ���̸� ��� 
		//��) ����==> �̸���,��ö��,�̿��� / �����==> �̿��� / ĭ��==> �̸���
		
		String itemList[] = itemData.split(",");
		for(int i = 0; i < itemList.length; i++) {
			String itemToken[] = itemList[i].split("/");
			System.out.print(itemToken[1] + " ==> ");
			String cartList[] = cartData.split("\n");
			String countList[][] = new String[cartList.length][2];
			for(int j = 0; j < cartList.length; j++) {
				String cartToken[] = cartList[j].split("/");
				countList[j][1] = "0";
				if(cartToken[1].equals(itemToken[0])) {
					String userList[] = userData.split(",");
					for(int k = 0; k < userList.length; k++) {
						String userToken[] = userList[k].split("/");
						if(userToken[0].equals(cartToken[0])) {
							countList[k][1] = userToken[1];
						}
					}
				}
			}
			for(int j = 0; j < countList.length; j++) {
				if(countList[j][1].equals("0") == false) {
					System.out.print(countList[j][1] + " ");
				}
			}
			System.out.println();
		}
		

	}

}
