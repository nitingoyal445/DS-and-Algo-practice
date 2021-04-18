package com.Learning;

import java.util.Scanner;

public class OnePattern {

	public static void main(String[] args) {
		int n;
	      Scanner sc=new Scanner(System.in);
	      n=sc.nextInt();
	      for(int i=0;i<5;i++){
	        for(int j=0;j<=i;j++){
	          System.out.print(n+" ");
	        }
	        System.out.println();
	      }
	}

}
