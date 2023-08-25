package garbageCollection;

public class Main {

	public static void main(String[] args) {
		GarbageCollectorEx c = new GarbageCollectorEx();
		c = null;
		System.gc();

	}

}
