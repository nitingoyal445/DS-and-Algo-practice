package com.Learning;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		 int t,n;
	     Scanner sc=new Scanner(System.in);
	     t=sc.nextInt();
	     while(t-->0){
	       n=sc.nextInt();
	       if(n%400==0)
	       System.out.println("Yes");
	       else if(n%100==0)
	       System.out.println("No");
	       else if(n%4==0)
	       System.out.println("Yes");
	       else
	    	   System.out.println("No");
	     }
	}

}
