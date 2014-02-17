package pack1;

public class KokiDenwa extends Denwa {
	
	private int kokisu;

	public int getKokisu() {
		return kokisu;
	}

	public void setKokisu(int kokisu) {
		this.kokisu = kokisu;
	}

	public KokiDenwa(String keiyaku, String bangou, 
			int kokisu) {
		super(keiyaku, bangou);
		this.kokisu = kokisu; 
	} 
	
	public void naisen(int kokibangou){
		if(kokibangou>0 && kokibangou<=kokisu){
			System.out.println(kokibangou + "番の子機と内線通話しました");
		}else{
			System.out.println("その番号の子機はありません");
		}
	}
}
