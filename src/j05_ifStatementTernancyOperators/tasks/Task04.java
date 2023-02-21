package j05_ifStatementTernancyOperators.tasks;
import java.util.Scanner;
public class Task04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a letter");

		char input1 = input.next().charAt(0); // leng ile de denenecek //


		if((Character.isUpperCase(input1))) {
			System.out.println("Uppercase");
		}else if((Character.isLowerCase(input1))){
			System.out.println("Lowercase");
		}else{
			System.out.println("Invalid");
		}
} 

}
