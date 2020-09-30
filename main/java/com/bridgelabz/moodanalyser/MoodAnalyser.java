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
	//UC1

	public String analyseMood() {
		try {
			message = message.toLowerCase();
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch(NullPointerException e) {
			return "HAPPY";
			//UC2.1
		}
		//UC2
	}
}
