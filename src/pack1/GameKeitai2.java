package pack1;

public class GameKeitai2 extends KeitaiDenwa implements Game {

	public GameKeitai2(String keiyaku, String bangou, String mailAddress) {
		super(keiyaku, bangou, mailAddress);
		super.kataban = "GAME-002";
	}

	@Override
	public void gemeSuru() {
		System.out.println("ブロックくずしゲームで遊びました");
	}
}
