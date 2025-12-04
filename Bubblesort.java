package acharaya.com;

public class Bubblesort {

	static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("after Sorted array:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "");
		}
	}

	public static void main(String args[]) {
		int arr[] = { 7, 9, 8, 5, 2, 1, 6 };
		System.out.println("array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		bubbleSort(arr);
	}
}
