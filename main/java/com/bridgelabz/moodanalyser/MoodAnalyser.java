/**
 * 
 */
package com.bridgelabz.moodanalyser;

/**
 * @author Rachit
 *
 */
public class MoodAnalyser {

	/**
	 * @param args
	 */
	private String message;

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		message = message.toLowerCase();
		if (message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}
