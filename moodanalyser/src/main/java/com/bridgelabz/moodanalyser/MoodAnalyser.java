package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	 public String analyseMood(String message){
	        if (message.contains("Sad"))
	            return "Sad";
	        else if (message.contains("Happy"))
	            return "Happy";
	        else
	            return null;
	    }
	 public static void main(String[] args) {
		 MoodAnalyser m = new MoodAnalyser();
		String mood = m.analyseMood("Sad");
		System.out.println(mood);
		 mood = m.analyseMood("Happy");
		System.out.println(mood);
		
	}
}
