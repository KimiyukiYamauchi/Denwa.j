package pack1;

public class GameKeitai1 extends KeitaiDenwa implements Game {

	public GameKeitai1(String keiyaku, String bangou, String mailAddress) {
		super(keiyaku, bangou, mailAddress);
		super.kataban = "GAME-001";
	}

	@Override
	public void gemeSuru() {
		System.out.println("もぐらたたきゲームで遊びました");
	}

}
