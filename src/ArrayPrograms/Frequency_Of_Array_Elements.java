package ArrayPrograms;

import java.util.HashMap;

public class Frequency_Of_Array_Elements {


		 public static void main(String args[])
		 {
			 int[] arr=new int[] {1,2,1,3,2,3,4,5,4,4};
			 HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
			 for(int i=0;i<arr.length;i++)
			 {
				 if(h.containsKey(arr[i]))
				 {
					 h.put(arr[i], h.get(arr[i])+1);
				 }
				 else
				 {
					 h.put(arr[i], 1);
				 }
				 
			 }
			 System.out.println(h);
		 }
	}


