import java.util.Scanner;

public class LargestofTwoNumbers {

	public static void main(String[] args) {
		
		 Scanner num1 = new Scanner(System.in);
		 System.out.println("Enter First Number: ");
		 int num3 = num1.nextInt();		
		 Scanner num2 = new Scanner(System.in);
		 System.out.println("Enter second Number: ");
		 int num4 = num2.nextInt();		 
		 if(num3 > num4) {
			 System.out.println("The First Number " + num3 + " is Largest");
		 }else {
			 System.out.println("The Second Number " + num4 +" is Largest");
		 }
	}
}
