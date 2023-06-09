package com.dedalus;

class Child
{
	public void display()
	{
		System.out.println("Inside Display!!");
	}
}

public class MyClass {
int z=100;
	public static void main(String[] args) {
		Child mc=new Child();
//		System.out.println("Welcome " + mc.z);
		mc.display();

	}
	
	

}
