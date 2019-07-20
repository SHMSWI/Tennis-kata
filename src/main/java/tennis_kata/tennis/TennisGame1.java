package tennis_kata.tennis;

import tennis_kata.tennis.common.Game;
import tennis_kata.tennis.model.Player;

/*
 * tennis game with normal rule
 */
public class TennisGame1 implements Game {
	private Player player1;
	private Player player2;

	public TennisGame1(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public String getScore() {
		String score;
		int player1Points = player1.getPoints();
		int player2Points = player2.getPoints();
		String player1Name = player1.getName();
		String player2Name = player2.getName();
		if (player1Points < 4 && player2Points < 4) {
			String[] p = new String[] { "0", "15", "30", "40" };
			score = p[player1Points];
			return (player1Points == player2Points) ? player1Name + " Score : "
					+ score + " && " + player2Name + " Score : " + score
					: player1Name + " Score : " + score + " && " + player2Name
							+ " Score : " + p[player2Points];
		} else {
			if (player1Points > player2Points) {
				return player1Name + " win the game";
			} else {
				return player2Name + " win the game";
			}
		}
	}

	public void winPoint(Player player) {
		if ("player1".equals(player.getName())) {
			this.player1.addPoints();
		} else {
			this.player2.addPoints();
		}
	}
}
