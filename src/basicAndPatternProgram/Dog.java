package basicAndPatternProgram;

public class Dog extends Animal {

	public void dogBehaviour() {

		try {
			System.out.println("My name is" + " " + name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// This is an example of method overriding in inhertance.It overrides the method
	// in super class
	protected void behaviour() {
		super.behaviour();// This is example of super keyword in inheritance. super keyword also executes
							// the method in super class.
		System.out.println("I" + " " + name + " " + "well behaved");
	}

}
