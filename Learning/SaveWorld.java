package com.Learning;

import java.util.Scanner;

public class SaveWorld {

	public static void main(String[] args) {
		int N,K;
	    String pass;
	    String key;
	    String s1;
	    Scanner sc=new Scanner(System.in);
	    N=sc.nextInt();
	    K=sc.nextInt();
	    pass=sc.next();
	    int flag=0;
	    while(K-->0){
	      key=sc.next();
	      if(key.length()<=pass.length()){
	      s1=pass.substring(0,key.length());
	      if(s1.equals(key)){
	      System.out.println("Yes");
	      flag=1;
	      break;
	      }
	      }
	    }
	    if(flag==0)
	    System.out.println("No");
	}

}
