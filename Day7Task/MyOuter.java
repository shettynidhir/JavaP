package Day7Task;

//Inheriting inner class within outer class
public class MyOuter {
	int x =7;
	abstract class MyInner			//Inner classes can be abstract
	{
		abstract public void InnerMethod();

	}
	
	class InhInner extends MyInner
	{
		public void InnerMethod()
		{
				System.out.println("x == " + x);
			
		}
	}
	public void OuterMethod()
	{
		System.out.println("From outer method = " + x);

	}
	
	public static void main(String[] a)
	{
	
	MyOuter mo = new MyOuter();
	MyOuter.InhInner mi = mo.new InhInner();   //instantiating InhInner which extends the MyInner class
	mi.InnerMethod();
	mo.OuterMethod();
	
		
	}

}


//***********************************************************************
//Inheriting inner class outside outer class

// class Outer {
//	int x =7;
//	abstract class MyInner
//	{
//		int x=8;
//		abstract public void InnerMethod();
//
//	}
//	
//	public void OuterMethod()
//	{
//		System.out.println("From outer method = " + x);
//
//	}
//	
//
//}
//class InhInner extends Outer.MyInner
//{
//	public InhInner()
//	{
//		new Outer().super();
//	}
//	public void InnerMethod()
//	{
//			System.out.println("x == " + x);
//		
//	}
//}
//
//public class MyOuter
//{
//	public static void main(String[] a)
//	{
//	
//	Outer mo = new Outer();
//	InhInner in=new InhInner();
//	in.InnerMethod();
//	mo.OuterMethod();
//	
//		
//	}
//}





