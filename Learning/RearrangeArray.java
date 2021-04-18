package com.Learning;
import java.util.*;
import java.io.*;

public class RearrangeArray {

	public static void main(String[] args) {
		
		int t,n;
		      Scanner sc=new Scanner(System.in);
		      t=sc.nextInt();
		      while(t-->0){
		        n=sc.nextInt();
		        int[] arr=new int[n];
		        for(int i=0;i<n;i++){
		          arr[i]=sc.nextInt();
		        }
		        int start=0;
		        int last=n-1;
		        for(int i=1;i<=n;i++){
		          if(i%2==1){
		          System.out.print(arr[last]+" ");
		          last--;}
		          else{
		          System.out.print(arr[start]+" ");
		          start++;}
		        }
		        System.out.println("");
		      }
	}

}
