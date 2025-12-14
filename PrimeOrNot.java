import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int ip1 = sc.nextInt();
		boolean prime = true;
		sc.close();
		if(ip1 <= 1) {
			prime = false; //given number not less than and equal to 1
		}else {	
			for(int i = 2; i < Math.sqrt(ip1); i++) { //(int i=0; i*i < = ip1; i++)
				if(ip1 % i == 0 ) {
					prime = false;
					break;
				}
			}
		}
		if(prime) {
			System.out.println(+ ip1 + " is a prime Number.");
		}else {
			System.out.println( + ip1 + " is not a prime number.");
		}
	}
}
