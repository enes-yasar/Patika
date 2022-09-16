import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,sayi,buyukSayi = 0,kucukSayi = 0;
		
		System.out.print("Kac adet sayi gireceksiniz: ");
		n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i + ". sayiyi giriniz:");
			sayi = input.nextInt();
			if (sayi > buyukSayi) {
				buyukSayi = sayi;
			}
			else if (sayi < kucukSayi) {
				kucukSayi = sayi;
			}
		}
			System.out.println("En Buyuk Sayi: " + buyukSayi);
			System.out.println("En Kucuk Sayi: " + kucukSayi);
	}

}
