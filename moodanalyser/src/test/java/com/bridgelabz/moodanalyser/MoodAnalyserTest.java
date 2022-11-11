package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	 @Test
	    public void givenMessage_WhenProper_ShouldReturnHappy(){
	        MoodAnalyser moodAnalyser = new MoodAnalyser();
	        String result = moodAnalyser.analyseMood("I am in a Happy Mood");
	        System.out.println(result);
	        Assertions.assertEquals("Happy" , result);
	    }
}
