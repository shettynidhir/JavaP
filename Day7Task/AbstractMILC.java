package Day7Task;

public class AbstractMILC {
	int x =10;
	public void OuterMethod()
	{
		int j=90;		  	//local variable
		abstract class MinnerClass
		{
			int m=20;		//instance variable
			abstract public void minnerMethod();
		}
		
		class InhMinnerClass extends MinnerClass			//Method local inner class can be abstract
		{
			public void minnerMethod()
			{
				System.out.println("x == "+x);
				System.out.println("j == "+j);
				System.out.println("m == "+m);
			}
		}
		InhMinnerClass mic = new InhMinnerClass();
		System.out.println("--Inside Inherited class --");
		mic.minnerMethod();		
		
		System.out.println("--Inside Outer Method--");
		System.out.println("x == "+x);
		System.out.println("j == "+j);
//		System.out.println("m == "+m);			//instance variable of inner class defined inside the method  is not accessible here
		
		
	}	
	public static void main(String[] a)
	{
		AbstractMILC moc = new AbstractMILC();
		moc.OuterMethod();		
	
		
	}

}
