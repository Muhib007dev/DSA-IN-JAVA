package com.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {5,7,6,4,8,9,3,1,2};
		int n = arr.length;
		for(int i = 1 ; i < n ; i++) {
			int j = i-1;
			int key = arr[i];
			while(j>=0&&key<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[++j]=key;
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
