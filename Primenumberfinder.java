package acharaya.com;

public class Primenumberfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100;
		System.out.println("The prime numbers are:");
		for(int i=2;i<=num;i++) {
				if(isPrime(i)) {
					System.out.println(i);
				}
			}
		}
		
public static boolean isPrime(int n) {
	if(n<=1)
		return false;
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0)
			return false;
	}
			return true;
	}
}
	