import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int basamakToplami = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int sayi = scan.nextInt();
		while (true) {
			basamakToplami += (sayi % 10);
			sayi = sayi / 10;
			if (sayi % 10 <= 0) {
				break;
			}
		}
		System.out.println("Girilen sayinin basamak toplami: " + basamakToplami);
	}

}
