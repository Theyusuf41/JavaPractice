package j05_ifStatementTernancyOperators.tasks;
import java.util.Scanner;
public class Task08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihr Password ein: ");
		int pwdInput = input.nextInt();

		if(pwdInput % 5 == 0 && pwdInput %2 ==0){
			System.out.println("Das ist gültig");
		}else if(pwdInput % 5 == 0 && pwdInput %1 ==0){
			System.out.println("Das ist nicht gültig");
		}

		/* Task->
		 Kullanıcıdan password girmesini isteyin.
Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 */

	}

}
