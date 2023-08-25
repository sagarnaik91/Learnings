package abstractClassesAndMethods;

abstract class _5MotorBike {
	_5MotorBike() {
		System.out.println("Constructor of abstract class called");
	}

	abstract void brakes();
	static void accelerate()
	{
		System.out.println("Accelerated");
	}

}
