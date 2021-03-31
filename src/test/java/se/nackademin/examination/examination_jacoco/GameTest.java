package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

	@Test
	public void testMethod1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals( i, 1);
	}
	@Test
	public void testMethod2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Simone", "Lentini");
		assertEquals( i, 0);
	}
	@Test
	public void testMethod3() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Simone", "Lentin");
		assertEquals( i, 2);
	}

}
