package tennis_kata.tennis;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import tennis_kata.tennis.model.Player;

public class TennisGame1Test {

	private TennisGame1 tennisGame1;
	private Player player1;
	private Player player2;

	private void Initialise_All_Tests() {
		player1 = new Player("player1");
		player2 = new Player("player2");
		tennisGame1 = new TennisGame1(player1, player2);
	}

	@Before
	public void Initialise_Each_Test() {
		Initialise_All_Tests();
		tennisGame1.winPoint(player1);
		tennisGame1.winPoint(player2);
		tennisGame1.winPoint(player2);
		tennisGame1.winPoint(player1);
	}

	@Test
	public void Should_Players_Score_Be_Equal() {
		assertEquals("player1 Score : 30 && player2 Score : 30",
				tennisGame1.getScore());
	}

	@Test
	public void Should_Player1_Win() {
		tennisGame1.winPoint(player1);
		tennisGame1.winPoint(player1);
		assertEquals("player1 win the game", tennisGame1.getScore());
	}

	@Test
	public void Should_Player2Win() {
		tennisGame1.winPoint(player2);
		tennisGame1.winPoint(player2);
		assertEquals("player2 win the game", tennisGame1.getScore());
	}
}
