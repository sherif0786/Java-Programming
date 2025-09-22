package DsaJavaProgramming;
import java.util.Scanner;
public class FindLeapYearorNotProgram {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter the Year :");
			int year=scan.nextInt();
			if(year%400==0 || year%100!=0 && year%4==0) {
				System.out.println("Leap year");
			}
			else {
				System.out.println("No leap year");
			}
		}
		catch(Exception e) {
			System.out.println(" Retry..Enter Valid Input..!");
		}
	}
}
