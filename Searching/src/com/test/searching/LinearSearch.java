package com.test.searching;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[] = {9,3,5,1,6};
		int elementToSearch = 10;
		boolean elementFoundOrNot = searchArray(arr,elementToSearch);
		String result =  elementFoundOrNot ?  "Element Found" : "Element Not Found";
		System.out.println(result);
	}

	private static boolean searchArray(int[] arr, int elementToSearch) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == elementToSearch) {
				return true;
			}
		}
		return false;
	}
	
	
}
