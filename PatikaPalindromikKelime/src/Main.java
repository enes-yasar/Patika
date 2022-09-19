import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kontrol edilecek kelimeyi giriniz:");
		String word = scan.nextLine();
		String newWord = "";
		for (int i = word.length()-1; i >=0; i--) {
			newWord += word.charAt(i);
		}
		if(newWord.equals(word)) {
			System.out.println("Polindromik kelime");
		}
		else {
			System.out.println("Palindromik kelime degil");
		}
	}

}
