package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	
	 @Test
	    public void givenMessage_WhenProper_ShouldReturnSad(){
	        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad mood.");
	        String result = moodAnalyser1.analyseMood();
	        System.out.println(result);
	        Assertions.assertEquals("Sad" , result);
	    }
	 @Test
	    public void givenMessage_WhenProper_ShouldReturnHappy(){
	        MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am in a Happy Mood");
	        String result = moodAnalyser2.analyseMood();
	        System.out.println(result);
	        Assertions.assertEquals("Happy" , result);
	    }
	 @Test
	    public void givenMessage_WhenNull_ShouldReturnHappy(){
	        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
	        String result = moodAnalyser.analyseMood();
	        System.out.println(result);
	        Assertions.assertEquals("HAPPY" , result);
	    }
}
