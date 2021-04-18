package com.Learning;
import java.util.*;
import java.io.*;
class FindMissing {

	public static void main(String[] args) {
		
		   int t,n,a=0,sum=0;
		      Scanner sc=new Scanner(System.in);
		      t=sc.nextInt();
		      while(t-->0){
		      n=sc.nextInt();
		      int[] arr=new int[n-1];
		      for(int i=0;i<n-1;i++){
		        arr[i]=sc.nextInt();
		      }
		      for(int j=0;j<n-1;j++){
		    	  sum+=arr[j];
		      }
		      for(int i=1;i<=n;i++) {
		    	  a+=i;
		      }
		      System.out.println(a-sum);
		    }
	}

}
