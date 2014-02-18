import pack1.Denwa;
import pack1.KeitaiDenwa;

public class AnataNoMachi6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Denwa hanako = new Denwa("花子", "111-1111-1111");

		KeitaiDenwa taro = new KeitaiDenwa("太郎", "012-1234-5678", 
				"XXX@xxx.ne.jp");
		
		for(int i=0; i<3; i++){
			hanako.denwaSuru();
		}

		for(int i=0; i<3; i++){
			taro.denwaSuru();
		}
			
        taro.mail();
        taro.mail("send");
        taro.mail("receive");
        taro.mail("send", 2);
        taro.mail("receive", 2);

		System.out.print("花子の電話料金");
		System.out.println(hanako.getRyokin());
		System.out.print("太郎の電話料金");
		System.out.println(taro.getRyokin());

		System.out.print("太郎のパケット料金：");
		System.out.println(taro.getPacketRyokin());
		
		hanako.clearRyokin();
		taro.clearRyokin();

		System.out.print("花子の電話料金");
		System.out.println(hanako.getRyokin());
		System.out.print("太郎の電話料金");
		System.out.println(taro.getRyokin());

		System.out.print("太郎のパケット料金：");
		System.out.println(taro.getPacketRyokin());
	}
	
}
