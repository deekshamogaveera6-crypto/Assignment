package acharaya.com;
import java.util.Scanner;
class Arraysum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements:");
		int arr[];
		int sum = 0;
		arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
			System.out.println(sum);
	}
}
