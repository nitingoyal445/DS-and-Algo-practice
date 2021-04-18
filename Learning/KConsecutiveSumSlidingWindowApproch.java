package com.Learning;

import java.util.Scanner;

public class KConsecutiveSumSlidingWindowApproch {

	public static void main(String[] args) {
		
		int t,n,k,sum=0,max=0;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0) {
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		k=sc.nextInt();
		
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		max=sum;
		for(int i=k;i<=n-1;i++) {
			sum+=arr[i]-arr[i-k];
			if(sum>max)
				max=sum;
		}
		System.out.println(max);
		

	}
	}
}
