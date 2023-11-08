package day2;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		String[] subject = { "Tamil", "English", "Computer" };
		String a = subject[1].toUpperCase();
		System.out.println(a);
		String b = subject[1].toLowerCase();
		System.out.println(b);
		int c = subject[2].length();
		System.out.println(c);
		String d = subject[1].concat(subject[2] + subject[0]);
		System.out.println(d);

		System.out.println(subject[2]);
		int[] marks = { 75, 80, 90 };
		System.out.println(marks[2]);
		float[] average = { 68.87f, 87.09f, 92.21f };
		System.out.println(average[1]);
		
		System.out.println(2023);


	
	
	}
}
