package com.sample;

public class Salary {
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

	@Override
	public String toString() {
//		return "Salary [basic=" + basic + ", da=" + da + ", hra=" + hra + ", pf=" + pf + ", gross=" + gross + ", net="
//				+ net + "]";
		return "Salary => basic: " + basic + ", da: " + da + ", hra: " + hra + ", pf: " + pf + ", gross: " + gross + ", net: "
				+ net ;
	}
	

}
