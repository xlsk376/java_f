package F3_¹®ÀÚ¿­3_ÇÁ·ÎÁ§Æ®;

public class ¹®ÀÚ¿­3_ÇÁ·ÎÁ§Æ®_Àå¹Ù±¸´Ï°Ë»ö {

	public static void main(String[] args) {
		String itemData = "1001/°í·¡¹ä,1002/»õ¿ì±ø,1003/Ä­ÃÝ";
		String userData = "3001/ÀÌ¸¸¼ö,3002/±èÃ¶¹Î,3003/ÀÌ¿µÈñ";
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
		
		//¹®Á¦1) È¸¿øº° ¾ÆÀÌÅÛ ±¸¸Å¸ñ·Ï Ãâ·Â 
		//¿¹) ÀÌ¸¸¼ö==> °í·¡¹ä3,Ä­ÃÝ1 / ±èÃ¶¹Î ==> °í·¡¹ä1 / ÀÌ¿µÈñ ==> °í·¡¹ä1,»õ¿ì±ø2
		
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
		
		//¹®Á¦2) ¾ÆÀÌÅÛº°·Î ±¸ÀÔÇÑ È¸¿øÀÌ¸§ Ãâ·Â 
		//¿¹) °í·¡¹ä==> ÀÌ¸¸¼ö,±èÃ¶¹Î,ÀÌ¿µÈñ / »õ¿ì±ø==> ÀÌ¿µÈñ / Ä­ÃÝ==> ÀÌ¸¸¼ö
		
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
