package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// To find fibonacci series for a range (8)

		int n = 8, firstNumber = 0, secondNumber = 1;
		int thirdNumber;

		for (int i = 1; i <=n; i++) {
			System.out.print(firstNumber + " ");
			thirdNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
	}

}
