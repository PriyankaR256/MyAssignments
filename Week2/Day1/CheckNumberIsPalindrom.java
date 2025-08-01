package week1.day2;

public class CheckNumberIsPalindrom {

	public static void main(String[] args) {
		//

		int input = 12121;
		int temp = input;
		int output = 0;
		int remainder;

		while (input > 0) {
			remainder = input % 10;
			output = (output * 10) + remainder;
			input = input / 10;
		}
		if (temp == output) {
			System.out.println("The Given Number " + output + " is Palindrome");
		} else {
			System.out.println("The Given Number " + output + "  is Not a Palidrome");
		}

	}

}
