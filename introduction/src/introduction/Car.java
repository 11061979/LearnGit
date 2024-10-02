package introduction;

public class Car {

	static void anddd1() {
		System.out.println("static");

	}

	public void carSpeed() {
		System.out.println("The car is going with full speed");

	}

	public void speedMax(int speed) {

		System.out.println("Max speed is " + speed);
	}

	public static void main(String[] args) {
		anddd1();
		Car car = new Car();
		car.carSpeed();
		car.speedMax(200);

	}

}
