import pack1.Denwa;


public class AnataNoMachi7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Denwa taro = new Denwa("太郎", "012-1234-5678");
		Denwa hanako = new Denwa("花子", "999-8888-7777");

		System.out.print("インスタンスtaroの情報: ");
		printField(taro);
		System.out.print("インスタンスhanakoの情報: ");
		printField(hanako);
		
		for(int i=0; i<3; i++){
			taro.denwaSuru();
		}	

		for(int i=0; i<10; i++){
			hanako.denwaSuru();
		}	

		printField(taro);
		printField(hanako);

	}
	
	static void printField(Denwa instance){
		System.out.print(instance.KAISYA);
		System.out.print(" ");
		System.out.print(instance.getKataban());
		System.out.print(" ");
		System.out.print(instance.getKeiyaku());
		System.out.print(" ");
		System.out.print(instance.getBangou());
		System.out.print(" ");
		System.out.print(instance.getRyokin());
		System.out.println();
	}

}
