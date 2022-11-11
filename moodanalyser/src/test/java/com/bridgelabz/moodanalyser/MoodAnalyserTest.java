package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	 @Test
	    public void givenMessage_WhenProper_ShouldReturnSad(){
	        MoodAnalyser moodAnalyser = new MoodAnalyser();
	        String result = moodAnalyser.analyseMood("I am in Sad mood.");
	        System.out.println(result);
	        Assertions.assertEquals("Sad" , result);
	    }
	 
}
