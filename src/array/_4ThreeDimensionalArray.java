package array;

public class _4ThreeDimensionalArray {

	public static void main(String[] args) {
		int[][][] ThreeDimensionarray= {{{1,2,3},{2,3,6}},{{2,3},{6,4,3},{4,8,9}}};
		for(int[][] twoDimensionArray:ThreeDimensionarray)
		{
			for(int[] oneDimensionArray:twoDimensionArray)
			{
				for(int field:oneDimensionArray)
				{
					System.out.println(field);
				}
			}
		}

	}

}
