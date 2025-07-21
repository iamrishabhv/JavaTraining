package coreJavaTraining;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> HS = new HashSet<String>();
		HS.add("Rishabh");
		HS.add("Java");
		HS.add("India");
//		System.out.println(HS);
//		System.out.println(HS.remove("Java"));
//		System.out.println(HS.isEmpty());
//		System.out.println(HS.size());
		Iterator<String> j = HS.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}

	}

}
