package acharaya.com;

public class ArrayWithoutloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 6, 7, 8 };
		boolean result = arr.length > 0 && (arr[0] ==6|| arr[arr.length - 1] == 6);
		System.out.println(result);
	}

}
