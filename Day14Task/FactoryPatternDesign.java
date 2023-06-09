package Day14Task;

interface Icar
{
	void showCar();
}
class EV implements Icar
{
	public void showCar()
	{
		System.out.println("This is an EV Icar!!");
	}
}
class Petrol implements Icar
{
	public void showCar()
	{
		System.out.println("This is a petrol Icar!!");
	}
}
class Diesel implements Icar
{
	public void showCar()
	{
		System.out.println("This is a diesel Icar!!");
	}
}

class CarFactory 
{
	public Icar getIcar(String str)
	{
		if(str==null)
			return null;
		if(str.equalsIgnoreCase("EV"))
			return new EV();
		else if(str.equalsIgnoreCase("Petrol"))
			return new Petrol();
		else if(str.equalsIgnoreCase("Diesel"))
			return new Diesel();
		
		return null;
	}
}


class FactoryPatternDesign
{
	public static void main(String args[])
	{
		
		CarFactory cf=new CarFactory();
		
		Icar ic1=cf.getIcar("EV");
		ic1.showCar();
		Icar ic2=cf.getIcar("Petrol");
		ic2.showCar();
		Icar ic3=cf.getIcar("Diesel");
		ic3.showCar();
		
	}
}