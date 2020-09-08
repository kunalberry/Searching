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
			int mid = (firstIndex + lastIndex) / 2;

			if (arr[mid] == elementToBeSearch) {
				return mid;
			} else {
				if (arr[mid] > elementToBeSearch) {
					return searchElement(arr, firstIndex, mid - 1, elementToBeSearch);
				} else {
					return searchElement(arr, mid + 1, lastIndex, elementToBeSearch);
				}
			}
		}
		return -1;
	}
}
