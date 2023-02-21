package j05_ifStatementTernancyOperators.tasks;
import java.util.Scanner;
public class Task02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the first side: ");
		int a = input.nextInt();
		System.out.print("Enter the length of the second side: ");
		int b = input.nextInt();
		System.out.print("Enter the length of the third side: ");
		int c = input.nextInt();
		if (a == b && b == c) {
			System.out.println("Eşkenar üçgen");
		} else if (a == b || b == c || a == c) {
			System.out.println("Ikizkenar üçgen");
		} else {
			System.out.println("Çeşitkenar üçgen");
		}
	}
}
