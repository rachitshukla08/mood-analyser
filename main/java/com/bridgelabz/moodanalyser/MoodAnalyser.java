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
	public String analyseMood(String message) {
		if(message.contains("sad"))
			return "SAD";
		else 
			return "HAPPY";
	}
	public static void main(String[] args) {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		System.out.println(moodAnalyser.analyseMood("I am happy"));
	}
}
