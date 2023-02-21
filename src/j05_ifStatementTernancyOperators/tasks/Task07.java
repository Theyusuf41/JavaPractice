package j05_ifStatementTernancyOperators.tasks;
import java.util.Scanner;
public class Task07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben Sie ein Buschtaben ein");
		char singleLetter = input.next().charAt(0);

		if (singleLetter>='a' && singleLetter<='z') {
			if(singleLetter=='a'){
				System.out.println("Erste kleine Buschtaben ist" + singleLetter);
			}else if(singleLetter!='a'){
				System.out.println("Erste Buschtaben ist kein  a ");
			}
		}else if(singleLetter>='A' && singleLetter<='Z'){
			if(singleLetter=='Z'){
				System.out.println("Erste kleine Buschtaben ist" + singleLetter);
			}else if(singleLetter!='Z'){
				System.out.println("Erste Buschtaben ist kein Z");
			}

		}
		/* Task->
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */

	}

}
