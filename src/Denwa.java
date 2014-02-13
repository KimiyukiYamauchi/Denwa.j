
public class Denwa {
	protected String kataban;
	private String keiyaku;
	private int ryokin;
	private String bangou;
	public int TANKA = 10;
	public String KAISYA = "(株)ABC";
	
	public Denwa(String keiyaku, String bangou){
		this.keiyaku = keiyaku;
		this.bangou = bangou;
		this.ryokin = 0;
		this.kataban = "DENWA-001";
	}
	public String getKeiyaku() {
		return keiyaku;
	}

	public void setKeiyaku(String keiyaku) {
		this.keiyaku = keiyaku;
	}

	public String getBangou() {
		return bangou;
	}

	public void setBangou(String bangou) {
		this.bangou = bangou;
	}

	public String getKataban() {
		return kataban;
	}

	public int getRyokin() {
		return ryokin;
	}

	public void denwaSuru(){
		System.out.println("もしもし　－　はいはい");
		this.ryokin = this.ryokin + this.TANKA;
	}

}
