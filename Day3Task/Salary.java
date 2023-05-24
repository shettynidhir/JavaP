package Day3Task;

public class Salary implements SalaryInt{
	private double basic;
	private double da;
	private double hra;
	private double pf;
	private double gross;
	private double net;

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	public void calculate()
	{
		da=basic*0.12;
		hra=basic*0.10;
		pf=basic*0.11;
		gross=(basic+da+hra)-pf;
		net=basic-pf;
		
	}
	
	public void displaySal(Salary sal)
	{
		System.out.println("Salary: "+sal);
	}

	@Override
	public String toString() {
//		return "Salary [basic=" + basic + ", da=" + da + ", hra=" + hra + ", pf=" + pf + ", gross=" + gross + ", net="
//				+ net + "]";
		return " basic: " + basic + ", da: " + da + ", hra: " + hra + ", pf: " + pf + ", gross: " + gross + ", net: "
				+ net ;
	}
}
