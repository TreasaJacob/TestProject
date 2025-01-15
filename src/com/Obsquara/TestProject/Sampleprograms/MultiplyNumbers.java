package com.Obsquara.TestProject.Sampleprograms;

public class MultiplyNumbers {
	public static int multiply(int a,int b)
	{
		int m = a*b;
		return m;	
	}

	public static void main(String[] args) {
		int val = MultiplyNumbers.multiply(5, 5);
		System.out.println(val);
	}

}
