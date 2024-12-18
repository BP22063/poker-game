import java.util.ArrayList;

public class Dealer {

	private ArrayList<Player> players;

	private int fieldbetChip;

	private Deck deck;

	private ArrayList<Player> rankList;

	private ArrayList<String> disableHands;

	private ArrayList<Integer> usedSkills;

	private Deck 山札;

	private RoleControl 役管理;

	private Player[] プレイヤーリスト;

	private Skill_handSwap  skill_handSwap ;

	private Skill_disableHand skill_disableHand;


	private Skill_exchangingHandsAgain skill_exchangingHandsAgain;

	public void decideOrder() {

	}

	public void provideSkill(int Skill) {

	}

	public void collectInitialChip() {

	}

	public void provideCard() {

	}

	public void changeCard(int playerIndex, int cardIndex) {

	}

	public void provideChip(Player players) {

	}

	private void adaptSkill() {

	}

	public void useSkills() {

	}

	public void sendApplicationCommunication(String JSON) {

	}

	public void performAction(int userID, int actionNumber, int betChip) {

	}

	public void sendCardInformation() {

	}

	public void addPlayer(Player players) {

	}

	public void dealInitialCard(int cardPerPlayer) {

	}

	public void showAllHands() {

	}

	public void checkLostUser(ArrayList<Player> players, ArrayList<Player> rankList) {

	}

	public void addDisableHands(String hand) {

	}

	public void addUsedSkill(int skill) {

	}

	public void checkPlayersList(ArrayList<Player> players) {

	}

}
