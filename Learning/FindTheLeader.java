package com.Learning;

import java.util.Scanner;

public class FindTheLeader {

	public static void main(String[] args) {
		int t,n,l;
	      Scanner sc=new Scanner(System.in);
	      t=sc.nextInt();
	      while(t-->0){
	        n=sc.nextInt();
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++)
	        arr[i]=sc.nextInt();
	        int max=arr[n-1];
	        System.out.print(max+" ");
	        for(int i=n-2;i>=0;i--){
	          if(arr[i]>=max){
	          System.out.print(arr[i]+" ");
	          max=arr[i];
	        }
	      }
	      System.out.println("");
	     }
	     

	}

}
