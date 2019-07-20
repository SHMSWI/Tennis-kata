package tennis_kata.tennis;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import tennis_kata.tennis.model.Player;

public class TennisGame2Test {

	private TennisGame2 tennisGame2;
	private Player player1;
	private Player player2;

	private void Initialise_All_Tests() {
		player1 = new Player("player1");
		player2 = new Player("player2");
		tennisGame2 = new TennisGame2(player1, player2);
	}

	@Before
	public void Initialise_Each_Test() {
		Initialise_All_Tests();
		tennisGame2.winPoint(player1);
		tennisGame2.winPoint(player2);
	}

	@Test
	public void Should_Players_Score_Be_Equal() {
		assertEquals("player1 Score : 15 && player2 Score : 15",
				tennisGame2.getScore());
	}

	@Test
	public void Should_Player1_Score_More_Than_Player2_Score() {
		tennisGame2.winPoint(player1);
		assertEquals("player1 Score : 30 && player2 Score : 15",
				tennisGame2.getScore());
	}

	@Test
	public void Should_Player2_Take_Advantage() {
		setScoresToForty();
		tennisGame2.winPoint(player2);
		assertEquals("ADV for player2", tennisGame2.getScore());
	}

	@Test
	public void Should_Players_Score_be_Deuce() {
		setScoresToForty();
		tennisGame2.winPoint(player2);
		tennisGame2.winPoint(player1);
		assertEquals("player1 Score : DEUCE && player2 Score : DEUCE",
				tennisGame2.getScore());
	}

	@Test
	public void Should_Player1_Take_Advantage_After_Deuce() {
		setScoresToForty();
		tennisGame2.winPoint(player2);
		tennisGame2.winPoint(player1);
		tennisGame2.winPoint(player1);
		assertEquals("ADV for player1", tennisGame2.getScore());
	}

	@Test
	public void Should_Player1_Win() {
		setScoresToForty();
		tennisGame2.winPoint(player2);
		tennisGame2.winPoint(player1);
		tennisGame2.winPoint(player1);
		tennisGame2.winPoint(player1);
		tennisGame2.winPoint(player1);
		tennisGame2.winPoint(player1);
		assertEquals("player1 win the game", tennisGame2.getScore());
	}

	private void setScoresToForty() {
		tennisGame2.winPoint(player1);
		tennisGame2.winPoint(player1);
		tennisGame2.winPoint(player2);
		tennisGame2.winPoint(player2);
	}
}
