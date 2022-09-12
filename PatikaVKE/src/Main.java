import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int kilo;
		double boy;
		
		System.out.print("Kilonuzu giriniz: ");
		kilo = scan.nextInt();
		System.out.print("Boyunuzu giriniz(metre cinsinden): ");
		boy = scan.nextDouble();
		
		double vke = kilo / (boy * boy);
		System.out.println("Vucut kitle endeksiniz: " + vke);

	}

}
