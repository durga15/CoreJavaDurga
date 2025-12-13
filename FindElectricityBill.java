import java.util.Scanner;
public class FindElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number Of Units:");
		float units = sc.nextFloat();
		if(units <= 100) {
			System.out.println("The e bill is:" + units * 7);
		}else if(units > 150 && units <= 300){
			System.out.println("The e bill is:" + units * 8);
		}else {
			System.out.println("The e bill is: " + units * 9);
		}
	}
}
