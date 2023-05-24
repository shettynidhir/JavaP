package Day3Task;


	class Employee{
		
		int empno;
		String ename;
		Salary sal=new Salary();
		

		Employee()
		{
			//this("Nidhi");
				
		}
//		Employee(String str)
//		{
//			this.ename=str;
//		}
		Employee(int a,String name)
		{
			this.empno=a;
			this.ename=name;
		//	System.out.println("Parameterized cnstructor");
		}
		public String getDetails() {
			return empno+ " -- " + ename+  " --- ";
		}
		
		
	}
	class Manager extends Employee{    //IS_A
		 String dept ="IT";
		
		 Manager()
		 {
			 super(101,"Nidhi");
			 sal.setBasic(10000);
			 sal.calculate();
			 sal.displaySal(sal);
			// System.out.println("Child default constructor");
		 }
		public String getDetails() {
		return super.getDetails() + " --- "+ dept; 
		}
		
	}

	public class MainClass {
		public static void main(String[] args) {
			Employee emp = new Employee();
			Manager mgr = new Manager();
			System.out.println(mgr.getDetails());

		}

	}

