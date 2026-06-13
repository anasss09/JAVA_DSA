package Lecture_10;

import java.util.*;

public class Insertion_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
//		int[] arr = { 4 1 5 2 9 6 7 };
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		sort(arr);
		
		for(int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void sort(int[] arr) {
		for(int i  = 0; i < arr.length; i++) {
			InsertLastElement(arr, i);
		}
	}

	public static void InsertLastElement(int[] arr, int i) {
		int item = arr[i];
		int j = i - 1;

		while (j >= 0 && arr[j] > item) {
			arr[j + 1] = arr[j];
			arr[j] = item;

			j--;
		}
	}

}
