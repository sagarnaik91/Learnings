package lambdaExpression;

public class MainReverse {

	public static void main(String[] args) {
		ReverseString rvr=(str)->
		{
			String s="";
			for(int i=str.length()-1;i>=0;i--)
			{
				s=s+str.charAt(i);
			}
			System.out.println(s);
		};
		rvr.reverse("qwerty");

	}

}
