package com.Learning;

import java.util.Scanner;

public class FavoriteNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fav,num,t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		fav=sc.nextInt();
		while(t-->0) {
			int count=0;
			num=sc.nextInt();
			while(num!=0) {
					int rem=num%10;
					if(rem==fav) {
						count++;
					}
					num/=10;
			}
			System.out.println(count);
		}
		}

}
