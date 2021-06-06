package Lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>ar=new ArrayList<Integer>();
		
		ar.add(5);
		ar.add(23);
		ar.add(14);
		ar.add(66);
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(Integer in:ar) {
			hm.put(in, in*in);
			
		}
		Iterator<Integer> itr=hm.keySet().iterator();
		while(itr.hasNext()) {
			int key=(int)itr.next();
			System.out.println("No::"+key+" Square:"+hm.get(key));
		}
	}

}
