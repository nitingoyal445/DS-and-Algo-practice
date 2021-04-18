package com.Learning;

import java.util.Scanner;

public class BirthdayGift {

	public static void main(String[] args) {
		int t;
		int first,fav,diff;
	      Scanner sc=new Scanner(System.in);
	      t=sc.nextInt();
	      while(t-->0){
	        first=sc.nextInt();
	        fav=sc.nextInt();
	        diff=sc.nextInt();
	        if(diff==0) {
	        	if(first==fav) {
	        		System.out.println("YES");
	        	}
	        	else
	        		System.out.println("No");
	        	}
	        else if((fav-first)%diff==0 && (fav-first)/diff>=0)
	            System.out.println("YES");
	        else
	        System.out.println("NO");
	        
	      }
	}

}
