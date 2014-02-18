import pack1.KeitaiDenwa;

public class AnataNoMachi4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		KeitaiDenwa taro = new KeitaiDenwa("太郎", "012-1234-5678", 
				"XXX@xxx.ne.jp");

		for(int i=0; i<3; i++){
			taro.denwaSuru();
		}	

		System.out.print("電話料金＜クリア前＞:");
		System.out.println(taro.getRyokin());
		
		taro.clearRyokin();

		System.out.print("電話料金＜クリア後＞:");
		System.out.println(taro.getRyokin());
		
		for(int i=0; i<5; i++){
			taro.mail();
		}

		System.out.print("パケット料金：");
		System.out.println(taro.getPacketRyokin());
		
		System.out.print("メールアドレス＜変更前＞:");
		System.out.println(taro.getMailAddress());
		
		taro.setMailAddress("ZZZ@ZZZ.ne.jp");

		System.out.print("メールアドレス＜変更後＞:");
		System.out.println(taro.getMailAddress());

		System.out.print("電話番号：");
		System.out.println(taro.getBangou());
		
		System.out.print("会社名：");
		System.out.println(taro.KAISYA);

		System.out.print("型番号：");
		System.out.println(taro.getKataban());

		System.out.print("契約者：");
		System.out.println(taro.getKeiyaku());

	}
	
}
