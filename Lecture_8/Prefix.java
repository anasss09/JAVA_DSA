package Lecture_8;

public class Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 7, 9, 1, 21 };
		int[] prefixSum = new int[arr.length];
		prefixSum[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}

		for (int j = 0; j < prefixSum.length-1; j++) {
			System.out.print(prefixSum[j] + " ");
		}
	}

}
