package april.FileHandling_Concepts;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringFreq {
	public static void main(String[] args) {
		Map<Character, Integer> freqMap = new LinkedHashMap<>();
		String str = "cdacbea";
		for (char ch : str.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
		}
		char maxChar = '\0';
		int maxFreq = -1;
		for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			char key = entry.getKey();
			int value = entry.getValue();

			if (value > maxFreq) {
				maxFreq = value;
				maxChar = key;
			}
		}
		System.out.println(maxChar + " " + maxFreq);
	}
}
