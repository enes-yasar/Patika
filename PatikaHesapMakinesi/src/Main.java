import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sayi1, sayi2, secim;

		System.out.print("Ilk sayiyi giriniz: ");
		sayi1 = scan.nextInt();
		System.out.print("Ikinci sayiyi giriniz: ");
		sayi2 = scan.nextInt();

		System.out.println("Islemler:\nToplama icin 1\nCikarma icin 2\n" + "Carpma icin 3\nBolme icin 4' basiniz!");
		System.out.print("Secimi giriniz: ");
		secim = scan.nextInt();
		scan.nextLine();
		switch (secim) {
		case 1:
			System.out.println("Girilen sayiların toplami: " + (sayi1 + sayi2));
			break;
		case 2:
			System.out.println("Girilen sayiların farki: " + (sayi1 - sayi2));
			break;
		case 3:
			System.out.println("Girilen sayilarin carpimi: " + (sayi1 * sayi2));
			break;
		case 4:
			System.out.println("Girilen sayilarin bolumu: " + ((double) sayi1) / sayi2);
			break;
		default:
			System.out.println("Hatali secim!!");
			break;
		}
	}

}
