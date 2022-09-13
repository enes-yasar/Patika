import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz: ");
		int sayi = scan.nextInt();
		double toplam = 0;
		for (double i = 1; i <= sayi; i++) {
			
			toplam += (1/i);
		}
		System.out.println("Harmonik Seri Toplam: " + toplam);

	}

}
