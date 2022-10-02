package com;
public class Number {

	public static void main(String[] args) {
		
		int a= 50;
		int b= 20;
		int c= 30;
		if(a>b && a>c){
			System.out.println("a is bigger");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is bigger");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is bigger");
		}
		else{
			System.out.println("equal");
		}
	}
}
