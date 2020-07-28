package com.lams1989.sherlockandanagrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SherlockAndAnagrams {

	public static int sherlockAndAnagrams(String s) {
		int count = 0;
		for (int i = 1; i < s.length(); i++) {
			count += iteracionComparacion(i, s);
		}
		return count;
	}

	public static int iteracionComparacion(int noChar, String s) {
		int count = 0;
		for (int i = 0; i <= s.length() - noChar; i++) {
			String actual = s.substring(i, i + noChar);
			for (int j = i + 1; j <= s.length() - (noChar); j++) {
				String comparar = s.substring(j, j + noChar);
				if (isAnagram(comparar, actual) == true) {
					count++;
				}
			}

		}
		return count;
	}

	public static boolean isAnagram(String a, String b) {
		List<Integer> prueba1 = new ArrayList<Integer>();
		List<Integer> prueba2 = new ArrayList<Integer>();
		for (int i = 0; i < a.length(); i++) {
			prueba1.add((int) a.charAt(i));
		}
		Collections.sort(prueba1);
		for (int i = 0; i < b.length(); i++) {
			prueba2.add((int) b.charAt(i));
		}
		Collections.sort(prueba2);
		

		if (prueba1.equals(prueba2)) {
			return true;
		} else
			return false;

	}
}
