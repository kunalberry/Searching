package com.test.searching;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 10, 12, 16 };
		int elementToBeSearch = 4;
		int firstIndex = 0;
		int lastIndex = arr.length - 1;

		int result = searchElement(arr, firstIndex, lastIndex, elementToBeSearch);

		if (result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index : " + result);
		}

	}

	private static int searchElement(int[] arr, int firstIndex, int lastIndex, int elementToBeSearch) {

		if (lastIndex >= firstIndex) {
			// Calculating the mid of the array from first and last indexes
			int mid = (firstIndex + lastIndex) / 2;

			//element to compare with mid of the array
			if (arr[mid] == elementToBeSearch) {
				return mid;
			} else {
				// if the mid value is greater than elementToSearch 
				if (arr[mid] > elementToBeSearch) {
					//then mid-1 from the last position
					return searchElement(arr, firstIndex, mid - 1, elementToBeSearch);
				} else {
					//then mid + 1 from the first position
					return searchElement(arr, mid + 1, lastIndex, elementToBeSearch);
				}
			}
		}
		return -1;
	}
}
