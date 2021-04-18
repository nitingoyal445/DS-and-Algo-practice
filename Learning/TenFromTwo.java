package com.Learning;

import java.util.Scanner;

public class TenFromTwo {
//Not correct
	public static void main(String[] args) {
		int t,n,op;
	      Scanner sc=new Scanner(System.in);
	      t=sc.nextInt();
	      while(t-->0){
	        n=sc.nextInt();
	        op=0;
	        while((n%10)!=0){
	          n*=2;
	          op++;
	        }
	        if(op==31) {
	        System.out.println(-1);}
	        else
	        System.out.println(op);
	      }

	}

}
