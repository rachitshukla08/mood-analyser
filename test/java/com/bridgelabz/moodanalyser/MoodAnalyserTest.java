package com.bridgelabz.moodanalyser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class MoodAnalyserTest {
    /**
     * Rigorous Test :-)
     */
	private MoodAnalyser moodAnalyser;
	
	@Before
	public void init() {
		moodAnalyser = new MoodAnalyser();
	}
	@Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
    	String mood = moodAnalyser.analyseMood("This is a sad message");
        assertEquals("SAD", mood);
    }
    public void givenMessage_WhenNotSad_ShouldReturnHappy(){
    	String mood = moodAnalyser.analyseMood("This is a happy message");
        assertEquals("HAPPY", mood);
    }
}
