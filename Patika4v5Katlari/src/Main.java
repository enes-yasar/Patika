import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int sayi = scan.nextInt();

		for (int i = 1; i < sayi; i++) {
			if (i % 4 == 0 || i % 5 == 0) {

				if (i % 4 == 0) {
					System.out.println("4'un kati: " + i);
				} else if (i % 5 == 0) {
					System.out.println("5'in kati: " + i);
				}
			}
		}
	}

}
