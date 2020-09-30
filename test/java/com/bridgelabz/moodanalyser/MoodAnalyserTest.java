package com.bridgelabz.moodanalyser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MoodAnalyserTest {
	/**
	 * Rigorous Test :-)
	 */

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("SAD", mood);
	}
	//UC1.1

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}
	//UC1.2
	
	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}
	//UC2
}
