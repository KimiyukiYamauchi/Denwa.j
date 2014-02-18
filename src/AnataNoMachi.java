import pack1.Denwa;
import pack1.GameKeitai1;
import pack1.GameKeitai2;
import pack1.KeitaiDenwa;


public class AnataNoMachi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GameKeitai1 taro = new GameKeitai1(
				"太郎", "012-1234-5678", "taro@test.jp");
		GameKeitai2 hanako = new GameKeitai2(
				"花子", "999-8888-7777", "hanako@test.jp");
		
		for(int i=0; i<3; i++){
			taro.denwaSuru();
		}

		for(int i=0; i<3; i++){
			hanako.denwaSuru();
		}
		
		taro.mail();
		taro.mail("送信");
		taro.mail("送信", 2);

		hanako.mail();
		hanako.mail("受信");
		hanako.mail("受信", 2);
		
		for(int i=0; i<3; i++){
			taro.gemeSuru();
		}

		for(int i=0; i<3; i++){
			hanako.gemeSuru();
		}

		System.out.print("インスタンスtaroの情報: ");
		printField(taro);
		System.out.print("インスタンスhanakoの情報: ");
		printField(hanako);
		
	}
	
	static void printField(KeitaiDenwa instance){
		System.out.print(instance.KAISYA);
		System.out.print(" ");
		System.out.print(instance.getKataban());
		System.out.print(" ");
		System.out.print(instance.getKeiyaku());
		System.out.print(" ");
		System.out.print(instance.getBangou());
		System.out.print(" ");
		System.out.print(instance.getRyokin());
		System.out.print(" ");
		System.out.print(instance.getMailAddress());
		System.out.print(" ");
		System.out.print(instance.getPacketRyokin());
		System.out.println();
	}

}
