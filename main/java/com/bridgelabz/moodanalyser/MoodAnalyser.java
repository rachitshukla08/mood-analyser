/**
 * 
 */
package com.bridgelabz.moodanalyser;

import com.bridgelabz.moodanalyser.MoodAnalysisException.ExceptionType;

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

	public String analyseMood() throws MoodAnalysisException {
		try {
			if(message.length()==0) 
				throw new MoodAnalysisException(ExceptionType.ENTERED_EMPTY, "Mood cannot be empty");
			message = message.toLowerCase();
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException(ExceptionType.ENTERED_NULL, "Mood cannot be null");
			//UC2.1
		}
		//UC3
	}
}
