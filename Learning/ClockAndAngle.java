package com.Learning;

import java.util.Scanner;
/*
 * The idea is to take 12:00 (h = 12, m = 0) as a reference. Following are detailed steps.

1. Calculate the angle made by hour hand with respect to 12:00 in h hours and m minutes. 
2. Calculate the angle made by minute hand with respect to 12:00 in h hours and m minutes. 
3. The difference between the two angles is the angle between the two hands.

How to calculate the two angles with respect to 12:00? 
The minute hand moves 360 degrees in 60 minute(or 6 degrees in one minute) and hour hand 
moves 360 degrees in 12 hours(or 0.5 degrees in 1 minute). In h hours and m minutes, 
the minute hand would move (h*60 + m)*6 and hour hand would move (h*60 + m)*0.5.
*/
public class ClockAndAngle {

	public static void main(String[] args) {
		int t, hour, min;
	      Scanner sc=new Scanner(System.in);
	      t=sc.nextInt();
	      while(t-->0){
	        hour=sc.nextInt();
	        min=sc.nextInt();
	        if(hour==12)
	        hour=0;
	        if(min==60){
	          min=0;
	          hour+=1;
	          if(hour==12){
	            hour-=12;
	          }
	        }
	        
	        int hour_Angle=(int)(0.5*(hour*60+min));
	        int min_Angle=(int)6*min;
	        int diff;
	        if(hour_Angle>min_Angle)
	        diff=hour_Angle-min_Angle;
	        else
	        diff=min_Angle-hour_Angle;
	        
	        if((360-diff)<180)
	        diff=360-diff;
	        System.out.println(diff);  
	      }

	}

}
