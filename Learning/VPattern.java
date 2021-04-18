package com.Learning;

import java.util.Scanner;

public class VPattern {

	public static void main(String[] args) {
		String ch;
	      Scanner sc=new Scanner(System.in);
	      ch=sc.next();
	      for(int i=1;i<=5;i++){
	        for(int j=1;j<=i;j++){
	          System.out.print(j);
	        }
	        for(int m=4;m>=i;m--) {
	        	System.out.print("  ");
	        }
	        for(int k=i;k>0;k--) {
	        	System.out.print(k);
	        }
	        System.out.println();
	      }

	}

}
