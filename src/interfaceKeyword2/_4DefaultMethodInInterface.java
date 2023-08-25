package interfaceKeyword2;

interface _4DefaultMethodInInterface {

	public void test();

	 default public void test1()
	{
		System.out.println("default method in interface");
	}
}
