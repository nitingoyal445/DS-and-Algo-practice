package com.Learning;
import java.util.*;
import java.io.*;

   
public class LowerUpperTriangleMatrix {

	public static void main(String[] args) {
		 
		      int m,n;
		      Scanner sc=new Scanner(System.in);
		      m=sc.nextInt();
		      n=sc.nextInt();
		      int[][] arr=new int[m][n];
		      for(int i=0;i<m;i++){
		        for(int j=0;j<n;j++){
		          arr[i][j]=sc.nextInt();
		        }
		      }
		      for(int i=0;i<m;i++){
		        for(int j=0;j<n;j++){
		          if(j<=i)
		          System.out.print(arr[i][j]+" ");
		          else 
		          System.out.print("0"+" ");
		        }
		        System.out.println("");
		      }
		      for(int i=0;i<m;i++){
		        for(int j=0;j<n;j++){
		          if(i<=j)
		          System.out.print(arr[i][j]+" ");
		          else 
		          System.out.print("0"+" ");
		        }
		        System.out.println("");
		      }
		     

	}

}
