package com.Obsquara.TestProject.Program;

public class Average {
	public void avg(int a,int b, int c)
	{
	int sum = a+b+c;
	int avg = sum/3;
	System.out.println("Average of  given numbers :" +avg);
	}

	public static void main(String[] args) {
		Average obj = new Average();
		obj.avg(10,20,30);


	}

}
