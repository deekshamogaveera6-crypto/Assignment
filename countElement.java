package acharaya.com;

import java.util.Scanner;

public class countElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr size:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			}
		}
		System.out.println("Total count" + count);
	}
}