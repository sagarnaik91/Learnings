package lambdaExpression;

public class MainFactorial {

	public static void main(String[] args) {
		Factorial f1=(n)->
		{
			int factNum=1;
			for(int i=1;i<=n;i++)
			{
				factNum=i*factNum;
			}
			System.out.println(factNum);
			
		};
		
		f1.fact(3);

	}

}
