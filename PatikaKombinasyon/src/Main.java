import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n, r, kombinasyon;
		int secim;

		int faktoriyel_n = 1;
		int faktoriyel_r = 1;
		int faktoriyel_fark = 1;
		System.out.print("n sayisini giriniz: ");
		n = scan.nextDouble();

		System.out.print("r sayisini giriniz: ");
		r = scan.nextDouble();
		if (r > n) {
			System.out.println("r sayisi n sayisindan buyuk olamaz lütfen dogru sekilde deger giriniz!");
		}
		if (r < 0 || n < 0) {
			System.out.println("Lutfen pozitif tamsayi giriniz!");
		} else {
			for (int i = 1; i <= n; i++) {
				faktoriyel_n *= i;

			}
			System.out.println("n sayisinin faktoriyeli: " + faktoriyel_n);
			for (int i = 1; i <= r; i++) {
				faktoriyel_r *= i;
			}
			System.out.println("r sayisinin faktoriyeli: " + faktoriyel_r);
			for (int i = 1; i <= n - r; i++) {
				faktoriyel_fark *= i;
			}
			System.out.println("n-r nin faktoriyeli: " + faktoriyel_fark);

			kombinasyon = faktoriyel_n / (faktoriyel_r * faktoriyel_fark);
			System.out.println("C(n,r)'nin kombinasyonu: " + kombinasyon);
		 
				
			
		}
		
	}
}
