package com.biz.euler;
public class Fibonacci {

	public static void main(String[]args) {
	
	/*	int num1st= 1;
	int num2nd = 2;
	int fibNum = num2nd;

	System.out.println(num1st);
	System.out.println(num2nd);
	
	int intSum = num1st + num2nd;
	while(true) {
		fibNum = num1st + num2nd;
		System.out.println(fibNum);
		if(fibNum > 100) break;
		intSum += fibNum;
		
		num1st = num2nd;
		num2nd = fibNum;
	}

	System.out.println("합 " + intSum); 
	이것은 1부터 100까지의 합
	*/
		
	int num1st= 1;
	int num2nd = 2;
	int fibNum = num2nd;
	while(true) {
		fibNum = num1st + num2nd;
		if(fibNum > 1000) break;

		System.out.println(fibNum);
		if(fibNum % 2 == 0) {
			
		}
	System.out.println(num1st);
	System.out.println(num2nd);
	
	int intSum = num1st + num2nd;
	while(true) {
		fibNum = num1st + num2nd;
		System.out.println(fibNum);
		if(fibNum > 100) break;
		intSum += fibNum;
		
		num1st = num2nd;
		num2nd = fibNum;
	}

	System.out.println("합 " + intSum);
}
}
}