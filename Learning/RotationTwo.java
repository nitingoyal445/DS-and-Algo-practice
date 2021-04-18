package com.Learning;

import java.util.Scanner;

//Left Rotation 2 times
public class RotationTwo {

	public static void main(String[] args) {
		
		int T;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		int r=2;
		while(T-->0) {
			String str=new String(sc.next());
			char ch[]=str.toCharArray();
			int n=str.length();
			r=r%n;
			reverseArray(ch,0,r-1);
			reverseArray(ch,r,n-1);
			reverseArray(ch,0,n-1);
			
			for (int i = 0; i < ch.length; i++) 
	            System.out.print(ch[i]); 
		}

	}
	static void reverseArray(char[] ch,int start,int end){
		
		char temp;
		while(start<end) {
			temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
		
	}
}
