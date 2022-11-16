package com.akash.git;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		HashMap hm =new HashMap();
		hm.put(120, "Akash");
		hm.put(230, "tango");
		hm.put(320, "Charlie");
		System.out.println(hm);
		//for iterating
		Set s=hm.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Object i=itr.next();
			System.out.println("key="+i+ " value"+hm.get(i));
		}
	}

}
