package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class _7Iterator {

	public static void main(String[] args) {
		ArrayList<String> vct=new ArrayList<>();
		vct.add("dff");
		vct.add("few");
		vct.add("xsw");
		
		Iterator<String> itr=vct.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
