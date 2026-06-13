package Lecture_10;

import java.util.*;

public class bubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		bubbleSortData(arr);
		
		for (int i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static void bubbleSortData(int[] arr) {

		int n = arr.length;

		for (int len = 1; len < n; len++) {
			for (int i = 0; i < n - len; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

}
