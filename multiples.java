package acharaya.com;

public class multiples {
	public static int multiplesofnumber(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				count++;
			}
		}
		System.out.println("multiples of 5:" +count);
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 5, 10, 12, 15, 9 };
		multiplesofnumber(arr);

	}
}
