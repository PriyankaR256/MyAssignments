package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// to check the given input number is prime
		int num = 6;
		int i = 2;
		if (num <= 1) {
			System.out.println(num + " is not a prime number.");
		} else {
			if (i < num && num % i == 0) {
				System.out.println(num + " is not a prime number.");
			} else {
				System.out.println(num + " is a prime number.");
			}
		}
	}

}
