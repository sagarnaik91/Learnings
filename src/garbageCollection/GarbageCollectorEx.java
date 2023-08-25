package garbageCollection;

public class GarbageCollectorEx {

	GarbageCollectorEx() {
		System.out.println("object created");
	}

	public void finalize() {
		System.out.println("Object destroyed");
	}
	
	public static void main(String [] args)
	{
		GarbageCollectorEx c1=new GarbageCollectorEx();
		c1=null;
		GarbageCollectorEx c2=new GarbageCollectorEx();
		GarbageCollectorEx c3=new GarbageCollectorEx();
		c2=c3;
		new GarbageCollectorEx();
		System.gc();
	}

}
