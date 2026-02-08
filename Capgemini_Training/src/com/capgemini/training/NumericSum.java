package com.capgemini.training;

public class NumericSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ab1b2b3ab1";

		int sum = 0;

		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				sum += Integer.parseInt(String.valueOf(ch));
			}
		}

		System.out.println(sum);
	}

}
