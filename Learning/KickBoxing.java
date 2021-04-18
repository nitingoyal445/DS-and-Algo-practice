package com.Learning;

import java.util.Scanner;

public class KickBoxing {

	public static void main(String[] args) {
		
		int T,N,q,X;
		String str;
		int index,ind;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		while(T-->0){
		N=sc.nextInt();
		str=sc.next();
		q=sc.nextInt();
		while(q-->0) {
			index=0;
			X=sc.nextInt();
			while(X-->0) {
			index=str.indexOf('p',index);
			index++;
			}
			if(index>0)
				System.out.println(index--);
			else
				System.out.println("-1");
		}
  }
  
	}

}
