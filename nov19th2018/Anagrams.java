package nov19th2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.print.attribute.HashAttributeSet;

public class Anagrams {

	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(buffer.readLine());

		for (int i = 0; i < t; i++) {
			String str1 = buffer.readLine();
			String str2 = buffer.readLine();

			HashMap<Character, Integer> map1 = new HashMap<>();
			HashMap<Character, Integer> map2 = new HashMap<>();
			for (int j = 0; j < str1.length(); j++) {
				map1.put(str1.charAt(j), map1.getOrDefault(str1.charAt(j), 0)+1);
			}
			for (int j = 0; j < str2.length(); j++) {
				map2.put(str2.charAt(j), map2.getOrDefault(str2.charAt(j), 0)+1);
			}
			int same=0;
			for(Entry<Character, Integer> entry:map1.entrySet()){
				if(map2.containsKey(entry.getKey())){
					same+=Math.min(entry.getValue(), map2.get(entry.getKey()));
				}
			}
			System.out.println(str1.length()+str2.length()-(same*2));

		}
	}
}
