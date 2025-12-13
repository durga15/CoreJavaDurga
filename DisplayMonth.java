import java.util.Scanner;
public class DisplayMonth {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Month Between 1-12:");
	int Month = sc.nextInt();
	switch(Month) {
	case 1: 
		System.out.println("The Month is January");
		break;
	case 2:
		System.out.println("The Month is Febuary");
		break;
	case 3:
		System.out.println("This Month is March");
		break;
	case 4:
		System.out.println("This Month is April");
		break;
	case 5:
		System.out.println("This Month is May");
		break;
	case 6:
		System.out.println("This Month is June");
		break;
	case 7:	
		System.out.println("This Month is July");
		break;
	case 8:
		System.out.println("This Month is August");
		break;
	case 9:
		System.out.println("This Month is September");
		break;
	case 10:
		System.out.println("This Month is October");
		break;
	case 11:
		System.out.println("This Month is November");
		break;
	case 12:
		System.out.println("This Month is December");
		break;
	default:
		System.out.println("This Number is invalid");
	}
	}
}
