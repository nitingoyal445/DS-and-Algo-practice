package com.Learning;

import java.util.Scanner;

public class HouseNumber {

	public static void main(String[] args) {
		long t,n,digit;
		
	      Scanner sc=new Scanner(System.in);
	      t=sc.nextInt();
	      while(t-->0){
	    	  digit=0;
	    	  n=sc.nextInt();
	        while(n-->0) {
	        	String s=String.valueOf(n);
	            digit+=s.length();
	        }
	        System.out.println(digit+1);
	      }
	}

}
