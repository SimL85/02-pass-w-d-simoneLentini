package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {

	@Test
	public void testCalculateOutPutBasedOnNames1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals(i, 1);
	}

	@Test
	public void testCalculateOutPutBasedOnNames2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Simone", "Lentini");
		assertEquals(i, 0);
	}

	@Test
	public void testCalculateOutPutBasedOnNames3() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Simone", "Lentin");
		assertEquals(i, 2);
	}

	@Test
	public void testCalculateOutPutBasedOnGender1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals(i, 0);
	}

	@Test
	public void testCalculateOutPutBasedOnGender2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('F');
		assertEquals(i, 1);
	}

	@Test
	public void testCalculateOutPutBasedOnGender3() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('O');
		assertEquals(i, 2);
	}

	@Test
	public void testCalculateOutPutBasedOnAge1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(25);
		assertEquals(i, 0);
	}

	@Test
	public void testCalculateOutPutBasedOnAge2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(26);
		assertEquals(i, 1);
	}

	@Test
	public void testCalculateOutPutBasedOnHomeCity1() {
		Game game = new Game();
		String value = "a";
		value.equalsIgnoreCase("a");
		int i = game.calculateOutPutBasedOnHomeCity(value);

		assertEquals(i, 0);
	}

	@Test
	public void testCalculateOutPutBasedOnHomeCity2() {
		Game game = new Game();
		String value = "b";
		value.equalsIgnoreCase("b");
		int i = game.calculateOutPutBasedOnHomeCity(value);

		assertEquals(i, 1);
	}

	@Test
	public void testCalculateOutPutBasedOnHomeCity3() {
		Game game = new Game();
		String value = "c";
		value.equalsIgnoreCase("c");
		int i = game.calculateOutPutBasedOnHomeCity(value);

		assertEquals(i, 2);
	}

	@Test
	public void testCalculateOutPutBasedOnHomeCity4() {
		Game game = new Game();
		String value = "d";
		value.equalsIgnoreCase("d");
		int i = game.calculateOutPutBasedOnHomeCity(value);

		assertEquals(i, 3);
	}

	@Test
	public void testCalculateOutPutBasedOnHomeCity5() {
		Game game = new Game();
		String value = "e";
		value.equalsIgnoreCase("e");
		int i = game.calculateOutPutBasedOnHomeCity(value);

		assertEquals(i, 4);
	}

	@Test
	public void testCalculateOutPutBasedOnHomeCity6() {
		Game game = new Game();
		String value = "f";
		value.equalsIgnoreCase("f");
		int i = game.calculateOutPutBasedOnHomeCity(value);

		assertEquals(i, 5);
	}

	@Test
	public void testCalculateOutPutBasedOnHomeCity7() {
		Game game = new Game();
		String value = "g";
		value.equalsIgnoreCase("g");
		int i = game.calculateOutPutBasedOnHomeCity(value);

		assertEquals(i, 6);
	}

	@Test
	public void testCalculateOutPutBasedOnHomeCity8() {
		Game game = new Game();
		String value = "h";
		value.equalsIgnoreCase("h");
		int i = game.calculateOutPutBasedOnHomeCity(value);

		assertEquals(i, 7);
	}

	@Test
	public void testCalculateOutPutBasedOnHomeCity9() {
		Game game = new Game();
		String value = "i";
		value.equalsIgnoreCase("i");
		int i = game.calculateOutPutBasedOnHomeCity(value);

		assertEquals(i, 8);
	}

	@Test
	public void testCalculateOutPutBasedOnHomeCity10() {
		Game game = new Game();
		String value = "j";
		value.equalsIgnoreCase("j");
		int i = game.calculateOutPutBasedOnHomeCity(value);

		assertEquals(i, 9);
	}

	@Test
	public void testCalculateOutPutBasedOnHomeCity11() {
		Game game = new Game();
		String value = "z";
		value.equalsIgnoreCase("z");
		int i = game.calculateOutPutBasedOnHomeCity(value);

		assertEquals(i, 10);
	}

	@Test
	public void testRun() {

		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Simone", "Lentini", "M", "35", "Rosolini"));

		game.run(values);

		assertEquals(values.get(0), "Game");
		assertEquals(values.get(1), "Simone");
		assertEquals(values.get(2), "Lentini");
		assertEquals(game.getGenderFromInputValues(values), 'M');
		assertEquals(game.getAgeFromInputValues(values), 35);
		assertEquals(values.get(5), "Rosolini");
	}

}
