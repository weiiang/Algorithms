package com.niuke.wy2017;

import java.util.Scanner;

public class ReverseData {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.close();
        System.out.println(reverseData(n));
        
	}
	public static Integer reverseData(int n) {
		StringBuilder sb = new StringBuilder(n+"");
		String s = sb.reverse().toString();
		Integer reverseData = Integer.parseInt(s)+n;
		return reverseData;
	}
}
