package acharaya.com;
import java.util.Scanner;

public class CricketScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first team score: ");
        int firstteam = sc.nextInt();

        System.out.print("Enter second team score: ");
        int secondteam = sc.nextInt();

        if (secondteam > firstteam + 6) {
            System.out.println("Invalid");
        } else if (secondteam > firstteam) {
            System.out.println("Second team wins");
        } else if (secondteam == firstteam) {
            System.out.println("Draw");
        } else {
            System.out.println("First team wins");
        }

        sc.close();
    }
}
