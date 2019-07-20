package tennis_kata.tennis.model;

public class Player {
	private String playerName;
	private int points;

	public Player(String playerName) {
		this.playerName = playerName;
	}

	public String getName() {
		return playerName;
	}

	public void setName(String playerName) {
		this.playerName = playerName;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public void addPoints() {
		this.points += 1;
	}
}
