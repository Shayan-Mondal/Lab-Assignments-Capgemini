package Lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex4 {
	
	public static HashMap<String,String> getStudents(HashMap<String,Integer>hm){
		
		HashMap<String,String>hm1=new HashMap<String,String>();
		
		Iterator<String> it=hm.keySet().iterator();
		while(it.hasNext()) {
			String key=(String)it.next();
			int value=(int)hm.get(key);
			if(value>=90) {
				hm1.put(key,"Gold");
			}
			else if(value>=80 && value<=90) {
				hm1.put(key,"Silver");
			}
			else if(value>=70 && value<=80) {
				hm1.put(key,"Bronze");
			}
		}
		return hm1;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("12016009001411",80);
		hm.put("12016009001089",90);
		hm.put("12016009001087",75);
		hm.put("12016009001111",70);
		
		HashMap<String,String> hm2=getStudents(hm);
		for(Map.Entry<String,String> entry: hm2.entrySet()) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
			
		}

	}

}
