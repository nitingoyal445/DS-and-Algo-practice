package com.Learning;
import java.util.*;
import java.io.*;
public class OperationOnMatrix {

	public static void main(String[] args) {
		      
		      int m,n;
		      Scanner sc=new Scanner(System.in);
		      m=sc.nextInt();
		      n=sc.nextInt();
		      int arr1[][]= new int[m][n];
		      int arr2[][]= new int[m][n];
		      int sum[][] = new int[m][n];
		      int mul[][]=new int[m][n];
		      
		      for(int i=0;i<m;i++){
		        for(int j=0;j<n;j++){
		          arr1[i][j]=sc.nextInt();
		        }
		      }
		      for(int i=0;i<m;i++){
		        for(int j=0;j<n;j++){
		          arr2[i][j]=sc.nextInt();
		        }
		      }
		      for(int i=0;i<m;i++){
		      for(int j=0;j<n;j++){
		        sum[i][j]=arr1[i][j]+arr2[i][j];
		        System.out.print(sum[i][j]+" ");
		        mul[i][j]=0;
		      for(int k=0;k<m;k++){
		        mul[i][j]+=arr1[i][k]*arr2[k][j];
		      }
		      }
		      System.out.println("");
		      }
		      /*for(int i=0;i<m;i++){
		      for(int j=0;j<n;j++){
		        System.out.print(sum[i][j]+" ");
		      }
		      System.out.println("");
		      }*/
		      for(int i=0;i<m;i++){
		      for(int j=0;j<n;j++){
		        System.out.print(mul[i][j]+" ");
		      }
		      System.out.println("");
		      }
		    }

}
