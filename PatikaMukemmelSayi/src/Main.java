import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int toplam = 0;
		while (true) {
			System.out.print("Bir sayi giriniz: ");
			int sayi = input.nextInt();
			if (sayi <= 0) {
				System.out.println("Lutfen pozitif tam sayi giriniz!!");
				
			} 
			else {
				
				for (int i = 1; i < sayi; i++) {
					if (sayi % i == 0) {
						toplam += i;
					}
				}
				if (toplam == sayi) {
					System.out.println(sayi + " sayisi mukemmel sayidir.");
					toplam = 0;
				} 
				else {
					System.out.println(sayi + " sayisi mukemmel sayi degildir.");
					toplam = 0;
				}
			}

		}

	}

}
