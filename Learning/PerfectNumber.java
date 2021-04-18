package com.Learning;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int t,n;
	      Scanner sc=new Scanner(System.in);
	      t=sc.nextInt();
	      while(t-->0){
	        int sum=0;
	        n=sc.nextInt();
	        for(int i=1;i<=n/2;i++){
	          if(n%i==0){
	            sum+=i;
	          }
	        }
	        if(sum==n)
	        System.out.println("true");
	        else
	        System.out.println("false");
	}

}
}
