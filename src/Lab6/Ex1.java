package Lab6;

import java.util.HashMap;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hm = new HashMap<>();
		String str = "Capgemini";
		char[] s = str.toCharArray();
		int[] freq = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j]) {
					freq[i]++;

					s[j] = '0';
				}
			}
		}

		for (int i = 0; i < freq.length; i++) {
			hm.put(s[i], freq[i]);
		}
		System.out.println(hm);

	}
}
