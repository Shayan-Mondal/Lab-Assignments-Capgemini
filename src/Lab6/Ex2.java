package Lab6;

import java.util.HashMap;

import java.util.Iterator;
import java.util.TreeMap;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(16, "A");
		hm.put(20, "B");
		hm.put(5, "Z");
		hm.put(60, "S");

		Iterator<Integer> it = hm.keySet().iterator();

		System.out.println("Before Sorting!!");
		while (it.hasNext()) {
			int key = (int) it.next();
			System.out.println("Roll No:" + key + " Name:" + hm.get(key));
		}

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm);

		Iterator<Integer> itr = tm.keySet().iterator();

		System.out.println("After Sorting!!");
		while (itr.hasNext()) {
			int key = (int) itr.next();
			System.out.println("Roll No:" + key + " Name:" + hm.get(key));
		}
	}

}
