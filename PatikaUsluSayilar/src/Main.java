import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tabanSayi,usluSayi;
		int sonuc = 1;
		System.out.print("Taban sayiyi giriniz: ");
		tabanSayi = scan.nextInt();
		System.out.print("Uslu sayiyi giriniz: ");
		usluSayi = scan.nextInt();
		
		for (;usluSayi !=0; --usluSayi) {
			sonuc *= tabanSayi;
		}
		System.out.println("SONUC:" + sonuc);
	}

}
