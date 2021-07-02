package com.xyz.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		BaseballCoach t1=new BaseballCoach();
		
		TrackCoach t2=new TrackCoach();
		
		System.out.println("Baseballcoach::"+t1.getDailyWorkout());

		System.out.println("TrackCoach::"+t2.getDailyWorkout());
	}

}
