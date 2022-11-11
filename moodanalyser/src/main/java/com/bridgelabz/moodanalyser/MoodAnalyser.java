package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	
	public  String message;
	 public MoodAnalyser(String message) {
		super();
		this.message = message;

	}

	public String analyseMood(){
		 try{
	            if (message.contains("Sad"))
	                return "SAD";
	            else if (message.contains("Happy"))
	                return "HAPPY";
	            else
	                return "HAPPY";

	        }catch (NullPointerException e){
	            System.out.println("Please Enter the Valid Mood.");
	        }
	        return "";
	    }
	}

