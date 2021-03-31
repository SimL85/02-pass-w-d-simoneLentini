package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

	@Test
	public void testMethod1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals(i, 1);
	}

	@Test
	public void testMethod2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Simone", "Lentini");
		assertEquals(i, 0);
	}

	@Test
	public void testMethod3() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Simone", "Lentin");
		assertEquals(i, 2);
	}

	@Test
	public void testMethod4() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals(i, 0);
	}

	@Test
	public void testMethod5() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('F');
		assertEquals(i, 1);
	}

	@Test
	public void testMethod6() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('O');
		assertEquals(i, 2);
	}

	@Test
	public void testMethod7() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(25);
		assertEquals(i, 0);
	}

	@Test
	public void testMethod8() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(26);
		assertEquals(i, 1);
	}
}
