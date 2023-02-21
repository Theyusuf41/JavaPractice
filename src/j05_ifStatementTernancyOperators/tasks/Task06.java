package j05_ifStatementTernancyOperators.tasks;
import java.util.Scanner;
public class Task06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihr Gender ein");
		String genderInput = input.nextLine();

		if(genderInput.equals("erkek")){
			Scanner input2 = new Scanner(System.in);
			System.out.println("Wie alt sind Sie ? ");
			int age = input2.nextInt();
			if(age>=18){
				System.out.println("Adam");
			}else{
				System.out.println("Cocuk");
			}
		} else if (genderInput.equals("kadin")) {
			Scanner input2 = new Scanner(System.in);
			System.out.println("Wie alt sind Sie ? ");
			int age = input2.nextInt();
			if(age>=18){
				System.out.println("Kadin");
			}else{
				System.out.println("Cocuk");
			}
		}
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */

		
	}
}
