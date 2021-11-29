package org.technoelevate.fundamentals;

import java.util.Scanner;

public class Tr {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		System.out.println("enter values");
		int []a=new int[5];
	
		for(int i=0;i<a.length; i++){
			a[i]=scan.nextInt();
		}
		System.out.println("below values ");
		  for(int j=0;j<a.length;j++) {
			  System.out.println(a[j]);
		  }
		  
		  
		    boolean flag=true;
		     while(flag){
			   flag=false;
			   int temp=0;
			for(int i=0;i<a.length-1;i++) {
				   if( a[i] < a[i+1]) {
					   temp=a[i];
					   a[i]=a[i+1];
					   a[i+1]=temp;
					   flag=true;
				   }	   
				   System.out.println(a[i]);
			}
			
		
	}
	}
}


