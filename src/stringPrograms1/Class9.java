package stringPrograms1;

public class Class9 {

	public static void replaceString(String a, String b,String c)
	{
		String d=a.replace(b, c);
		System.out.println(d);
	}
	public static void main(String[] args) {
		
		replaceString("Mumbai","u","");
	}

}
