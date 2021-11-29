package org.technoelevate.fundamentals;

public class methodoverloding {
public void  sum(int a,int b) {
	System.out.println(a+b);
}
	public void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main (String[]args) {
		methodoverloding m=new methodoverloding();
		m.sum(30,90);
		m.sum(30,90,80);
	}
} 

