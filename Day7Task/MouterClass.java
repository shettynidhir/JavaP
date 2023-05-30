package Day7Task;

class MouterClass
{
	int x =10;
	public void OuterMethod()
	{
		int j=90;		  	//local variable
		class MinnerClass
		{
			int m=20;		//instance variable
			public void minnerMethod()
			{
				
			System.out.println("x == "+x);
			System.out.println("j == "+j);
			System.out.println("m == "+m);
			}
		}
		MinnerClass mic = new MinnerClass();
		System.out.println("--Inside Minner Method--");
		mic.minnerMethod();		
		
		System.out.println("--Inside Outer Method--");
		System.out.println("x == "+x);
		System.out.println("j == "+j);
//		System.out.println("m == "+m);			//instance variable of inner class defined inside the method  is not accessible here
		
		
	}	
	public static void main(String[] a)
	{
		MouterClass moc = new MouterClass();
		moc.OuterMethod();		
	
	
	}
}
