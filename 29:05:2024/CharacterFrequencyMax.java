package humancloud;

import java.util.HashMap;
import java.util.Map.Entry;

//1	Most Frequent Character in a String	Given a string, find the character that appears the most frequently. 
//If multiple characters have the same frequency, return any one of them.
// Input = "abracadabra"	Output = 'a'


public class CharacterFrequencyMax {
	public static char characterFrequencyMax(String str) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i = 0;i<=str.length()-1;i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		int maxCount = 0;
		char maxChar = ' ';
		for(Entry<Character,Integer> entry : map.entrySet()) {
			 int value = entry.getValue();
			 
			 if(maxCount<value) {
				 maxCount = value;
				 maxChar = entry.getKey();
			 }
			 
		}
		return maxChar;
	}
public static void main(String [] args) {
	String str = "abracadabra";
	 char c = characterFrequencyMax(str);
	 System.out.println(c);
}
}
