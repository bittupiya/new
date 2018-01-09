package com.maatic.harsh.practise.accessCollection;

import java.util.Arrays;
import java.util.Scanner;

public class RotationArray {
	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 8, 10, 12 };
		System.out.println("Enter number of rotation:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < a.length-1; j++) {
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < n; i++) {
			for (int j = a.length-1; j < 0; j--) {
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
		
	}

}