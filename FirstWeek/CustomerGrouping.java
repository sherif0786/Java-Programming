package JavaProgram;
import java.util.Scanner;
public class CustomerGrouping {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Age :");
		int n=scan.nextInt();
		System.out.println("if Male Press 1 and Female Press 2");
		System.out.print("Enter the Gender Code :");
		int gender=scan.nextInt();
		switch(gender) {
		case 1:
			if(n<25) System.out.println("Group 1");
			else if(n<=45) System.out.println("Group 3");
			else System.out.println("Group 5");
			break;
		case 2:
			if(n<25) System.out.println("Group 2");
			else if(n<=45) System.out.println("Group 4");
			else System.out.println("Group 5");
			break;
		
			default:
				System.out.println("Invalid Input..");
		}
	}
}
