package Day15Task;

import java.util.Scanner;

interface I_tlight {
	void switchOn(TrafficLight tl);

	void switchOff(TrafficLight tl);

}

class TrafficLight {
	private I_tlight tstate;

	public TrafficLight() // sets initial state
	{
		tstate = new redState();

	}

	public void setState(I_tlight tstate) {
		this.tstate = tstate;
	}

	public void onTrafficLight() {
		tstate.switchOn(this);
	}

	public void offTrafficLight() {
		tstate.switchOff(this);
	}

}

class redState implements I_tlight {
	public void switchOn(TrafficLight tl) {
		System.out.println("Red light is already on!!");
	}

	public void switchOff(TrafficLight tl) {
		System.out.println("Switching yellow light on..");
		tl.setState(new yellowState());
	}
}

class yellowState implements I_tlight {
	public void switchOn(TrafficLight tl) {
		System.out.println("Yellow light is already on!!");
	}

	public void switchOff(TrafficLight tl) {
		System.out.println("Switching green light on..");
		tl.setState(new greenLight());
	}

}

class greenLight implements I_tlight {
	public void switchOn(TrafficLight tl) {
		System.out.println("Green light is already on!!");
	}

	public void switchOff(TrafficLight tl) {
		System.out.println("Traffic cleared");
		System.exit(0);
		// tl.setState(new greenLight());
	}
}

public class TrafficLightExample {

	public static void main(String args[]) {
		int ch;
		String choice;
		Scanner sc = new Scanner(System.in);
		TrafficLight tf = new TrafficLight();
		System.out.println("---------Traffic light is red-----------");
		do {
			System.out.println("1. Red\t2. Yellow\t3. Green\nEnter your choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("1.On\t2.Off\nEnter your choice: ");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					tf.onTrafficLight();
					break;
				case 2:
					tf.offTrafficLight();
					break;

				}

				break;

			case 2:
				System.out.println("1.On\t2.Off\nEnter your choice: ");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					tf.onTrafficLight();
					break;
				case 2:
					tf.offTrafficLight();
					break;

				}
				break;
			case 3:
				System.out.println("1.On\t2.Off\nEnter your choice: ");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					tf.onTrafficLight();
					break;
				case 2:
					tf.offTrafficLight();
					break;

				}

				break;

			}

			System.out.println("Do you want to continue!!  Press (Y/N)");
			choice = sc.next();

		} while (choice.equals("y") || choice.equals("Y"));

	}
}
