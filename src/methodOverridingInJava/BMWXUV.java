package methodOverridingInJava;

import methodOverloading.BMW;

//Inheritence works even if the class is in the different package. In this case it is using the class BMW in package methodOverriding in java
public class BMWXUV {

	/** Method overriding is not applicable for static and final block **/
	/** super keyword cannot be used in static block **/
	public static void main(String[] args) {
		BMW bmw = new BMW();
		bmw.name = "X6";
		bmw.features();

	}

}
