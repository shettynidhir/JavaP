package com.dailytask;

class AreaPerimeter
{
	int length=20,breadth=30;
	public void area()
	{
		
		System.out.println("Area of rectangle: "+length*breadth);
	}
	
	public void perimeter()
	{
		
		System.out.println("Perimeter of rectangle: "+2*(length+breadth));
	}
}
public class Day1Task
{

	public static void main(String[] args)
	{
		
		AreaPerimeter ap1=new AreaPerimeter();
		AreaPerimeter ap2=new AreaPerimeter();
		System.out.println("Function calling through instance 1: ");
		ap1.area();
		ap1.perimeter();
		System.out.println("Function calling through instance 2: ");
		ap2.area();
		ap2.perimeter();
		
		
	}

}
