import pack1.KokiDenwa;

public class AnataNoMachi3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		KokiDenwa taro = new KokiDenwa("太郎", "012-1234-5678", 3);

		for(int i=0; i<3; i++){
			taro.denwaSuru();
		}	
		System.out.print("電話料金＜クリア前＞:");
		System.out.println(taro.getRyokin());
		
		taro.clearRyokin();

		System.out.print("電話料金＜クリア後＞:");
		System.out.println(taro.getRyokin());
		
		System.out.print("電話番号＜変更前＞：");
		System.out.println(taro.getBangou());
		
		taro.setBangou("111-1111-1111");
		
		System.out.print("電話番号＜変更後＞：");
		System.out.println(taro.getBangou());
		
		//内線をかける(存在しない子機にもかけて、エラー確認）
		
		// 子機の数を表示する
		
		// 子機の数を変更する
		
		// 子機の数を表示する
		
		System.out.print("会社名：");
		System.out.println(taro.KAISYA);

		System.out.print("型番号：");
		System.out.println(taro.getKataban());

		System.out.print("契約者：");
		System.out.println(taro.getKeiyaku());

	}
	
}
