import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		Scanner ip1 = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int ip2 = ip1.nextInt();
		if(ip2 % 2 == 0) {
			System.out.println("The given number " + ip2 + " is even");
		}else {
			System.out.println("The given number " + ip2 + " is odd");
		}
	}
}
