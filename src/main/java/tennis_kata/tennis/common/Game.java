package tennis_kata.tennis.common;

import tennis_kata.tennis.model.Player;


public interface Game {
	public String getScore();

	public void winPoint(Player player);

}
