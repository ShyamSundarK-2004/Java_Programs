package com.capgemini.training;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ababcd";

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> set : map.entrySet()) {
			System.out.println(set.getKey() + "--->" + set.getValue());
		}

	}

}
