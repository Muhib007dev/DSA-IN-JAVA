package com.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 2, 7, 1, 8, 9 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int minIndex = minimumPos(i, n - 1, arr);
			swapIt(i, minIndex, arr);
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static int minimumPos(int start, int end, int[] arr) {
		int x = Integer.MAX_VALUE;
		int pos = start;
		for (int i = start; i <= end; i++) {
			if (x > arr[i]) {
				x = arr[i];
				pos = i;
			}
		}

		return pos;
	}

	public static void swapIt(int pos1, int pos2,int[] arr) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
	
}
