import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c;
		Scanner scan = new Scanner(System.in);

		System.out.print("Ilk sayiyi giriniz: ");
		a = scan.nextInt();

		System.out.print("Ikinci sayiyi giriniz: ");
		b = scan.nextInt();

		System.out.print("Ucuncu sayiyi giriniz: ");
		c = scan.nextInt();

		if (a > b && a > c) {
			if (b > c) {
				System.out.println("Kucukten buyuge siralama: " + c + " " + b + " " + a);
			} else if (c > b) {
				System.out.println("Kucukten buyuge siralama: " + b + " " + c + " " + a);
			}
		} else if (b > a && b > c) {
			if (a > c) {
				System.out.println("Kucukten buyuge siralama: " + c + " " + a + " " + b);
			} else if (c > a) {
				System.out.println("Kucukten buyuge siralama: " + a + " " + c + " " + b);
			}
		} else if (c > a && c > b) {
			if (a > b) {
				System.out.println("Kucukten buyuge siralama: " + b + " " + a + " " + c);
			} else if (b > a) {
				System.out.println("Kucukten buyuge siralama: " + a + " " + b + " " + c);
			}
		}

	}

}
