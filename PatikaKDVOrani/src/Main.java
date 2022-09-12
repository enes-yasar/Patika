import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double kdv1 = 0.18, kdv2 = 0.08;
		int tutar;
		System.out.print("Ucret tutarini giriniz: ");
		tutar = scan.nextInt();
		
		double kdvTutar = (tutar>1000) ? kdv2 * tutar : kdv1 * tutar;
		double yeniTutar = tutar + kdvTutar;
		System.out.println("KDV'siz fiyat: " + tutar);
		System.out.println("KDV'li fiyatı: " + yeniTutar);
		System.out.println("KDV tutari: " + kdvTutar);
	}

}
