package com.niuke.wy2017;

import java.util.Scanner;

public class StringPian {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.printf("%.2f",getAvgLength(str));

	}
	public static float getAvgLength(String str) {
		float count = 1;
		char s = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (s != str.charAt(i)) {
				s = str.charAt(i);
				count++;
			}
		}
		return str.length() / count;
	}

}
