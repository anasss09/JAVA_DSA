package Lecture_8;

import java.util.*;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 12, 32, 45, 12, 87, 25 };

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(linearSearch(arr, num));

	}

	public static int linearSearch(int[] arr, int num) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.print("Found in index: ");
				return i;
			}
		}
		return -1;
	}
}
