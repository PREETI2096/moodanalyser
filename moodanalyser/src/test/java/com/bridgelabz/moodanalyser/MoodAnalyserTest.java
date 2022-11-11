package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	
	 @Test
	    public void givenMessage_WhenProper_ShouldReturnSad(){
	        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad mood.");
	        String result = moodAnalyser1.analyseMood("Sad");
	        System.out.println(result);
	        Assertions.assertEquals("Sad" , result);
//	    }
//	 @Test
//	    public void givenMessage_WhenProper_ShouldReturnHappy(){
//	        MoodAnalyser moodAnalyser2 = new MoodAnalyser("Happy");
//	        String result = moodAnalyser2.analyseMood("I am in a Happy Mood");
//	        System.out.println(result);
//	        Assertions.assertEquals("Happy" , result);
	    }
}
