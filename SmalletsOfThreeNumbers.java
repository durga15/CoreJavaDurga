import java.util.Scanner;
public class SmalletsOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers:");
		
		int ip1 = sc.nextInt();
		int ip2 = sc.nextInt();
		int ip3 = sc.nextInt();
		
		if(ip1 < ip2 && ip1 < ip3) {
			System.out.println("The First Number " + ip1 + " is Small:");
		}else if(ip2 < ip3 && ip2 < ip1) {
			System.out.println("The Second Number " + ip2 + " is Smallest");
		}else {
			System.out.println("The Third Number" + ip3 + " is Smallest");
		}
	}
}
