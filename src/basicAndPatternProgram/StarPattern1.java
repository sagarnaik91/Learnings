package basicAndPatternProgram;

//Right triangle star pattern
public class StarPattern1 {

	public static void main(String[] args) {
		
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}