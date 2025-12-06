package acharaya.com;
import java.util.Scanner;

public class TrulygreatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a a number");
		int a=sc.nextInt();
		System.out.println("Enetr the second number");
		int b=sc.nextInt();
		if(a==6&&b==6 || b==6||(a+b==6)||(a-b==6)) {
			System.out.println("true");
		}else {
				System.out.println("false");
			
		}

	}

}
