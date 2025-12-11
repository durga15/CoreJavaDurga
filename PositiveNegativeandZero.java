import java.util.Scanner;
public class PositiveNegativeandZero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the input: ");
		int sc = input.nextInt();
		if (sc > 0) {
			System.out.println("The given Number " + sc + " is positive");
		}else if(sc < 0) {
			System.out.println("The given Number " + sc + " is negative");
		}else {
			System.out.println("The given Number " + sc + " is Zero");
		}
	}
}
