package Day7Task;



public class ScopeInner {
	int x =7;
	 class MyInner			//Inner classes can be abstract
	{
		 int y=8;
		 public void InnerMethod()
		 {
			 int z=10;
			 System.out.println("x == " + x);
			 System.out.println("y == " + y);
			 System.out.println("z== "+z);
		 }

	}
	 class InhInner extends MyInner
	 {
		 public void InhInnerMethod()
		 {
			 System.out.println("x == " + x);
			 System.out.println("y == " + y);   // can access instance variable of MyInner class
//			 System.out.println("z== "+z);   // cannot access local variable of MyInner class  
		 }
	 }
	
	public void OuterMethod()
	{
		System.out.println("From outer method = " + x);
//		System.out.println("From inner method = " + y);  //inner class instance variable cannot be accessed in the outer class
//		System.out.println("From inner method = " + z);  //inner class local variable cannot be accessed in the outer class
	}
	
	public static void main(String[] a)
	{
	
		ScopeInner mo = new ScopeInner();
		ScopeInner.MyInner mi = mo.new MyInner(); //instantiate inner class
		System.out.println("---Inside InnerMethod()----");
		mi.InnerMethod();	
		System.out.println("---Inside OuterMethod()----");
		mo.OuterMethod();
	
		ScopeInner.InhInner inh=mo.new InhInner();
		System.out.println("---Inside Inherited Class----");
		inh.InhInnerMethod();
		
	}

}
