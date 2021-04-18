package com.Learning;
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      int t;
		int first,fav,diff;
	      Scanner sc=new Scanner(System.in);
	      t=sc.nextInt();
	      while(t-->0){
	        first=sc.nextInt();
	        fav=sc.nextInt();
	        diff=sc.nextInt();
	        while(first<fav){
	          first+=diff;
	        }
	        if(first==fav){
	            System.out.println("YES");
	          }
	        else
	        System.out.println("NO");
	        
	      }
      
    }
  }