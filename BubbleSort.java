package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {4,3,6,2,7,1,8,9};
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j] = temp;		
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
