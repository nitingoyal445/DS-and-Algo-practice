package com.Learning;

import java.util.Scanner;

public class FitSquare {

	public static void main(String[] args) {
		int t,m,n;
	      Scanner sc=new Scanner(System.in);
	      t=sc.nextInt();
	      while(t-->0){
	        m=sc.nextInt();
	        n=sc.nextInt();
	        
	        int block=(m/2)*n;
	        if(m%2==0) {
	        	System.out.println(block);
	        }
	        else {
	        	 int extra = (n/2);
	        	 System.out.println(block+extra);
	         }
	        
	      }

	}

}
