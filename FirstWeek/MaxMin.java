package FirstWeek;
import java.util.Scanner;
public class MaxMin {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("How many Numbers to Print :");
		int n2=scan.nextInt();
		System.out.print("Enter the 1 Number :");
		int n=scan.nextInt();
		int max=n;
		int min=n;
		for(int i=2;i<=n2;i++) {
			System.out.print("Enter the "+i+" Number :");
			int n1=scan.nextInt();
		if(n1>max) {
			max=n1;
			}
		if(n1<min) {
			min=n1;
			}
		}
		System.out.println("Maximum Number is :"+max);
		System.out.println("Minimum Number is :"+min);
	}
}
