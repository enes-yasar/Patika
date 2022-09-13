import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int toplam = 0;
		int sayi;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayi giriniz: ");
			sayi = scan.nextInt();
			if (sayi % 2 == 1) {
				break;
			}
			else if (sayi % 2 == 0 && sayi % 4 == 0) {
				toplam += sayi;
				System.out.println("Sayi: " + sayi); 
			}
		}
		System.out.println("Girilen sayilarin toplami: " + toplam);

	}

}
