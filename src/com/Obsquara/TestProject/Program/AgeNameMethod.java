package com.Obsquara.TestProject.Program;

public class AgeNameMethod {
	public void age(int a)
	{
	System.out.println("Age is :" + a);
	}
	public void name(String nam)
	{
	System.out.println("Name is :" + nam);
	}


	public static void main(String[] args) {
		
		AgeNameMethod obj = new AgeNameMethod();
		obj.age(30);
		obj.name("Treasa");
		}

	}


