package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

	@Test
	public void test1() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Pina", "Rossi", "F", "29", "Palermo"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The first name is smaller or equals in size to the last name and the participant is 30 or younger",
				result.contains(
						"The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
		assertTrue("The name of the homecity is big and the participant is younger than 30",
				result.contains("The name of the homecity is big and the participant is younger than 30"));

		
}
	@Test
	public void test2() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Simone", "Lenti", "M", "35", "Rosolini"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The first name is greater or equals in size to the last name and the participant older than 30",
				result.contains(
						"The first name is greater or equals in size to the last name and the participant older than 30"));
		assertTrue("The name of the homecity is big and the participant is 30 or older",
				result.contains("The name of the homecity is big and the participant is 30 or older"));


	}
	@Test
	public void test3() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Marco", "Rossi", "M", "30", "Noto"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The first name is smaller or equals in size to the last name and the participant is 30 or younger",
				result.contains(
						"The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
		assertTrue("The name of the homecity is small and the participant is 30 or older",
				result.contains("The name of the homecity is small and the participant is 30 or older"));

	}


	@Test
	public void test4() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Simone", "Lenti", "M", "29", "Noto"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("No analysis was performed",result.contains("No analysis was performed"));
		assertTrue("The name of the homecity is small and the participant is younger than 30",
				result.contains("The name of the homecity is small and the participant is younger than 30"));

	}
	@Test
	public void test5() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Titta", "Silvestri", "M", "31", "Siracusa"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("No analysis was performed",result.contains("No analysis was performed"));
		
}
}

