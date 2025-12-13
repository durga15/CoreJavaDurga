import java.util.Scanner;

public class DetermineEligibiltyToVote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The person Age:");
		int age = sc.nextInt();		
		if(age >= 18) {
			System.out.println("The Person is Eligilble to Vote.");
		}else {
			System.out.println("The person is not Eligible to Vote.");
		}
	}
}
