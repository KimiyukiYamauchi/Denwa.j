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

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public int getPacketRyokin() {
		return packetRyokin;
	}

}
