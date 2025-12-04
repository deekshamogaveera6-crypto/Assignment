package acharaya.com;

public class multiplearray {
	public static int printmultiples(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				count++;
			}
		}
		System.out.println("multiples of three:" + count);
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 3, 6, 12, 8, 9 };
		printmultiples(arr);

	}
}
