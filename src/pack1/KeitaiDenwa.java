package pack1;

public class KeitaiDenwa extends Denwa {
	
	private String mailAddress;
	private int packetRyokin;
	private int PACKET_TANKA = 1;

	public KeitaiDenwa(String keiyaku, String bangou,
			String mailAddress) {
		super(keiyaku, bangou);
		this.mailAddress = mailAddress;
		super.kataban = "KEITAI-001";
	}
	
	public int mail(){
		System.out.println("メールしました");
		this.packetRyokin = 
				this.packetRyokin + PACKET_TANKA * 5;
		return this.packetRyokin;
	}

	public int mail(String joutai){
		String msg = "メールを" + joutai + "しました";
		System.out.println(msg);
		this.packetRyokin = 
				this.packetRyokin + PACKET_TANKA * 5;
		return this.packetRyokin;
	}

	public int mail(String joutai, int kaisu){
		String msg = "通目のメールを" + joutai + "しました";
		for(int i=1; i<=kaisu; i++){
			System.out.println(i + msg);
		}
		this.packetRyokin = 
				this.packetRyokin + PACKET_TANKA * 5;
		return this.packetRyokin;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public int getPacketRyokin() {
		return packetRyokin;
	}
	
	@Override
	public void denwaSuru(){
		System.out.print("アドレス帳で探しました --> ");
		super.denwaSuru();
	}
	
	@Override
	public void clearRyokin(){
		super.clearRyokin();
		packetRyokin = 0;
	}

}
