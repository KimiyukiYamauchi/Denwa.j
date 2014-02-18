import pack1.KeitaiDenwa;

public class AnataNoMachi5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		KeitaiDenwa taro = new KeitaiDenwa("太郎", "012-1234-5678", 
				"XXX@xxx.ne.jp");
		
        taro.mail();
        taro.mail("send");
        taro.mail("receive");
        taro.mail("send", 3);
        taro.mail("receive", 3);

		System.out.print("パケット料金：");
		System.out.println(taro.getPacketRyokin());
		
	}
	
}
