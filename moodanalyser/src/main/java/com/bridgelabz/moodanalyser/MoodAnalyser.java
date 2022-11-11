package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	
	public  String message;
	 public MoodAnalyser(String message) {
		super();
		this.message = message;

	}

	public String analyseMood(String message){
	        if (message.contains("Sad"))
	            return "Sad";
	        else if (message.contains("Happy"))
	            return "Happy";
	        else
	            return "Happy";
	    
	}
}
